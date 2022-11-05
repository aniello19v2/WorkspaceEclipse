package prova;

import java.util.Scanner;

public class Cerchio {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int raggio;
		
		System.out.print("Inserisci raggio: ");
		raggio = input.nextInt();
		
		System.out.print("Diametro: " + 2 * raggio + "\n" +
						 "Circonferenza: " + 2 * Math.PI * raggio + "\n" +
						 "Area: " + Math.PI * raggio * raggio + "\n");
		
		input.close();
		
	}

}
