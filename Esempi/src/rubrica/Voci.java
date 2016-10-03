package rubrica;

public class Voci {
	
	private String nome;
	private String cognome;
	private String indirizzo;
	private String telefono;
	
	//Costruttori
	public Voci()
	{
		
	}
	
	public Voci(String nome, String cognome, String telefono)
	{
		this.nome=nome;
		this.cognome=cognome;
		this.telefono=telefono;
		
	}
	
	public Voci(String nome, String cognome, String indirizzo, String telefono)
	{
		this.nome=nome;
		this.cognome=cognome;
		this.indirizzo=indirizzo;
		this.telefono=telefono;
	}
	
	//Getter and Setter
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	
	
	
}
