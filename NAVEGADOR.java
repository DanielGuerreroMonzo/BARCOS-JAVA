package BARCOS;

public class NAVEGADOR {

	public static void main(String[] args){

		Barcos PrimerBarco,SegundoBarco;
		Barcosguay MiniBarco;
		PrimerBarco=new Barcos("velero",12,2);
		SegundoBarco=new Barcos("Belero",16,5);
		System.out.println(PrimerBarco.getNombreBarco());
		System.out.println(SegundoBarco.getNombreBarco());
		MiniBarco=new Barcosguay("Otro",20,9,true);
		System.out.println(MiniBarco.getNombreBarco());

		
		
		
		
	}
}
