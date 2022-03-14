package com.angelsantander.comentarios.services.remote;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.angelsantander.comentarios.configuraciones.RabbitMQConfig;

import com.angelsantander.comentarios.services.ComentariosService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.angelsantander.comentarios.models.ComentarioDto;

@Component
public class ComentariosConsumer {
    private ComentariosService coment_service;

    public ComentariosConsumer(ComentariosService coment_service) {
        this.coment_service = coment_service;
    }

    @RabbitListener(queues = RabbitMQConfig.QUEUE_COMENTARIOS)
    public void listenConfirmaciones(Message message) throws JsonMappingException, JsonProcessingException {
        String contenido = new String(message.getBody());
        System.out.println(contenido);
        ComentarioDto new_coment_dto;
        ObjectMapper mapper = new ObjectMapper();
        new_coment_dto = mapper.readValue(contenido, ComentarioDto.class);
        coment_service.crearComentario(new_coment_dto);
    }
}
