package Eccezioni;
import java.io.IOException;


public class ClasseB {

	public void b(int a) throws IOException
	{
		if(a>3)
		{
				throw new IOException("� successo qualcosa");
		}
			System.out.println("Tutto a posto");
	}
}
