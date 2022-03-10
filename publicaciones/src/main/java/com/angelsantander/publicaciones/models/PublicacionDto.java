package com.angelsantander.publicaciones.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PublicacionDto {
	
    public int user_id;
    
    public String contenido;

    public PublicacionDto() {
		// TODO Auto-generated constructor stub
	}

    @Override
    public String toString(){
        return "Comentario: "+this.contenido;
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
}
