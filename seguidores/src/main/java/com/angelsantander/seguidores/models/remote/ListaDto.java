package com.angelsantander.seguidores.models.remote;

import java.util.List;

public class ListaDto {
	private List<Integer> ids_list;

	public List<Integer> getIds_list() {
		return ids_list;
	}

	public void setIds_list(List<Integer> ids_list) {
		this.ids_list = ids_list;
	}

	public ListaDto() {
	}

	public ListaDto(List<Integer> ids_list) {
		this.ids_list = ids_list;
	}
	

}
