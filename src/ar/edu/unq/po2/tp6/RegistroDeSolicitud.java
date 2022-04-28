package ar.edu.unq.po2.tp6;

public class RegistroDeSolicitud {

	public SolicitudDeCredito crearSolicitud(Cliente cliente, String tipo, int monto, int plazo) {
		SolicitudDeCredito solicitud;
		if(tipo == "credito personal") {
			solicitud = new SolicitudPersonal(cliente, monto, plazo);
		}
		else {
			solicitud = new SolicitudHipotecario(cliente, monto, plazo, cliente.garantia());
		}
		
		return solicitud;
		
	}

}
