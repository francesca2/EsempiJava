import Enumerazione.Giorno;

public class MainEnum {

	public static void main(String[] args) {

		Giorno g = Giorno.LUNEDI;
		
		switch(g)
		{
			case LUNEDI :
				System.out.println("Oggi � Luned�");
				break;
			case MARTEDI :
				System.out.println("Oggi � marted�");
				
		}

	}

}
