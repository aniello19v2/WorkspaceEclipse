package fattura;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inserisci Codice Fattura: ");
		String codice = input.nextLine();
		System.out.print("Inserisci Descrizione: ");
		String descrizione = input.nextLine();
		System.out.print("Inserisci Quantità Acquistata: ");
		int quantita = input.nextInt();
		System.out.print("Inserisci Prezzo Unitario: ");
		double prezzo = input.nextDouble();
		System.out.print("\n");
		
		double fattura;
		Fattura account = new Fattura(codice, descrizione, quantita, prezzo);
		
		fattura = account.getQuantitaFattura();
		account.visualizzaFattura(fattura);
		
		input.close();

	}

}
