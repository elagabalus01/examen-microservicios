package com.angelsantander.seguidores.models.remote;

public class User {
	private int id;
	private String nombre;
	private String paterno;
	private String materno;
	private String correo;
	private String contrasenia;

	public User(){
	}

	public User(String nombre, String paterno, String materno, String correo, String contrasenia){
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.correo = correo;
		this.contrasenia = contrasenia;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	@Override
	public String toString(){
		return "Usuario: "+this.nombre+" "+this.paterno+" "+this.materno;
	}
	
}
