package prova;

import java.security.SecureRandom;
import java.util.Scanner;

public class IndovinaNumero {
	
	private static final SecureRandom choice = new SecureRandom();

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Benvenuto al gioco Indovina il numero!\n");
		int sceltaUtente = 0;
		boolean trovato = false;
		int tentativi = 0;
		
		while(true) {
			
			System.out.print("Indovina il numero fra 1 e 1000");
			int numero = 1 + choice.nextInt(1000);
			
			System.out.print("\nInserisci il tuo guess: ");
			sceltaUtente = in.nextInt();
			
			while(trovato != true) {
				
				if(sceltaUtente < numero) {
					System.out.print("Troppo basso, prova ancora: ");
					sceltaUtente = in.nextInt();
					tentativi++;
				}
				else if(sceltaUtente > numero) {
					System.out.print("Troppo alto, prova ancora: ");
					sceltaUtente = in.nextInt();
					tentativi++;
				}
				else {
					System.out.print("\nCongratulazioni, hai vinto!");
					if(tentativi <= 10) {
						System.out.print("\nO conoscevi il segreto o sei fortunato!\n");
					}
					else
						System.out.print("\nPuoi fare di meglio! Prova a risolverlo con meno di 10 tentativi!\n");
					trovato = true;
				}
				
			}
			
			System.out.print("\nVuoi giocare ancora? (1 - Si, 2 - No): \n");
			sceltaUtente = in.nextInt();
			
			if(sceltaUtente == 1) {
				trovato = false;
				tentativi = 0;
				continue;
			}
			else
				break;
				
		}
		
		in.close();
		

	}

}
