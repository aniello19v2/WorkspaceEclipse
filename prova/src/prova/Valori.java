package prova;

import java.util.Scanner;

public class Valori {

	public static void main(String[] args) {
		
		int x1, x2, x3, x4, x5;
		Scanner input = new Scanner(System.in);
		
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
		
		int positivo = 0, negativo = 0, zero = 0;
		
		if(x1>0)
			positivo++;
		if(x1<0)
			negativo++;
		if(x1==0)
			zero++;
		if(x2>0)
			positivo++;
		if(x2<0)
			negativo++;
		if(x2==0)
			zero++;
		if(x3>0)
			positivo++;
		if(x3<0)
			negativo++;
		if(x3==0)
			zero++;
		if(x4>0)
			positivo++;
		if(x4<0)
			negativo++;
		if(x4==0)
			zero++;
		if(x5>0)
			positivo++;
		if(x5<0)
			negativo++;
		if(x5==0)
			zero++;
		
		System.out.println("I valori positivi sono: " + positivo + "\n" +
						   "I valori negativi sono: " + negativo + "\n" +
						   "Gli zeri sono: " + zero);

		
		input.close();

	}

}
