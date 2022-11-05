package prova;

import java.util.Scanner;

public class DueMax {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		int contatore = 1;
		int numero = 0;
		int max1 = 0;
		int max2 = 0;
		
		
		while(contatore < 11) {
			
			System.out.print("Inserire numero: ");
			numero = in.nextInt();
			
			if(max2 < numero) {
				max1 = max2;
				max2 = numero;
			}
			else if(max1 < numero)
				max1 = numero;
			
			contatore++;
		}
		
		System.out.printf("I due valori maggiori sono: %d e %d", max1, max2);
		
		in.close();
		

	}

}
