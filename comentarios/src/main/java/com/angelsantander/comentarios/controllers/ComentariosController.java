package com.angelsantander.comentarios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.HashMap;


import com.angelsantander.comentarios.entities.Comentario;
import com.angelsantander.comentarios.models.ComentarioDto;
import com.angelsantander.comentarios.services.ComentariosService;

@RestController
@RequestMapping(path = "api/v1/comentarios")
public class ComentariosController {
	
	@Autowired
	private ComentariosService coment_serv;
	
	@PostMapping(value = "/{post_id}")
	public Map<String,Object> comentarioDePub(@PathVariable int post_id) {
		Map<String,Object> response = new HashMap<>();
		List<Comentario> comentarios;
		comentarios = coment_serv.pub_coments(post_id);
		response.put("status", "200");
		response.put("data", comentarios);
		return response;
	}

	@PostMapping(value = "/crear/{post_id}")
	public Map<String,Object> comentarioEnPub(@RequestBody ComentarioDto nuevo_comentario) {
		Map<String,Object> response = new HashMap<>();
		Comentario comentario = coment_serv.crearComentario(nuevo_comentario);
		response.put("status","200");
		response.put("data",comentario);
		return response;
	}

	
}
