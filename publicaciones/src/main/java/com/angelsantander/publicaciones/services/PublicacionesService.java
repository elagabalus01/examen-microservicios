package com.angelsantander.publicaciones.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angelsantander.publicaciones.entity.Publicacion;
import com.angelsantander.publicaciones.models.remote.Comentario;
import com.angelsantander.publicaciones.repository.PublicacionesRepository;
import com.angelsantander.publicaciones.services.remote.ComentariosRemoteService;

@Service
public class PublicacionesService {
    @Autowired
    private PublicacionesRepository publicacion_repo;

    @Autowired
    private ComentariosRemoteService coment_service;
    
    public Publicacion guardar(Publicacion new_pub){
        return publicacion_repo.save(new_pub);
    }
    
    public List<Publicacion> publicaciones_user(int id){
    	List<Publicacion> publicaciones = new ArrayList<>();
    	publicacion_repo.findUserPubs(id).forEach(publicaciones::add);
        return publicaciones;
    }
    
    public List<Comentario> getPubComents(int id){
    	List<Comentario> comentarios = new ArrayList<>();
    	comentarios = coment_service.getComentarios(id).getData();
        return comentarios;
    }
    
}
