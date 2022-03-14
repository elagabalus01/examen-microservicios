package com.angelsantander.seguidores.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.angelsantander.seguidores.models.remote.ListaDto;
import com.angelsantander.seguidores.models.remote.User;
import com.angelsantander.seguidores.repositories.SeguidoresRepository;
import com.angelsantander.seguidores.services.remote.DatosSeguidoresRemoteService;

@Service
public class SeguidoresService {
	@Autowired
	private SeguidoresRepository seguidores_repo;
	
	@Autowired
	private DatosSeguidoresRemoteService datos_seguidores_remote_service;
	
	public List<Integer> getAllSeguidores(int id){
		return seguidores_repo.getAllSeguidores(id);
	}
	
	public List<User> getAllDatosSeguidores(int id){
		return datos_seguidores_remote_service.getDatosUsuarios(
				new ListaDto(seguidores_repo.getAllSeguidores(id))
		).getData();
	}
}
