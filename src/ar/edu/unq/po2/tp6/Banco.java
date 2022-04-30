package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<SolicitudDeCredito> solicitudes = new ArrayList<SolicitudDeCredito>();
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void registrarSolicitud(Cliente cliente) {
		/**
		 * Chequea primero si la solicitud del cliente es aceptada y de ser asi, la registra.
		 */
		if(this.tieneSolicitudAceptable(cliente)) {
			this.solicitudes.add(cliente.solicitudCredito());
		}
	}
	
	private boolean tieneSolicitudAceptable(Cliente cliente) {
		/**
		 * Evalua si la solicitud que hizo el cliente es apta para darle el credito.
		 */
		return cliente.solicitudCredito().chequearSolicitud();
	}

	public List<SolicitudDeCredito> solicitudes() {
		return solicitudes;
	}
	
	public int montoTotalDePrestamos() {
		/**
		 * Retorna el monto total de los creditos solicitados que son aceptables.
		 */
		int total = 0;
		for(SolicitudDeCredito solicitud : this.solicitudes()) {
			total += solicitud.montoTotal();
		}
		return total;
	}
	
}
