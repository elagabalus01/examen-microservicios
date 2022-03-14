package com.angelsantander.mensajes.controllers;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angelsantander.mensajes.entities.Mensaje;
import com.angelsantander.mensajes.services.MensajesService;
@RestController
@RequestMapping("/api/v1/mensajes")
public class MensajeController {
	
	@Autowired
	private MensajesService mensajes_service;
	
	@PostMapping("/{user_id}")
	public Map<String,Object> todosLosMensajes(){
		Map<String, Object> response = new HashMap<>();
		List<Mensaje> mensajes = mensajes_service.getMensajes();
		response.put("status","200");
		response.put("data",mensajes);
		return response;
	}
	
}
