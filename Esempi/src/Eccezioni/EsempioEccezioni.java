package Eccezioni;
import java.io.FileReader;
import java.io.IOException;

public class EsempioEccezioni {

	public static void main(String[] args) {
		int[] arr= new int[4];
//	ClasseA A= new ClasseA();
//	A.c();
	
		ClasseB B=new ClasseB();

			try {
				B.b(2);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		try
		{
			int a=arr[6];
			int b= 50/0;
		}
		catch(ArithmeticException e)//eccezione dovuta al fatto di dividere un numero per zero
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) //eccezione dovuta al fatto di aver chiamato un elemento inesistente dell'array 
		{
			System.out.println(e);
		}
		catch(Exception e) // eccezione generica
		{
			System.out.println(e);
		}
		System.out.println("Bla bla");
		 

		//Input sbagliato
//		try {
//			FileReader fr=new FileReader("file.txt");
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
	}

}
