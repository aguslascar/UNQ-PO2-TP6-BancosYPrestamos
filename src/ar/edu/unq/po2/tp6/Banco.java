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
		this.solicitudes.add(cliente.solicitudCredito());
	}
	
	public boolean evaluarSolicitud(Cliente cliente) {
		/**
		 * Evalua si la solicitud que hizo el cliente es apta para darle el credito.
		 */
		return cliente.solicitudCredito().chequearSolicitud();
	}
	
}
