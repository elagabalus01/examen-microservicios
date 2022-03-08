package com.angelsantander.publicaciones.repository;

import com.angelsantander.publicaciones.entity.Publicacion;

import org.springframework.data.repository.CrudRepository;

public interface PublicacionesRepository extends CrudRepository<Publicacion,Integer>{
    
}
