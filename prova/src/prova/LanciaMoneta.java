package prova;

import java.security.SecureRandom;
import java.util.Scanner;

public class LanciaMoneta {
	
	private static final SecureRandom flip = new SecureRandom();
	private enum Coin {TESTA, CROCE};

	public static void main(String[] args) {
		
		
		Coin result;
		Scanner in = new Scanner(System.in);
		System.out.print("1 - Lancia Moneta\n2 - Finisci gioco\nScegli: ");
		int scelta = in.nextInt();
		int countTesta = 0;
		int countCroce = 0;
		
		
		while(scelta != 2) {
//		for(int i = 0; i < 100000000; i++) {
			result = flip();
			if(result == Coin.TESTA)
				countTesta++;
			else
				countCroce++;
//		}
			
			
			System.out.print("1 - Lancia Moneta\n2 - Finisci gioco\nScegli: ");
			scelta = in.nextInt();
			
		}
		
		System.out.printf("Testa: %d\nCroce: %d", countTesta, countCroce);
		
		in.close();
	
		
	}
	
	public static Coin flip() {
		
		int faccia = 1 + flip.nextInt(2);
		
		if(faccia == 1)
			return Coin.TESTA;
		else
			return Coin.CROCE;
		
	}

}
