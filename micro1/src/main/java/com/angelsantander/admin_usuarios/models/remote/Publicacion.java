package com.angelsantander.admin_usuarios.models.remote;

public class Publicacion {
    public int id;
    public String contenido;
    public String timestamp;
    public Publicacion(String contenido){
        this.contenido = contenido;
        this.timestamp = "Ahora";
    }

    public Publicacion(){
    }
}