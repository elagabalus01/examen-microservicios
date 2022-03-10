package com.angelsantander.publicaciones.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.angelsantander.publicaciones.models.PublicacionDto;

import java.util.Date;
import java.text.SimpleDateFormat;

@Entity
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column
    public int user_id;
    
    @Column
    public String contenido;

    @Column
    public String timestamp;

    public Publicacion(){

    }

    public Publicacion(PublicacionDto dto){
    	this.user_id = dto.getUser_id();
        this.contenido = dto.getContenido();
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    }

    public Publicacion(String contenido, int user_id){
    	this.user_id = user_id;
        this.contenido = contenido;
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    }
    	
    public Publicacion(String contenido){
    	this.user_id = -1;
        this.contenido = contenido;
        this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());

    }


    @Override
    public String toString(){
        return "Comentario: "+this.contenido;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
}
