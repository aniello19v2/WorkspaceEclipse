package prova;

import java.util.Scanner;

public class Multipli {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x1, x2;
		
		System.out.print("Inserisci primo numero: ");
		x1 = input.nextInt();
		System.out.print("Inserisci secondo numero: ");
		x2 = input.nextInt();
		
		if(x1%x2 == 0)
			System.out.printf("%d è multiplo di %d\n", x1, x2);
		if(x1%x2 != 0)
			System.out.printf("%d non è multiplo di %d\n", x1, x2);
		
		input.close();
	}

}
