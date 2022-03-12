package com.angelsantander.mensajes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mensaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String contenido;
	
	
	@Column
	private int id_user_sender;
	
	@Column
	private int id_user_reciver;
	
	@Column
	private String timestamp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getId_user_sender() {
		return id_user_sender;
	}

	public void setId_user_sender(int id_user_sender) {
		this.id_user_sender = id_user_sender;
	}

	public int getId_user_reciver() {
		return id_user_reciver;
	}

	public void setId_user_reciver(int id_user_reciver) {
		this.id_user_reciver = id_user_reciver;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Mensaje(int id, String contenido, int id_user_sender, int id_user_reciver, String timestamp) {
		super();
		this.id = id;
		this.contenido = contenido;
		this.id_user_sender = id_user_sender;
		this.id_user_reciver = id_user_reciver;
		this.timestamp = timestamp;
	}

	public Mensaje() {
		super();
	}
	
	
	
}
