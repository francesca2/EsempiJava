package Ordinamento;

public class Studente {
	
	private String nome;
	//private String cognome;
	private int eta;
	
	public Studente() {
		super();
	}

	public Studente(String nome, int eta) {
		super();
		this.nome = nome;
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

}
