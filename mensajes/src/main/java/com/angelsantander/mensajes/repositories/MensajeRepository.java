package com.angelsantander.mensajes.repositories;

import java.util.List;

import javax.persistence.Query;

import org.springframework.data.repository.CrudRepository;
import com.angelsantander.mensajes.entities.Mensaje;

public interface MensajeRepository extends CrudRepository<Mensaje, Integer> {
	
}
