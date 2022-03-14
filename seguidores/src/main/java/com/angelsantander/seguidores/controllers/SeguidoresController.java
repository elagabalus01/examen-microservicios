package com.angelsantander.seguidores.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import com.angelsantander.seguidores.models.Response;
import com.angelsantander.seguidores.models.remote.User;
import com.angelsantander.seguidores.services.SeguidoresService;
@RestController
@RequestMapping(path = "api/v1/seguidores")
public class SeguidoresController {
	
	@Autowired
	private SeguidoresService seguidores_service;
	
	@PostMapping("/{id}")
	public Map<String,Object> getSeguidores(@PathVariable(name = "id") int id){
		Map<String,Object> response = new HashMap<>();
		List<Integer> lista_seguidores = seguidores_service.getAllSeguidores(id);
		response.put("data", lista_seguidores);
		response.put("status", "200");
		return response;
	}
	
	@PostMapping("/{id}/datos")
	public Map<String,Object> getSeguidoresDatos(@PathVariable(name = "id") int id){
		Map<String,Object> response = new HashMap<>();
		List<User> lista_seguidores = seguidores_service.getAllDatosSeguidores(id);
		response.put("data", lista_seguidores);
		response.put("status", "200");
		return response;
	}
	
}
