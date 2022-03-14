package com.angelsantander.admin_usuarios.configuracion;

public class ConectionException extends RuntimeException {
	private final int errorStatus;
	private final String payload;

	public ConectionException(String message, int errorStatus, String payload) {
		super(message);
		this.errorStatus = errorStatus;
		this.payload = payload;
	}

	public int getErrorStatus() {
		return errorStatus;
	}

	public String getPayload() {
		return payload;
	}

}
