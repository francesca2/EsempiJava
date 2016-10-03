package Eccezioni;

public class ClasseA {
	public static void b(){
		int a=5/0;
	}

	public static void c()
	{
		try{
		b();
		}
		catch(Exception e)
		{
			System.out.println("Abbiamo gestito l'eccezione di b in c");
		}
	}
	
}
