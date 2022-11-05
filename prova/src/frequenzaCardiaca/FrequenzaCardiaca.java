package frequenzaCardiaca;

import java.util.Calendar;

public class FrequenzaCardiaca {
	
	int year = Calendar.getInstance().get(Calendar.YEAR);
	
	String nome;
	private String cognome;
	private int mese;
	private int giorno;
	private int anno;
	
	public FrequenzaCardiaca(String nome, String cognome, int mese, int giorno, int anno) {
		this.nome = nome;
		this.cognome = cognome;
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
	
	public int calcolaAge() {
		int age = year - anno;
		return age;
	}
	
	public int frequenzaMassima(int age) {
		int freqMax = 220 - age;
		return freqMax;
	}
	
	public int frequenzaIdealeMin(int frequenza) {
		return ((50 * frequenza) / 100);
	}
	
	public int frequenzaIdealeMax(int frequenza) {
		return ((85 * frequenza) / 100);
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
