package prova;

import java.util.Scanner;

public class NumeroPerfetto {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserire numero: ");
		int valore = in.nextInt();
		int number = valore;
		int totale = 1;
		int divisore = 2;
		
		System.out.print("1 ");
		
		while(number > 1) {
			
			while(number % divisore == 0) {
				
				totale += divisore;
				System.out.printf("%d ", divisore);
				number /= divisore;
				
			}
			divisore++;

		}
		
		
		System.out.printf("\nTotale fattori: %d\n%d %s perfetto", totale, valore, totale == valore ? "è" : "non è");	
		
		in.close();
		

	}

}
