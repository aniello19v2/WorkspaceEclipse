package prova;

import java.util.Scanner;

public class Quadrato2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Scanner inC = new Scanner(System.in);
		
		System.out.print("Inserire numero: ");
		int lato = in.nextInt();
		System.out.print("Inserire char: ");
		char carattere = in.next().charAt(0);
		
		for(int i = 1; i <= lato*lato; i++) {
			
			System.out.printf("%s", carattere);
			if(i % lato == 0)
				System.out.print("\n");
			
		}
		
		in.close();
		inC.close();
	}

}
