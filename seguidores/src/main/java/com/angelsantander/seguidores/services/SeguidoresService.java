package com.angelsantander.seguidores.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.angelsantander.seguidores.repositories.SeguidoresRepository;

@Service
public class SeguidoresService {
	@Autowired
	private SeguidoresRepository seguidores_repo;
	
	public List<Integer> getAllSeguidores(int id){
		return seguidores_repo.getAllSeguidores(id);
	}
}
