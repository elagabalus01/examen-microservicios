package com.angelsantander.admin_usuarios.services;

import com.netflix.discovery.converters.Auto;

import com.thoughtworks.xstream.mapper.Mapper.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.stereotype.Service;

import com.angelsantander.admin_usuarios.repository.UserRepository;

import java.util.Optional;
import java.util.List;
import java.util.ArrayList;

import com.angelsantander.admin_usuarios.entity.User;
import com.angelsantander.admin_usuarios.models.remote.Publicacion;
import com.angelsantander.admin_usuarios.services.remote.PublicacionesRemoteService;

import com.angelsantander.admin_usuarios.services.remote.PublicacionesProducer;
import com.angelsantander.admin_usuarios.services.remote.ComentariosProducer;
import com.angelsantander.admin_usuarios.models.remote.ComentarioDto;


@Service
public class AdminUsuarioService {
    @Autowired
    private UserRepository user_repo;
    
    @Autowired
    private  PublicacionesRemoteService pub_remote;
    
    
    private  ComentariosProducer comentario_producer;

    private PublicacionesProducer pub_producer;

    public AdminUsuarioService(PublicacionesProducer pub_producer, ComentariosProducer comentario_producer){
        this.pub_producer = pub_producer;
        this.comentario_producer = comentario_producer;
    }

    public void agregar(User new_user){

        user_repo.save(new_user);
    }
    
    public User eliminar(int id){

        Optional<User> user_to_delete = Optional.empty();
        user_to_delete = user_repo.findById(id);
        if (user_to_delete.isPresent()){
            user_repo.delete(user_to_delete.get());
            return user_to_delete.get();
        }else{
            return null;
        }
    }

    public User actualizar(int id){

        Optional<User> user_to_update = Optional.empty();
        user_to_update = user_repo.findById(id);
        if (user_to_update.isPresent()){
            user_repo.save(user_to_update.get());
            return user_to_update.get();
        }else{
            return null;
        }
    }

    public Iterable<User> lista_usuarios(List<Integer> ids){
        return user_repo.findAllById(ids);
    }
    
    public List<Publicacion> publicaciones(int id){
        return pub_remote.getPublicaciones(id).getData();
    }

    public void comentar_publicacion(String comentario){
        comentario_producer.sendMessage(comentario);
        return;
    }

    public void publicar(String contenido){
        pub_producer.sendMessage(contenido);
    }

    public List<User> todos(){
    	List<User> todos = new ArrayList<>();
        user_repo.findAll().forEach(todos::add);
        return todos;
    }
}
