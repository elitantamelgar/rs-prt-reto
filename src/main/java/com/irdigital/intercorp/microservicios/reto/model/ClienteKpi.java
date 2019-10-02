package com.irdigital.intercorp.microservicios.reto.model;

public class ClienteKpi {
		
		private Double promedioEdad;
		private Double desviacionEstandar;
		
		public ClienteKpi() {
			super();
		}

		public ClienteKpi(Double promedioEdad, Double desviacionEstandar) {
			super();
			this.promedioEdad = promedioEdad;
			this.desviacionEstandar = desviacionEstandar;
		}

		public Double getPromedioEdad() {
			return promedioEdad;
		}

		public void setPromedioEdad(Double promedioEdad) {
			this.promedioEdad = promedioEdad;
		}

		public Double getDesviacionEstandar() {
			return desviacionEstandar;
		}

		public void setDesviacionEstandar(Double desviacionEstandar) {
			this.desviacionEstandar = desviacionEstandar;
		}
}