package prova;

import java.util.Scanner;

public class SeparaCifre {

		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			int valore;
			
			System.out.print("Inserisci valore: ");
			valore = input.nextInt();
			
			System.out.println(valore / 10000 + " " + (valore / 1000) % 10 + " " + ((valore / 100) % 100) % 10
							   + " " + (((valore / 10) % 1000) % 100) % 10 + " " 
							   + (((valore / 10) % 1000) % 100) % 10);
			
			
//			Primo: valore / 10000
//			Secondo: (valore / 1000) % 10
//			Terzo: ((valore / 100) % 100) % 10
//			Quarto: (((valore / 10) % 1000) % 100) % 10
//			Quinto: (((valore / 10) % 1000) % 100) % 10
			
			input.close();
			
			
		}
	

}
