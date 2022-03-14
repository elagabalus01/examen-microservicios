package com.angelsantander.seguidores.services.remote;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import com.angelsantander.seguidores.models.remote.ListaDto;
import com.angelsantander.seguidores.models.Response;
import com.angelsantander.seguidores.models.remote.User;


@Service
@FeignClient(name = "usuarios", url="usuarios:8081")
public interface DatosSeguidoresRemoteService {
	@RequestMapping(method = POST, value = "/api/v1/usuario/lista_usuarios", produces = "application/json")
    Response<List<User>> getDatosUsuarios(@RequestBody ListaDto ids_list);
}
