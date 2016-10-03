import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

/*
 *Esempi sulle collezioni 
 */

public class MainCollezioni {

	public static void main(String[] args) {

		//Definisco un arrayList di Stringhe
		List<String> listaStringhe = new ArrayList<String>();
		
		listaStringhe.add("aaa");
		listaStringhe.add("bbb");
		listaStringhe.add("ccc");
		listaStringhe.add("ddd");
		
		//Metodo per scorrere la lista usando il for each
//		for(String s : listaStringhe)
//		{
//			System.out.println(s);
//		}
		
		//metodo per scorrere la lista alternativo al for each
		
//		Iterator<String> it= listaStringhe.iterator();
//
//		while(it.hasNext())
//		{
//			if(it.equals("aaa"))
//			{
//				it.remove(); //Ti permette di fare operazioni sulla lista mentre la scorri
//			}
//			System.out.println(it.next());
//		}
		
		//Definisco una LinkedList di Stringhe
		List<String> linkList = new LinkedList<String>();
		
		linkList.add("rrr");
		linkList.add("ppp");
		linkList.add("qqq");
		linkList.add("rrr");
		
		//Altro metodo per scorrere la lista che si usa solo per le liste
		
		ListIterator<String> lt= linkList.listIterator();
		
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		
		//Definisco vari tipi di set 

//		HashSet <String> hs = new HashSet<String>(); //L'ordine di stampa non è quello in cui ho inserito gli elementi
//		LinkedHashSet <String> hs =new LinkedHashSet<String>(); //Mantiene l'ordine di inserimento
//		Set<String> hs =new LinkedHashSet<String>();
		Set<String> hs=new TreeSet<String>(); // struttura ad albero, ordina secondo l'ordine alfabetico(string compare) o numerico se avessi inserito numeri invece di stringhe
		
		hs.add("Casa");
		hs.add("Cammelo");
		hs.add("Albero");
		hs.add("AAA"); //Il duplicato non può essere inserito in ogni caso
		
		Iterator<String> it =hs.iterator();
		
		while(it.hasNext())
			{
				System.out.println(it.next()); 
			}
		
	}

}
