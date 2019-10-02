package com.irdigital.intercorp.microservicios.reto.service.imple;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irdigital.intercorp.microservicios.reto.model.Cliente;
import com.irdigital.intercorp.microservicios.reto.model.ClienteKpi;
import com.irdigital.intercorp.microservicios.reto.model.RespuestaJson;
import com.irdigital.intercorp.microservicios.reto.repositorio.ClienteRepositorio;
import com.irdigital.intercorp.microservicios.reto.service.ClienteService;
import com.irdigital.intercorp.microservicios.reto.util.Constantes;
import com.irdigital.intercorp.microservicios.reto.util.Util;

@Service
public class ClienteServiceImp implements ClienteService {
	
	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	
	@Override
	public RespuestaJson crearClienteService(Cliente cliente) {
		// TODO Auto-generated method stub
		RespuestaJson respuesta;
		
		try {
			cliente.setFecFallecimiento(Util.getFechaFallecimiento(cliente));
			Cliente savedCliente = clienteRepositorio.save(cliente);
			HashMap<String, Object> rsp = new HashMap<>();
			rsp.put("id", savedCliente.getId());
			respuesta = new RespuestaJson(Constantes.SUCCESS, Constantes.TITULO_RPTA_OK_STRING,
					Constantes.TITULO_RPTA_OK_STRING, rsp);
			
		} catch (Exception e) {
			System.err.println(e);
			respuesta = new RespuestaJson(Constantes.ERROR, Constantes.TITULO_RPTA_ERROR_STRING,
					Constantes.TITULO_RPTA_ERROR_STRING, null);
		}
		

		return respuesta;
	}


	@Override
	public RespuestaJson listaCliente() {
		// TODO Auto-generated method stub
		RespuestaJson respuesta;

		try {
			
				List<Cliente> listaCliente = clienteRepositorio.findAll();

		
				if (listaCliente.isEmpty()) {

					return new RespuestaJson(Constantes.SUCCESS, Constantes.TITULO_RPTA_OK_BUSQUEDA,
							Constantes.MSG_RPTA_BUSQUEDA_NO_DATA, null);
				} else {

					respuesta = new RespuestaJson(Constantes.SUCCESS, Constantes.TITULO_RPTA_OK_BUSQUEDA,
							Constantes.MSG_RPTA_BUSQUEDA_OK_STRING, listaCliente);
				}


		} catch (Exception e) {
			respuesta = new RespuestaJson(Constantes.ERROR, Constantes.TITULO_RPTA_ERROR_STRING,
					Constantes.TITULO_RPTA_ERROR_STRING, null);
		} 
		return respuesta;
	}


	@Override
	public RespuestaJson obtClienteKpi() {
		// TODO Auto-generated method stub
		RespuestaJson respuesta;

		try {
			
				ClienteKpi clienteKpi = new ClienteKpi();
				List<Cliente> listaCliente = clienteRepositorio.findAll();
				
				if (listaCliente.isEmpty()) {

					return new RespuestaJson(Constantes.SUCCESS, Constantes.TITULO_RPTA_OK_BUSQUEDA,
							Constantes.MSG_RPTA_BUSQUEDA_NO_DATA, null);
				}else {
					
					clienteKpi.setPromedioEdad(Util.calcularPromedio(Util.obtListaEdad(listaCliente)));
					clienteKpi.setDesviacionEstandar(Util.calcularDesviacionEstandar(Util.obtListaEdad(listaCliente)));

					respuesta = new RespuestaJson(Constantes.SUCCESS, Constantes.TITULO_RPTA_OK_BUSQUEDA,
								Constantes.MSG_RPTA_BUSQUEDA_OK_STRING, clienteKpi);
				}

		} catch (Exception e) {
			respuesta = new RespuestaJson(Constantes.ERROR, Constantes.TITULO_RPTA_ERROR_STRING,
					Constantes.TITULO_RPTA_ERROR_STRING, null);
		} 
		return respuesta;
	}
	
	

}
