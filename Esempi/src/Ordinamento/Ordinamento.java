package Ordinamento;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Ordinamento {

	public static void main(String[] args) {

//		List<String> al = new ArrayList<String>();
//		
//		al.add("ffff");
//		al.add("zzzz");
//		al.add("bbbb");
//
//		Collections.sort(al);
//Collections.reverse(al);
//		
//		for(String s : al)
//		{
//			System.out.println(s);
//		}
		
		Studente s1= new Studente("Giorgio", 6);
		Studente s2= new Studente("Paolo", 8);
		Studente s3= new Studente("Giorgio", 7);
		StudenteComparator s= new StudenteComparator();
		
		List<Studente> studenti= new ArrayList<Studente>();
		
		studenti.add(s1);
		studenti.add(s2);
		studenti.add(s3);
		
		Collections.sort(studenti,s);
		
		for(Studente ss : studenti)
		{
			System.out.println(ss.getNome() + " " + ss.getEta());
		}	
		
	}

}
