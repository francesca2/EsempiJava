
public class EsempioStudente {

	public static void main(String[] args) {
	
		Studente s1=new Studente("aaaa",1);
		cc(s1);
		System.out.println(s1.getNome());

	}
	
	public static void cc(Studente s2)
	{
		s2.setNome("bbbbb");
	}

}
