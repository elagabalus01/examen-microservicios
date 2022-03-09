package com.angelsantander.admin_usuarios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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

	@PostMapping("/registro")
	public Map<String, String> registro(@RequestBody UserDto new_user){
		Map<String,String> response= new HashMap<>();
		response.put("saludo","Hola mundo");
		response.put("nuevo usuario creado",new_user.nombre+" "+new_user.paterno);
		User user = User.fromUserDto(new_user);
		response.put("Usuario",user.toString());
		user_service.agregar(user);
		return response;
	}



	@PostMapping("/actualizar/{id}")
	public Map<String, String> actualizar(@RequestBody UserDto updated_user, @PathVariable int id){
		Map<String,String> response= new HashMap<>();
		response.put("saludo","Hola mundo");
		response.put("usuario a actualizar",updated_user.nombre+" "+updated_user.paterno);
		user_service.actualizar(id);
		return response;
	}

	@DeleteMapping("/eliminar/{id}")
	public Map<String, String> eliminar(@PathVariable int id){
		Map<String,String> response= new HashMap<>();
		User deleted_user = user_service.eliminar(id);
		if(deleted_user==null){
			response.put("No existe el usuario seleccionado","User id: "+Integer.toString(id));
		}else{
			response.put("Se elimino al usuario","User id: "+Integer.toString(id));
		}
		
		return response;
	}

	@PostMapping("/pubs/{id}")
	public List<Publicacion> publicaciones(@PathVariable int id){
		List<Publicacion>  response = user_service.publicaciones(id);
		return response;
	}

}
