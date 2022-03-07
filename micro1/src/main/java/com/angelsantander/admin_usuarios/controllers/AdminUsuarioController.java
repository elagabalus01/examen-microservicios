package com.angelsantander.admin_usuarios.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.vavr.collection.Map;

@RestController
@RequestMapping("api/v1/usuario")
public class AdminUsuarioController {
	@PostMapping("/registro")
	public String registro(){
		return "Usuario registrado";
	}
}
