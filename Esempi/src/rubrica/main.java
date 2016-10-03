package rubrica;

public class main {

	public static void main(String[] args) {

		Rubrica rubrica= new Rubrica("Francesca");
		Voci v1 = new Voci("Francesca","Giordani","+39 328562663");
		Voci v2= new Voci("Paolino","Paperino","3405237772");
		Voci v3= new Voci("Paperon","De Paperoni","3485266673");
		
		rubrica.riempiRubrica(v1);
		rubrica.riempiRubrica(v2);
		rubrica.riempiRubrica(v3);
		
		System.out.println("La rubrica di " + rubrica.getNomePropietario() + " contiene le seguenti voci:");
		
		
		for(Voci v: rubrica.getContatti())
		{
			System.out.println(rubrica.toString(v));
		//System.out.println(v.getNome() + " " + v.getCognome() + " " + v.getTelefono() );
		}
		
		//System.out.println("Il numero di: " + v2.getNome() + " " + v2.getCognome() + " " + rubrica.searchPhone(v2.getNome(), v2.getCognome()));
		
	}

}
