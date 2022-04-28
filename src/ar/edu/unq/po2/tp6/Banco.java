package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<SolicitudDeCredito> solicitudes = new ArrayList<SolicitudDeCredito>();
	
	public void agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void registrarSolicitud(SolicitudDeCredito solicitud) {
		this.solicitudes.add(solicitud);
	}
	
	public boolean evaluarSolicitud(SolicitudDeCredito solicitud) {
		return true;
	}
	
}
