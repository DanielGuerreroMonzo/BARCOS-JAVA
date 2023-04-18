package BARCOS;

public class Barcosguay extends Barcos{
	private boolean esguay;
	public Barcosguay(String nombreBarco, int tamano, int numeroPalo,boolean esguay) {
		super(nombreBarco, tamano, numeroPalo);
		this.esguay = esguay;

		// TODO Auto-generated constructor stub
	}


	public boolean isEsguay() {
		return esguay;
	}
	public void setEsguay(boolean esguay) {
		this.esguay = esguay;
	}
	
	
		
}
