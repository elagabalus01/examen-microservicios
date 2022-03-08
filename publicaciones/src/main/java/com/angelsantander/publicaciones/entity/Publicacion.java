package com.angelsantander.publicaciones.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column
    public String contenido;

    @Column
    public String timestamp;

    public Publicacion(String contenido){
        this.contenido = contenido;
        this.timestamp = "Ahora";
    }

    @Override
    public String toString(){
        return "Comentario: "+this.contenido;
    }
}
