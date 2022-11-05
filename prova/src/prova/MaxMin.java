package prova;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
			int x1, x2, x3, x4, x5;
			
			System.out.print("Inserisci il primo valore: ");
			x1 = input.nextInt();
			System.out.print("Inserisci il secondo valore: ");
			x2 = input.nextInt();
			System.out.print("Inserisci il terzo valore: ");
			x3 = input.nextInt();
			System.out.print("Inserisci il quarto valore: ");
			x4 = input.nextInt();
			System.out.print("Inserisci il quinto valore: ");
			x5 = input.nextInt();
			
			int max, min;
			
			max = min = x1;
			
			if(x2 < min)
				min = x2;
			if(x2 > max)
				max = x2;
			if(x3 < min)
				min = x3;
			if(x3 > max)
				max = x3;
			if(x4 < min)
				min = x4;
			if(x4 > max)
				max = x4;
			if(x5 < min)
				min = x5;
			if(x5 > max)
				max = x5;
			
			System.out.println("Il massimo è: " + max + "\nIl minimo è: " + min);
			input.close();
			
	}

}
