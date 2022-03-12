package com.angelsantander.mensajes.repositories;

import org.springframework.data.repository.CrudRepository;
import com.angelsantander.mensajes.entities.Mensaje;

public interface MensajeRepository extends CrudRepository<Mensaje, Integer> {
	
}
