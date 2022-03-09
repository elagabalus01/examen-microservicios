package com.angelsantander.admin_usuarios.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;

import com.angelsantander.admin_usuarios.models.UserDto;
@Entity
@Table(name = "usuarios")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nombre;
	
	@Column
	private String paterno;

	@Column
	private String materno;

	@Column
	private String correo;

	@Column
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
	
	public static User fromUserDto(UserDto user){
		User recover_user = new User(user.nombre,user.paterno,user.materno,user.correo,user.contrasenia);

		
		return recover_user;
	}

	@Override
	public String toString(){
		return "Usuario: "+this.nombre+" "+this.paterno+" "+this.materno;
	}
	
}
