package ar.edu.unq.po2.tp6;

public class SolicitudPersonal extends SolicitudDeCredito{
	
	public SolicitudPersonal(Cliente cliente, int monto, int plazo) {
		this.cliente = cliente;
		this.monto = monto;
		this.plazo = plazo;
	}
	
	public boolean chequearSolicitud() {
		/**
		 * Chequea si el cliente cumple con los requisitos del credito.
		 * Es decir que su sueldo neto anual sea mayor a 15000 
		 * y que el monto del credito no supere el 70% de su sueldo neto mensual.
		 */
		return cliente.sueldoNetoAnual() > 15000 
				&& (this.montoCuotaMensual() * 0.7) < cliente.sueldoNetoMensual();
	}
}
