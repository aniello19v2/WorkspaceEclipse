package prova;

import java.util.Scanner;

public class MaxVendite {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int contatore = 1;
		int numero = 0;
		int maggiore = 0;
		
		
		while(contatore < 11) {
			
			System.out.print("Inserire numero: ");
			numero = in.nextInt();
			
			if(maggiore < numero)
				maggiore = numero;
			
			
			contatore++;
		}
		
		System.out.printf("Il valore maggiore è: %d", maggiore);
		
		in.close();

	}

}
