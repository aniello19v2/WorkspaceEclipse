package prova;

import java.util.Scanner;

public class Stipendio {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Scanner inS = new Scanner(System.in);
		
		int contatore = 1;
		double stipendio = 0;
		
		while (contatore < 4) {
			
			System.out.println("Inserire dati impiegato");
			System.out.print("Nome: ");
			String nome = inS.nextLine();
			System.out.print("Ore di lavoro: ");
			int ore = in.nextInt();
			
			if(ore > 40) {
				stipendio = (40 * 8) + ((ore - 40) * (8 * 1.5));
			}
			else
				stipendio = ore * 8;
			
			System.out.printf("Lo stipendio loro del dipendente %s è: €%.2f\n", nome, stipendio);
			contatore++;
			
			
		}
		
		in.close();
		inS.close();

	}

}
