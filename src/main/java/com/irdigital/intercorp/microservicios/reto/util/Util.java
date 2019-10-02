package com.irdigital.intercorp.microservicios.reto.util;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.irdigital.intercorp.microservicios.reto.model.Cliente;

public class Util {
	
	
	public static Date getFechaFallecimiento(Cliente cliente) {
		Double aniosResultado = (Constantes.ESPERANZA_VIDA_PERU_2016 - cliente.getEdad());
		//System.out.println("aniosResultado --- >"+aniosResultado);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		calendar.add(Calendar.YEAR, aniosResultado.intValue());
		
		return calendar.getTime();

	}
	// 
	public static double[] obtListaEdad(List<Cliente> listaCliente) {

		double[] listaEdad = new double[listaCliente.size()];
		int i = 0;
		for (Cliente cliente : listaCliente) {
			double val = Double.valueOf(cliente.getEdad());
			listaEdad[i++] = val;
		}

		return listaEdad;
	}

	public static double calcularPromedio(double numeros[]) {
		double total = 0.0;
		double promedio = 0.0;

		for (double num : numeros) {
			total += num;
		}

		promedio = total / numeros.length;
		//System.out.println("promedio ====>  " + promedio);
		return promedio;
	}

	public static double calcularDesviacionEstandar(double numArray[]) {
		double desviacionEstandar = 0.0;
		double promedio = Util.calcularPromedio(numArray);

		for (double num : numArray) {
			desviacionEstandar += Math.pow(num - promedio, 2);
		}

		return Math.sqrt(desviacionEstandar / numArray.length);
	}

}
