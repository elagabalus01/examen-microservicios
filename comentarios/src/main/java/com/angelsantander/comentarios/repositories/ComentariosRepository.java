package com.angelsantander.comentarios.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.angelsantander.comentarios.entities.Comentario;

@Repository
public interface ComentariosRepository extends CrudRepository<Comentario,Integer> {
		@Query(value = "select * from comentario where id_publicacion = :id_publicacion", nativeQuery = true)
		public List<Comentario> getAllComentarios(@Param(value = "id_publicacion" ) int id_pulicacion); 
}
