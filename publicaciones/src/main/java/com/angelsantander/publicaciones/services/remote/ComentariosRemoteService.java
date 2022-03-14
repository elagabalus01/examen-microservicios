package com.angelsantander.publicaciones.services.remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


import com.angelsantander.publicaciones.models.remote.Comentario;
import com.angelsantander.publicaciones.models.Response;
@Service
@FeignClient(name = "comentarios", url = "comentarios:8084")
public interface ComentariosRemoteService {
    @RequestMapping(method = RequestMethod.POST, value="/api/v1/comentarios/{id}", produces = "application/json")
    Response<List<Comentario>> getComentarios(@PathVariable int id);
}