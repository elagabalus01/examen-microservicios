package com.angelsantander.publicaciones.models.remote;

public class Comentario {
	private int id;

	private String contenido;

	private int id_usuario;
	
	private int id_publicacion;
	
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

	public Comentario() {
		super();
	}
	
}
