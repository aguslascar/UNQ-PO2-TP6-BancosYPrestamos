package ar.edu.unq.po2.tp6;

public class SolicitudHipotecario extends SolicitudDeCredito{
	
	private Propiedad garantia;
	
	public SolicitudHipotecario(Cliente cliente, int monto, int plazo, Propiedad garantia) {
		this.cliente = cliente;
		this.monto = monto;
		this.plazo = plazo;
		this.garantia = garantia;
	}
	
	public boolean chequearSolicitud() {
		/**
		 * Chequea si el cliente cumple con los requisitos del credito.
		 * Es decir que el monto de la cuota no supere el 50% del sueldo neto mensual,
		 * que el monto total del credito no supere el 70% del valor fiscal de la propiedad dada
		 * como garantia y que la persona no supere los 65 años antes de terminar de pagar el
		 * credito.
		 */
		return this.montoCuotaMensual() < this.cliente.sueldoNetoMensual()
				&& this.monto < garantia.valorFiscal() * 0.7
				&& this.cliente.edad() + (this.plazo / 12) < 65;
	}
}
