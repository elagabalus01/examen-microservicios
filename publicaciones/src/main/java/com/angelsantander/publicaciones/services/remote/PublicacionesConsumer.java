package com.angelsantander.publicaciones.services.remote;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.angelsantander.publicaciones.configuraciones.RabbitMQConfig;

import com.angelsantander.publicaciones.services.PublicacionesService;
import com.angelsantander.publicaciones.entity.Publicacion;

@Component
public class PublicacionesConsumer {
    private PublicacionesService pub_service;

    public PublicacionesConsumer(PublicacionesService pub_service) {
        this.pub_service = pub_service;
    }

    @RabbitListener(queues = RabbitMQConfig.QUEUE_PUBLICACIONES)
    public void listenConfirmaciones(Message message) {
        String contenido = new String(message.getBody());
        Publicacion new_pub = new Publicacion(contenido);
        pub_service.guardar(new_pub);
    }
}
