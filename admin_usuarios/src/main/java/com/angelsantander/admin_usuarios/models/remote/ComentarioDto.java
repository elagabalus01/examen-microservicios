package com.angelsantander.admin_usuarios.models.remote;

import java.io.Serializable;

public class ComentarioDto implements Serializable{
	private String contenido;
	
	private int id_usuario;
	
	private int id_publicacion;

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

	public ComentarioDto(String contenido, int id_usuario, int id_publicacion) {
		this.contenido = contenido;
		this.id_usuario = id_usuario;
		this.id_publicacion = id_publicacion;
	}

	public ComentarioDto() {
	}
	
}
