package schedaClinica;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner inS = new Scanner(System.in);
		Scanner inD = new Scanner(System.in);
		
		System.out.print("Inserire nome: ");
		String nome = inS.nextLine();
		System.out.print("Inserire cognome: ");
		String cognome = inS.nextLine();
		System.out.print("Inserire sesso: ");
		String sesso = inS.nextLine();
		System.out.print("Inserire data di nascita\nMese: ");
		int mese = inD.nextInt();
		System.out.print("Giorno: ");
		int giorno = inD.nextInt();
		System.out.print("Anno: ");
		int anno = inD.nextInt();
		System.out.print("Inserire altezza (in metri): ");
		double altezza = inD.nextDouble();
		System.out.print("Inserire peso (in Kg): ");
		double peso = inD.nextDouble();
		
		SchedaClinica paziente = new SchedaClinica(nome, cognome, sesso, mese, giorno, anno, altezza, peso);
		
		System.out.println("\n/* DATI INSERITI */");
		System.out.print("Nome: " + paziente.getNome() +
				"\nCognome: " + paziente.getCognome() +
				"\nSesso: " + paziente.getSesso());
		System.out.print("\nData di nascita: ");
		paziente.mostraData();
		System.out.printf("Peso: %.2f\nAltezza: %.2f", paziente.getPeso(), paziente.getAltezza());
		
		double bmi = paziente.bmi();
		int age = paziente.calcolaAge();
		int freqMax = paziente.frequenzaMassima(age);
		int freqIdealeMin = paziente.frequenzaIdealeMin(freqMax);
		int freqIdealeMax = paziente.frequenzaIdealeMax(freqMax);
		
		System.out.printf("\n\nEtà: %d\nBMI: %.2f", age, bmi);
		System.out.printf("\nFrequenza Massima: %d\nIntervallo di Frequenza Ideale: %d-%d\n\n", freqMax, freqIdealeMin, freqIdealeMax);
		
		System.out.print("BMI Categories:\n"
				+ "Underweight: <18.5\r\n"
				+ "Normal weight: 18.5–24.9\n"
				+ "Overweight: 25–29.9\n"
				+ "Obesity: BMI of 30 or greater");
		
		inS.close();
		inD.close();
		
	}

}
