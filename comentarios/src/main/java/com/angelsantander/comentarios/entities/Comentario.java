package com.angelsantander.comentarios.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.angelsantander.comentarios.models.ComentarioDto;

import javax.persistence.GenerationType;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Comentario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String contenido;
	
	@Column
	private int id_usuario;
	
	@Column
	private int id_publicacion;
	
	@Column
	private String datetime;

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

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public int getId_publicacion() {
		return id_publicacion;
	}

	public void setId_publicacion(int id_publicacion) {
		this.id_publicacion = id_publicacion;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public Comentario(int id, String contenido, int id_usuario, int id_publicacion, String datetime) {
		super();
		this.id = id;
		this.contenido = contenido;
		this.id_usuario = id_usuario;
		this.id_publicacion = id_publicacion;
		this.datetime = datetime;
	}
	
	public Comentario(ComentarioDto dto) {
		this.contenido = dto.getContenido();
		this.id_usuario = dto.getId_usuario();
		this.id_publicacion = dto.getId_publicacion();
		this.datetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
	
	public Comentario() {
		super();
	}
	
}
