package prova;

import java.util.Scanner;

public class Parità {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int numero;
		
		System.out.print("Inserisci un numero: ");
		numero = input.nextInt();
		
		if(numero % 2 == 0)
			System.out.printf("%d è pari\n", numero);
		if(numero % 2 != 0)
			System.out.printf("%d è dispari\n", numero);
		
		input.close();
		
	}

}
