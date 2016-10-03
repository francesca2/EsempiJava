package Input;
import java.io.Console;
import java.util.Scanner;


public class Input {

	public static void main(String[] args) {
		
		Scanner sn= new Scanner(System.in);
		System.out.println("Entra un numero:");
		
		int a=sn.nextInt();
		
		System.out.println("Numero inserito:" + a);
		
		System.out.print("Inserisci il nome:");
			
			String str=sn.next();
			
		System.out.println("Il tuo nome è:" + str);

		sn.close();
		
//		Console cns= System.console();
		
//		System.out.print("Inserire password di sei caratteri:");
//		char[] pswd = new char[6];
//		pswd = cns.readPassword();
//		
//		String s= String.valueOf(pswd);
//		System.out.println(s);
		
		
	}

}
