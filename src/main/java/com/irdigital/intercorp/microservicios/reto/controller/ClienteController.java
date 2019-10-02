package com.irdigital.intercorp.microservicios.reto.controller;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.irdigital.intercorp.microservicios.reto.model.Cliente;
import com.irdigital.intercorp.microservicios.reto.model.RespuestaJson;
import com.irdigital.intercorp.microservicios.reto.repositorio.ClienteRepositorio;
import com.irdigital.intercorp.microservicios.reto.service.ClienteService;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	
	private static final Logger logger_trasa = LoggerFactory.getLogger(ClienteController.class);
	
	@Autowired
	private ClienteService clienteService;

	@CrossOrigin
	@PostMapping("/creacliente")
	@ResponseBody
	public RespuestaJson crearCliente(@Valid @RequestBody Cliente cliente){
		logger_trasa.info("cliente a registrar ---->"+cliente.toString());
		
		return clienteService.crearClienteService(cliente);

	}
	
	@CrossOrigin
	@GetMapping(value = "/listclientes")
	@ResponseBody
	public RespuestaJson listaCliente() {		
		
		return clienteService.listaCliente();
		
	}
	
	@CrossOrigin
	@GetMapping(value = "/kpideclientes")
	@ResponseBody
	public RespuestaJson obtClienteKpi() {		
		
		return clienteService.obtClienteKpi();
		
	}
	

}
