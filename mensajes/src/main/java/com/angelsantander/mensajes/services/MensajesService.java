package com.angelsantander.mensajes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.angelsantander.mensajes.entities.Mensaje;
import com.angelsantander.mensajes.repositories.MensajeRepository;

@Service
public class MensajesService {
	@Autowired
	private MensajeRepository mensajes_repo;
	@Autowired
	EntityManager manager;
	
	public List<Mensaje> getMensajes(){
		List<Mensaje> mensajes = new ArrayList<>();
		mensajes_repo.findAll().forEach(mensajes::add);
		return mensajes;
	}
	
	
}
