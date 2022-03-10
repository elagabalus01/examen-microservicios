package com.angelsantander.admin_usuarios.models;

public class Response<T> {
	private T data;
	private String status;
	
	public Response() {
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
