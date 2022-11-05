package prova;

import java.util.Scanner;

public class NumeroPerfetto {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserire numero: ");
		int valore = in.nextInt();
		int number = valore;
		int totale = 1;
		
		System.out.print("1 ");
		
		while(number > 1) {
			
			if(number % 2 == 0) {
				totale += 2;
				System.out.print("2 ");
				number /= 2;
			}
			else if(number % 3 == 0) {
				totale += 3;
				System.out.print("3 ");
				number /= 3;
			}
			else if(number % 5 == 0) {
				totale += 5;
				System.out.print("5 ");
				number /= 5;
			}
			else if(number % 7 == 0) {
				totale += 7;
				System.out.print("7 ");
				number /= 7;
			}
			
		}
		
		
		System.out.printf("\nTotale fattori: %d\n%d %s perfetto", totale, valore, totale == valore ? "è" : "non è");	
		
		in.close();
		

	}

}
