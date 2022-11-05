package prova;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("Inserisci numero: ");
		int numero = in.nextInt();
		
				
		while(numero != -1) {
			
			if((numero / 10000) == (((numero % 10000) % 1000) % 100) % 10) {
				if((numero / 1000) % 10 == (((numero / 10) % 1000) % 100) % 10) {
					System.out.printf("Il numero %d è palindromo\n", numero);
				}
				else
					System.out.printf("Il numero %d non è palindromo\n", numero);
			}
			else
				System.out.printf("Il numero %d non è palindromo\n", numero);
			
			System.out.print("Inserisci numero: ");
			numero = in.nextInt();
			
		}
		
		in.close();
	}

}
