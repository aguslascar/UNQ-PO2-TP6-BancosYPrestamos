package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSolicitudes {
	
	Cliente agustin;
	Cliente martin;
	Propiedad casa;

	@BeforeEach
	public void setUp() {
		agustin = new Cliente("agustin", "lascar", "caseros", 24, 48000);
		martin = new Cliente("martin", "lascar", "caseros", 24, 80000);
		casa = new Propiedad("es una casa", "caseros", 500000);
	}
	@Test
	void testSolicitudPersonal() {
		agustin.solicitarCredito("credito personal", 100000, 12);
		assertEquals(100000, agustin.solicitudCredito().montoTotal());
	}
	
	@Test
	void testSolicitudHipotecario() {
		assertThrows(RuntimeException.class, () -> martin.solicitarCredito("credito hipotecario", 300000, 24));
		martin.agregarGarantia(casa);
		martin.solicitarCredito("credito hipotecario", 300000, 24);
		assertEquals(300000, martin.solicitudCredito().montoTotal());
	}

}
