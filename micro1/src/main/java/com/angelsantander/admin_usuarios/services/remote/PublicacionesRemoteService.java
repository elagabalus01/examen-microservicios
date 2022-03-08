package com.angelsantander.admin_usuarios.services.remote;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import com.angelsantander.admin_usuarios.models.remote.Publicacion;

@Service
@FeignClient(name = "publicaciones", url="10.112.209.96:8082")
public interface PublicacionesRemoteService {
    @RequestMapping(method = POST, value = "/api/v1/publicaciones/{id}", produces = "application/json")
    List<Publicacion> getPublicaciones(@PathVariable int id);
}