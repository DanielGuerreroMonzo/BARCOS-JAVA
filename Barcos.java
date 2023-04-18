package BARCOS;

public class Barcos {

	private String nombreBarco;
	private int tamano;
	private int numeroPalo;
	public Barcos(String nombreBarco, int tamano, int numeroPalo) {
		super();
		this.nombreBarco = nombreBarco;
		this.tamano = tamano;
		this.numeroPalo = numeroPalo;
	}
	public Barcos(String nombreBarco) {
		super();
		this.nombreBarco = nombreBarco;
	}
	public String getNombreBarco() {
		return nombreBarco;
	}
	public void setNombreBarco(String nombreBarco) {
		this.nombreBarco = nombreBarco;
	}
	public int getTamano() {
		return tamano;
	}
	public void setTamano(int tamano) {
		this.tamano = tamano;
	}
	public int getNumeroPalo() {
		return numeroPalo;
	}
	public void setNumeroPalo(int numeroPalo) {
		this.numeroPalo = numeroPalo;
	}

	
	
	
	
	
		
	
}