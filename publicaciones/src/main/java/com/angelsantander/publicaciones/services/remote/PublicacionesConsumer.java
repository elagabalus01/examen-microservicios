package com.angelsantander.publicaciones.services.remote;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.angelsantander.publicaciones.configuraciones.RabbitMQConfig;

import com.angelsantander.publicaciones.services.PublicacionesService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.angelsantander.publicaciones.entity.Publicacion;

import com.angelsantander.publicaciones.models.PublicacionDto;

@Component
public class PublicacionesConsumer {
    private PublicacionesService pub_service;

    public PublicacionesConsumer(PublicacionesService pub_service) {
        this.pub_service = pub_service;
    }

    @RabbitListener(queues = RabbitMQConfig.QUEUE_PUBLICACIONES)
    public void listenConfirmaciones(Message message) throws JsonMappingException, JsonProcessingException {
        String contenido = new String(message.getBody());
        System.out.println(contenido);
        PublicacionDto new_post;
        ObjectMapper mapper = new ObjectMapper();
        new_post = mapper.readValue(contenido, PublicacionDto.class);
        Publicacion new_pub = new Publicacion(new_post);
        pub_service.guardar(new_pub);
    }
}
