package com.angelsantander.admin_usuarios.services.remote;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import com.angelsantander.admin_usuarios.configuracion.RabbitMQConfig;
import com.angelsantander.admin_usuarios.models.remote.ComentarioDto;

@Component
public class ComentariosProducer {

	private RabbitTemplate rabbitTemplate;

	public ComentariosProducer(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	public void sendMessage(String contractEvent) {
		System.out.println(contractEvent);
		rabbitTemplate.convertAndSend(RabbitMQConfig.QUEUE_COMENTARIOS, contractEvent);
	}
}
