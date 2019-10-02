package com.irdigital.intercorp.microservicios.reto.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel("- Detalle cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@ApiModelProperty(notes="Nombre cliente")
	@Column(name="nombre")
	private String nombre;
	
	@NotNull
	@ApiModelProperty(notes="Apellido cliente")
	@Column(name="apellido")
	private String apellido;
	
	@NotNull
	@ApiModelProperty(notes="Edad cliente")
	@Column(name="edad")
	private int edad;
	
	
	@Past
	@ApiModelProperty(notes="Fecha nacimiento")
	@Column(name="fecnacimiento")
	private Date fecNacimiento;
	
	
	@ApiModelProperty(notes="Fecha probable fallecimiento")
	@Column(name="fecfallecimiento")
	private Date fecFallecimiento;
	
	

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Cliente(Long id,String nombre, String apellido, int edad,
			Date fecNacimiento,Date fecFallecimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fecNacimiento = fecNacimiento;
		this.fecFallecimiento = fecFallecimiento;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Date getFecNacimiento() {
		return fecNacimiento;
	}

	public void setFecNacimiento(Date fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public Date getFecFallecimiento() {
		return fecFallecimiento;
	}

	public void setFecFallecimiento(Date fecFallecimiento) {
		this.fecFallecimiento = fecFallecimiento;
	}
	
	
	
	
	
}
