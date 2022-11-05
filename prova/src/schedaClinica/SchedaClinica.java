package schedaClinica;

import java.util.Calendar;

public class SchedaClinica {
	
	private String nome;
	private String cognome;
	private String sesso;
	private int mese;
	private int giorno;
	private int anno;
	private double altezza;
	private double peso;
	int year = Calendar.getInstance().get(Calendar.YEAR);
	
	public SchedaClinica(String nome, String cognome, String sesso, int mese, int giorno, int anno, double altezza, double peso) {
		this.nome = nome;
		this.cognome = cognome;
		this.sesso = sesso;
		if(mese > 0 && mese < 13)
			this.mese = mese;
		if(mese == 1 || mese == 3 || mese == 5 || mese == 7 || mese == 8 || mese == 10 || mese == 12) {
			if(giorno > 0 && giorno < 32)
				this.giorno = giorno;
		}
		else if(mese == 4 || mese == 6 || mese == 9 || mese == 11) {
			if(giorno > 0 && giorno < 31)
				this.giorno = giorno;
		}
		else if(mese == 2) {
			if(giorno > 0 && giorno < 29)
				this.giorno = giorno;
		}
		if(anno > 1900)
			this.anno = anno;
		if(altezza > 0)
			this.altezza = altezza;
		if(peso > 0)
			this.peso = peso;
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

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public int getMese() {
		return mese;
	}

	public void setMese(int mese) {
		if(mese > 0 && mese < 13)
			this.mese = mese;
	}

	public int getGiorno() {
		return giorno;
	}

	public void setGiorno(int giorno) {
		if(mese == 1 || mese == 3 || mese == 5 || mese == 7 || mese == 8 || mese == 10 || mese == 12) {
			if(giorno > 0 && giorno < 32)
				this.giorno = giorno;
		}
		else if(mese == 4 || mese == 6 || mese == 9 || mese == 11) {
			if(giorno > 0 && giorno < 31)
				this.giorno = giorno;
		}
		else if(mese == 2) {
			if(giorno > 0 && giorno < 29)
				this.giorno = giorno;
		}
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		if(anno > 1900)
			this.anno = anno;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		if(altezza > 0)
			this.altezza = altezza;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso > 0)
			this.peso = peso;
	}
	
	public int calcolaAge() {
		return year - anno;
	}
	
	public int frequenzaMassima(int age) {
		return 220 - age;
	}
	
	public int frequenzaIdealeMin(int frequenza) {
		return ((50 * frequenza) / 100);
	}
	
	public int frequenzaIdealeMax(int frequenza) {
		return ((85 * frequenza) / 100);
	}
	
	public double bmi() {
		return (peso / (altezza * altezza));
	}
	
	public void mostraData() {
		if(giorno < 10 && mese < 10)
			System.out.printf("0%d/0%d/%d\n", giorno, mese, anno);
		if(giorno < 10 && mese >= 10)
			System.out.printf("0%d/%d/%d\n", giorno, mese, anno);
		if(giorno >= 10 && mese < 10)
			System.out.printf("%d/0%d/%d\n", giorno, mese, anno);
		if(giorno >= 10 && mese >= 10)
			System.out.printf("%d/%d/%d\n", giorno, mese, anno);
	}

}
