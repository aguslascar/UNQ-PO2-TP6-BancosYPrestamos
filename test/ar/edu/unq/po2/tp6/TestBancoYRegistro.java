package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBancoYRegistro {
	
	Cliente agustin;
	Cliente martin;
	Banco hsbc;
	Propiedad casa;
	SolicitudDeCredito solicitud;
	SolicitudDeCredito solicitud2;
	
	@BeforeEach
	public void setUp() {
		agustin = new Cliente("agustin", "lascar", "caseros", 24, 48000);
		martin = new Cliente("martin", "lascar", "caseros", 24, 80000);
		hsbc = new Banco();
		hsbc.agregarCliente(agustin);
		hsbc.agregarCliente(martin);
		casa = new Propiedad("es una casa", "caseros", 500000);
		agustin.agregarGarantia(casa);
	}
	
	
	@Test
	void testHipotecarioConGarantia() {
		solicitud = new SolicitudHipotecario(agustin, 300000, 24, casa); 
		hsbc.registrarSolicitud(solicitud);
		assertEquals(1, hsbc.solicitudes().size());
	}
	
	@Test
	void testCreditoPersonal() {
		solicitud = new SolicitudPersonal(agustin, 300000, 3);
		hsbc.registrarSolicitud(solicitud);
		assert(!hsbc.esSolicitudAceptable(solicitud));
	}
	
	@Test
	void testSeRegistroSolicitudEnBanco() {
		solicitud = new SolicitudPersonal(agustin, 300000, 30);
		hsbc.registrarSolicitud(solicitud);
		assert(hsbc.solicitudes().contains(solicitud));
	}
	
	@Test
	void testMontoTotalDeCreditosAceptables() {
		solicitud = new SolicitudPersonal(agustin, 300000, 24);
		hsbc.registrarSolicitud(solicitud);
		solicitud2 = new SolicitudPersonal(martin, 300000, 30);
		hsbc.registrarSolicitud(solicitud2);
		assertEquals(600000, hsbc.montoTotalDePrestamos());
		
	}

}
