package com.angelsantander.admin_usuarios.services.remote;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import com.angelsantander.admin_usuarios.configuracion.RabbitMQConfig;

@Component
public class PublicacionesProducer {

	private RabbitTemplate rabbitTemplate;

	public PublicacionesProducer(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	public void sendMessage(String contractEvent) {
		rabbitTemplate.convertAndSend(RabbitMQConfig.QUEUE_PUBLICACIONES, contractEvent);
	}
}
