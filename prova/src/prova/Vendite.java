package prova;

import java.util.Scanner;

public class Vendite {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserire numero prodotto (-1 to exit): ");
		int numero = in.nextInt();
		int quantita = 0;
		double totale = 0;
		double prezzo = 0;
		
		while(numero != -1) {
			
			System.out.print("Inserire quantità venduta: ");
			quantita = in.nextInt();
			
			switch(numero) {
			
				case 1:
					prezzo = 2.98;
					totale += prezzo * quantita;
					break;
				case 2:
					prezzo = 4.50;
					totale += prezzo * quantita;
					break;
				case 3:
					prezzo = 9.98;
					totale += prezzo * quantita;
					break;
				case 4:
					prezzo = 4.49;
					totale += prezzo * quantita;
					break;
				case 5:
					prezzo = 6.87;
					totale += prezzo * quantita;
					break;
				default:
					break;

			}
			
			System.out.print("Inserire numero prodotto (-1 to exit): ");
			numero = in.nextInt();
			
		}
		
		System.out.printf("Valore totale dei prodotti venduti: %.2f", totale);
		in.close();

	}

}
