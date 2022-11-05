package fattura;

public class Fattura {
	
	private String codice;
	private String descrizione;
	private int quantita;
	private double prezzo;

	public Fattura(String codice, String descrizione, int quantita, double prezzo) {
		this.codice = codice;
		this.descrizione = descrizione;
		if(quantita > 0)
			this.quantita = quantita;
		if(prezzo > 0)
			this.prezzo = prezzo;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public double getQuantitaFattura() {
		double totale = this.prezzo * this.quantita;
		if(this.quantita < 0)
			totale = 0;
		if(this.prezzo < 0)
			this.prezzo = 0.0;
		return totale;
	}
	
	public void visualizzaFattura(double totale) {
		System.out.printf("Codice Fattura: %s\n"
				+ "Descrizione: %s\n"
				+ "Quantità Acquistata: %d\n"
				+ "Prezzo Unitario: %.2f\n"
				+ "Totale: %.2f\n", this.codice, this.descrizione, this.quantita, this.prezzo, totale);
	}
	
	
	
}
