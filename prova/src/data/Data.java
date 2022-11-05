package data;

public class Data {
	
	private int mese = 01;
	private int giorno = 01;
	private int anno = 1970;
	
	public Data(int mese, int giorno, int anno) {
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
	
	public void mostraData() {
		if(giorno < 10 && mese < 10)
			System.out.printf("La data è: 0%d/0%d/%d\n", giorno, mese, anno);
		if(giorno < 10 && mese >= 10)
			System.out.printf("La data è: 0%d/%d/%d\n", giorno, mese, anno);
		if(giorno >= 10 && mese < 10)
			System.out.printf("La data è: %d/0%d/%d\n", giorno, mese, anno);
		if(giorno >= 10 && mese >= 10)
			System.out.printf("La data è: %d/%d/%d\n", giorno, mese, anno);
	}
	
	

}
