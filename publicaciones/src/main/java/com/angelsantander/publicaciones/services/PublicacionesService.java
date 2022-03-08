package com.angelsantander.publicaciones.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angelsantander.publicaciones.entity.Publicacion;
import com.angelsantander.publicaciones.repository.PublicacionesRepository;

@Service
public class PublicacionesService {
    @Autowired
    private PublicacionesRepository publicacion_repo;

    public Publicacion guardar(Publicacion new_pub){
        return publicacion_repo.save(new_pub);
    }
    

    
}
