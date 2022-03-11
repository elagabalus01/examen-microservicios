package com.angelsantander.publicaciones.controllers;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.angelsantander.publicaciones.entity.Publicacion;
import com.angelsantander.publicaciones.services.PublicacionesService;

import java.util.List;

import com.angelsantander.publicaciones.models.PublicacionDto;

@RestController
@RequestMapping("api/v1/publicaciones")
public class PublicacionesController {
    
    @Autowired
    private PublicacionesService pub_service;

    @PostMapping("/create")
    public Map<String, Object> crear(@RequestBody PublicacionDto nueva_publicacion){
        Map<String, Object> reponse = new HashMap<>();
        Publicacion new_pub = new Publicacion(nueva_publicacion);
        pub_service.guardar(new_pub);
        reponse.put("status", "200");
        reponse.put("data", "Publicando: "+nueva_publicacion);
        return reponse;
    }

    @PostMapping("/{id}")
    public Map<String,Object> publicaciones(@PathVariable int id){
    	Map<String, Object> response = new HashMap<>();
        List<Publicacion> resultados = pub_service.publicaciones_user(id);
        response.put("status","200");
        response.put("data",resultados);
        return response;
    }

}
