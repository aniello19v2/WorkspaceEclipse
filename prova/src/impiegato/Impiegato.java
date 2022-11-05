package impiegato;

public class Impiegato {
	
	private String nome;
	private String cognome;
	private double stipendio;
	
	public Impiegato(String nome, String cognome, double stipendio) {
		this.nome = nome;
		this.cognome = cognome;
		if(stipendio > 0)
			this.stipendio = stipendio;
	}

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

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		if(stipendio > 0)
			this.stipendio = stipendio;
	}

	public void aumentoStipendio(double percentuale) {
		if(percentuale > 0) {
			this.stipendio = this.stipendio + ((this.stipendio * percentuale) / 100);
		}
	}
	
}
