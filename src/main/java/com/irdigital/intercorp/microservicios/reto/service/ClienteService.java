package com.irdigital.intercorp.microservicios.reto.service;

import com.irdigital.intercorp.microservicios.reto.model.Cliente;
import com.irdigital.intercorp.microservicios.reto.model.RespuestaJson;

public interface ClienteService {

	public RespuestaJson crearClienteService(Cliente request);
	public RespuestaJson listaCliente();
	public RespuestaJson obtClienteKpi();

}
