package com.angelsantander.comentarios.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


import com.angelsantander.comentarios.entities.Comentario;
import com.angelsantander.comentarios.services.ComentariosService;

@RestController
@RequestMapping(path = "api/v1/comentarios")
public class ComentariosController {
	
	@Autowired
	private ComentariosService coment_serv;
	
	@PostMapping(value = "/{post_id}")
	public List<Comentario> comentarioDePub(@PathVariable int post_id) {
		List<Comentario> comentarios;
		comentarios = coment_serv.pub_coments(post_id);
		
		return comentarios;
	}

}
