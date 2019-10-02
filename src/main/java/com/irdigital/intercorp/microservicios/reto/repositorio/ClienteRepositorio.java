package com.irdigital.intercorp.microservicios.reto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.irdigital.intercorp.microservicios.reto.model.Cliente;

public interface ClienteRepositorio extends JpaRepository<Cliente, Long> {

}
