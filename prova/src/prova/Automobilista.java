package prova;

import java.util.Scanner;

public class Automobilista {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int kmTotali = 0;
		int litriTotali = 0;
		int litri = 0;
		int counter = 0;
		
		System.out.print("Inserire chilometri percorsi (-1 per terminare): ");
		int km = input.nextInt();
		
		if(km != -1) {
			System.out.print("Litri inseriti: ");
			litri = input.nextInt();
			counter++;
		}
		
		while(km != -1) {
			
			double media = (double) km/litri;
			
			System.out.printf("\nChilometri percorsi: %d\n"
					+ "Litri Inseriti: %d\n"
					+ "Km/L: %.2f", km, litri, media);
			
			kmTotali += km;
			litriTotali += litri;
			
			System.out.print("\n\nInserire chilometri percorsi successivamente (-1 per terminare): ");
			km = input.nextInt();
			
			if(km != -1) {
				System.out.print("Litri inseriti: ");
				litri = input.nextInt();
				counter++;
			}
			
		}
		
		double media = (double) kmTotali/litriTotali;
		System.out.printf("\nRifornimenti totali: %d\nChilometri Totali: %d\nKm/L Totali: %.2f", counter, kmTotali, media);
		
		input.close();

	}

}
