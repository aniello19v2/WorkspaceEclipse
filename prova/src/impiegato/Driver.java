package impiegato;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner inS = new Scanner(System.in);
		Scanner inD = new Scanner(System.in);
		
		System.out.print("Inserire nome primo impiegato: ");
		String nome1 = inS.nextLine();
		System.out.print("Inserire cognome primo impiegato: ");
		String cognome1 = inS.nextLine();
		System.out.print("Inserire stipendio primo impiegato: ");
		double stipendio1 = inD.nextDouble();
		
		System.out.print("Inserire nome secondo impiegato: ");
		String nome2 = inS.nextLine();
		System.out.print("Inserire cognome secondo impiegato: ");
		String cognome2 = inS.nextLine();
		System.out.print("Inserire stipendio secondo impiegato: ");
		double stipendio2 = inD.nextDouble();
		
		
		Impiegato impiegato1 = new Impiegato(nome1, cognome1, stipendio1);
		Impiegato impiegato2 = new Impiegato(nome2, cognome2, stipendio2);
		
		visualizzaStipendioMensile(impiegato1);
		visualizzaStipendioAnnuale(impiegato1);
		visualizzaStipendioMensile(impiegato2);
		visualizzaStipendioAnnuale(impiegato2);
		
		impiegato1.aumentoStipendio(10);
		impiegato2.aumentoStipendio(20);
		
		visualizzaStipendioMensile(impiegato1);
		visualizzaStipendioAnnuale(impiegato1);
		visualizzaStipendioMensile(impiegato2);
		visualizzaStipendioAnnuale(impiegato2);
		
		inS.close();
		inD.close();
		

	}

	public static void visualizzaStipendioMensile(Impiegato impiegato) {
		System.out.print("\n");
		System.out.printf("Lo stipendio mensile dell'impiegato %s %s è: %.2f\n",
				impiegato.getNome(), impiegato.getCognome(), impiegato.getStipendio());
	}
	
	public static void visualizzaStipendioAnnuale(Impiegato impiegato) {
		System.out.printf("Lo stipendio annuale dell'impiegato %s %s è: %.2f\n",
				impiegato.getNome(), impiegato.getCognome(), 12 * impiegato.getStipendio());
	}
	
}
