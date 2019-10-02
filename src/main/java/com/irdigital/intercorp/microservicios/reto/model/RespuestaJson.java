package com.irdigital.intercorp.microservicios.reto.model;

public class RespuestaJson {

	private String tipo;
	private String mensaje;
	private String titulo;
	private Object data;
	
	public RespuestaJson(String tipo, String titulo,String mensaje, Object data) {
		super();
		this.data = data;
		this.tipo = tipo;
		this.mensaje = mensaje;
		this.titulo = titulo;
	}

	/**
	 * Constructor por defecto
	 */
	public RespuestaJson() {
		super();
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

}
