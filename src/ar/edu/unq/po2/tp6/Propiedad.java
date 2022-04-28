package ar.edu.unq.po2.tp6;

public class Propiedad {

	private String descripcion;
	private String direccion;
	private int valorFiscal;
	
	public Propiedad(String descripcion, String direccion, int valorFiscal) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}

	public int valorFiscal() {
		return this.valorFiscal;
	}
	
}
