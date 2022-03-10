package com.angelsantander.publicaciones.repository;

import com.angelsantander.publicaciones.entity.Publicacion;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface PublicacionesRepository extends CrudRepository<Publicacion,Integer>{
    @Query(value = "select * from publicacion where user_id = :user_id", nativeQuery = true)
    Collection<Publicacion> findUserPubs(@Param("user_id") int user_id);
}
