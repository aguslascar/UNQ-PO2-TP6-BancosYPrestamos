package ar.edu.unq.po2.tp6;

public abstract class SolicitudDeCredito {
	protected Cliente cliente;
	protected int monto;
	protected int plazo;
	
	public int montoCuotaMensual() {
		/**
		 * Retorna el valor de la cuota mensual, segun el monto total y el plazo del credito.
		 */
		return this.monto / this.plazo;
	}
	public int montoTotal() {
		return monto;
	}
	public abstract boolean chequearSolicitud();
}
