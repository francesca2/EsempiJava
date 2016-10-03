import Enumerazione.Giorno;

public class MainEnum {

	public static void main(String[] args) {

		Giorno g = Giorno.LUNEDI;
		
		switch(g)
		{
			case LUNEDI :
				System.out.println("Oggi è Lunedì");
				break;
			case MARTEDI :
				System.out.println("Oggi è martedì");
				
		}

	}

}
