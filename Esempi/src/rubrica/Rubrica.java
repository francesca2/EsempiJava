package rubrica;
import java.util.ArrayList;
import java.util.List;

public class Rubrica {
	
	private String nomePropietario;
	private List<Voci> Contatti= new ArrayList<Voci>();
	
	//Costruttori
	public Rubrica()
	{		
	}
	
	public Rubrica(String nomePropietario)
	{
		this.nomePropietario=nomePropietario;
	}
	
	//Getter e Setter
	public String getNomePropietario() {
		return nomePropietario;
	}
	public void setNomePropietario(String nomePropietario) {
		this.nomePropietario = nomePropietario;
	}
	public List<Voci> getContatti() {
		return Contatti;
	}
	public void setContattia(List<Voci> listaRubrica) {
		Contatti = listaRubrica;
	}
	
	//Metodo per riempire la lista
	
	public void riempiRubrica(Voci v) 
	{
		Contatti.add(v);
	}
	
	//Metodo per la concatenzaione
	
	public String toString(Voci v)
	{
		String str= "Nome: " + v.getNome() + "\n Cognome: " + v.getCognome() + "\n Telefono: " + v.getTelefono();
		
		return str;
	}
	
	//Metodo per la ricerca
	
	public String searchPhone(String nome, String cognome)
	{
		String phoneNumber="";
		
		for(Voci v : Contatti)
		{
			if(nome.equals(v.getNome()) && cognome.equals(v.getCognome()))
					{
				phoneNumber = v.getTelefono();
					}

		}
		return phoneNumber;
	}


}
