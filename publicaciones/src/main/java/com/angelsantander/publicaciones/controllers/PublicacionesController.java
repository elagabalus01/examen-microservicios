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

@RestController
@RequestMapping("api/v1/publicaciones")
public class PublicacionesController {
    
    @Autowired
    private PublicacionesService pub_service;

    @PostMapping("/create")
    public Map<String, String> crear(@RequestBody String contenido){
        Map<String, String> reponse = new HashMap<>();
        Publicacion new_pub = new Publicacion(contenido);
        pub_service.guardar(new_pub);
        reponse.put("Hola", "Mundo");
        return reponse;
    }


    @PostMapping("/{id}")
    public List<Publicacion> publicaciones(@PathVariable int id){
        List<Publicacion> resultados = new ArrayList<>();
        Publicacion pub_aux = new Publicacion("Homa mudno");
        System.out.println(pub_aux);

        resultados.add(pub_aux);
        pub_aux = new Publicacion("Hola mundo 2");
        resultados.add(pub_aux);
        pub_aux = new Publicacion("Hola mundo 3");
        resultados.add(pub_aux);
        return resultados;
    }

}
