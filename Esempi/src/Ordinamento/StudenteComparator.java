package Ordinamento;
import java.util.Comparator;


public class StudenteComparator implements Comparator<Studente> {

	@Override
	public int compare(Studente s1, Studente s2) {

		int valNome= s1.getNome().compareTo(s2.getNome());
		
		if(valNome==0) //Se i due nomi sono uguali
		{
			int valEta= s1.getEta()-s2.getEta(); //Ordina in modo crescente, altrimenti s2.getEta - s1.getEta
			return valEta;
		}
		return valNome;
	}
	
	

}
