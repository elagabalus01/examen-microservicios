package com.angelsantander.admin_usuarios.services.remote;


import java.util.ArrayList;
import java.util.List;

import com.angelsantander.admin_usuarios.models.Response;
import com.angelsantander.admin_usuarios.models.remote.Publicacion;

public class PublicacionesRemoteFallback implements PublicacionesRemoteService {

	@Override
	public Response<List<Publicacion>> getPublicaciones(int id) {
		Response<List<Publicacion>> response = new Response<List<Publicacion>>();
		List<Publicacion> publicaciones = new ArrayList<>();
		response.setStatus("-200");
		response.setData(publicaciones);
		return response;
	}
	
}
