package prova;

import java.util.Scanner;

public class Venditori {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inserire numero articolo (1 a 4, -1 to exit): ");
		int articolo = input.nextInt();
		double prezzo = 0;
		double totale = 0;
		
		if(articolo == 1)
			prezzo = 239.99;
		else if(articolo == 2)
			prezzo = 129.75;
		else if(articolo == 3)
			prezzo = 99.95;
		else if(articolo == 4)
			prezzo = 350.89;
		else if(articolo > 4 || articolo < -1)
			System.out.println("Numero articolo inserito errato!");
		
		while(articolo != -1) {
			
			totale += prezzo;
			
			System.out.print("Inserire prossimo articolo (1 a 4, -1 to exit): ");
			articolo = input.nextInt();
			
			if(articolo == 1)
				prezzo = 239.99;
			else if(articolo == 2)
				prezzo = 129.75;
			else if(articolo == 3)
				prezzo = 99.95;
			else if(articolo == 4)
				prezzo = 350.89;
			else if(articolo > 4 || articolo < -1)
				System.out.println("Numero articolo inserito errato!");
			
		}
		
		double percentuale = (totale * 9) / 100;
		
		System.out.printf("Totale Guadagnato\nPaga Settimanale: €200\nValore merce piazzata: €%.2f\nPercentuale di vendita: €%.2f\nTotale: €%.2f", totale, percentuale, percentuale + 200);
		
			
		
		
		
		
		input.close();
		

	}

}
