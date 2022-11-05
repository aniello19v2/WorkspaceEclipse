package frequenzaCardiaca;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner inS = new Scanner(System.in);
		Scanner inD = new Scanner(System.in);
		
		System.out.print("Inserire nome: ");
		String nome = inS.nextLine();
		System.out.print("Inserire cognome: ");
		String cognome = inS.nextLine();
		System.out.print("Inserire data di nascita\nMese: ");
		int mese = inD.nextInt();
		System.out.print("Giorno: ");
		int giorno = inD.nextInt();
		System.out.print("Anno: ");
		int anno = inD.nextInt();
		
		FrequenzaCardiaca persona = new FrequenzaCardiaca(nome, cognome, mese, giorno, anno);
	
		int age = persona.calcolaAge();
		int freqMax = persona.frequenzaMassima(age);
		int freqIdealeMin = persona.frequenzaIdealeMin(freqMax);
		int freqIdealeMax = persona.frequenzaIdealeMax(freqMax);
		
		System.out.printf("\nPersona: %s %s", persona.getNome(), persona.getCognome() +
				"\nNata il: ");
		persona.mostraData();
		System.out.printf("Età: %d\n", age);
		System.out.printf("Frequenza Cardiaca Massima: %d\n", freqMax);
		System.out.printf("Frequenza Cardiaca Ideale: %d-%d\n", freqIdealeMin, freqIdealeMax);
		
		inS.close();
		inD.close();

	}

}
