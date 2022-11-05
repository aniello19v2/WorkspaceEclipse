package prova;

import java.util.Scanner;

public class Prova {

	public static void main(String[] args) {

		long numero;
		long residuoDaFattorizzare;
		long divisore;
		Scanner lettore = new Scanner(System.in);
				 
		System.out.print("Quale intero vuoi fattorizzare? ");
		numero = lettore.nextLong();
				 
		System.out.print(numero + " =");
		divisore = 2;
		residuoDaFattorizzare = numero;
		while(residuoDaFattorizzare > 1) {
			while(residuoDaFattorizzare % divisore == 0) {
				 		if(residuoDaFattorizzare == numero) 
				 			System.out.print(" " + divisore);
				 		else
				 			System.out.print(" * " + divisore);
				 			
				 		residuoDaFattorizzare = residuoDaFattorizzare / divisore;
			}
				 	
			divisore++;
		}
		System.out.println();
	}

}
