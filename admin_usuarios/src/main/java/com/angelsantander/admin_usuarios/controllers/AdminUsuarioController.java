package com.angelsantander.admin_usuarios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.HashMap;
import java.util.List;



import com.angelsantander.admin_usuarios.models.UserDto;
import com.angelsantander.admin_usuarios.models.remote.Publicacion;
import com.angelsantander.admin_usuarios.entity.User;

import com.angelsantander.admin_usuarios.services.AdminUsuarioService;

@RestController
@RequestMapping("api/v1/usuario")
public class AdminUsuarioController {

	@Autowired
	public AdminUsuarioService user_service;

	@GetMapping("/")
	public Map<String, Object> todos(){
		Map<String,Object> response = new HashMap<>();
		List<User> all_users;
		response.put("status","200");
		all_users = user_service.todos();
		response.put("data",all_users);
		return response;
	}

	@PostMapping("/registro")
	public Map<String, Object> registro(@RequestBody UserDto new_user){
		Map<String,Object> response= new HashMap<>();
		response.put("status","200");
		User user = User.fromUserDto(new_user);
		user_service.agregar(user);
		response.put("data",user);
		return response;
	}



	@PostMapping("/actualizar/{id}")
	public Map<String, Object> actualizar(@RequestBody UserDto updated_user, @PathVariable int id){
		Map<String,Object> response= new HashMap<>();
		response.put("status","200");
		User user = user_service.actualizar(id);
		response.put("data",user);
		return response;
	}

	@DeleteMapping("/eliminar/{id}")
	public Map<String, Object> eliminar(@PathVariable int id){
		Map<String,Object> response= new HashMap<>();
		User deleted_user = user_service.eliminar(id);
		response.put("status","200");
		if(deleted_user==null){
			response.put("data","No existe el usuario seleccionado user id: "+Integer.toString(id));
		}else{
			response.put("data","Se elimino el usuario seleccionado id: "+Integer.toString(id));
		}
		return response;
	}

	@PostMapping("/pubs/{id}")
	public List<Publicacion> publicaciones(@PathVariable int id){
		List<Publicacion>  response = user_service.publicaciones(id);
		return response;
	}

	@PostMapping("/{id}/publicar")
	public Map<String,Object> publicar(@RequestBody String contenido, @PathVariable int id){
		Map<String, Object> response = new HashMap<>();
		response.put("status","200");
		user_service.publicar(contenido);
		response.put("data","Publicando: "+contenido);
		return response;
	}
}
