package ar.edu.unq.po2.tp6;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private int sueldoNeto;
	private SolicitudDeCredito solicitud;
	private Propiedad garantia;
	
	public Cliente(String nombre, String apellido, String direccion, int edad, int sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNeto = sueldo;
	}
	
	public int sueldoNetoMensual() {
		return this.sueldoNeto;
	}
	
	public int sueldoNetoAnual() {
		return sueldoNeto * 12;
	}
	
	/*
	public void solicitarCredito(String tipo, int monto, int plazo) {
		/** 
		 * Registra una nueva solicitud de credito y la guarda en el cliente
		 
		if(tipo == "credito hipotecario" && this.garantia == null) {
			throw new RuntimeException("No tenes garantia");
		}
		solicitud = (new RegistroDeSolicitud()).crearSolicitud(this, tipo, monto, plazo);
	}
	*/
	public int edad() {
		return this.edad;
	}
	
	public Propiedad garantia() {
		return this.garantia;
	}
	
	public void agregarGarantia(Propiedad propiedad) {
		this.garantia = propiedad;		
	}
	
	/*
	public SolicitudDeCredito solicitudCredito() {
		return solicitud;
	}
	*/
}
