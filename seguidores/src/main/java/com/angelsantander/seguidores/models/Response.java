package com.angelsantander.seguidores.models;

public class Response<T> {
	
	private T data;
	
	private String status;
	
	public Response() {
		super();
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
