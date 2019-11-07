package com.spring.rest.crud.dto;

import com.spring.rest.crud.model.Usuarios;

public class UserResponse {

	private int codigo;
	private String mensaje;
	private Usuarios payload;
	//private String payload;
	
	public Usuarios getPayload() {
		return payload;
	}
	public void setPayload(Usuarios payload) {
		this.payload = payload;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	/*public String getPayload() {
		return payload;
	}
	public void setPayload(String payload) {
		this.payload = payload;
	}
	*/
	
}
