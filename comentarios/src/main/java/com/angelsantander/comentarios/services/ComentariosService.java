package com.angelsantander.comentarios.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.angelsantander.comentarios.repositories.ComentariosRepository;
import com.angelsantander.comentarios.entities.Comentario;
import com.angelsantander.comentarios.models.ComentarioDto;

@Service
public class ComentariosService {
	@Autowired
	private ComentariosRepository coment_repo;
	
	public List<Comentario> pub_coments(int publication_id){
		return coment_repo.getAllComentarios(publication_id);
	}
	
	public Comentario crearComentario(ComentarioDto nuevo_comentario) {
		Comentario comentario = new Comentario(nuevo_comentario);  
		coment_repo.save(comentario);
		return comentario;
	}
}
