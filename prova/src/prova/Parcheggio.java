package prova;

import java.util.Scanner;

public class Parcheggio {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserire ore parcheggio (-1 to exit): ");
		int ore = in.nextInt();
		double tariffa = 0;
		double totale = 0;
		
		while(ore != -1) {
			
			tariffa = calcolaTariffa(ore);
			totale += tariffa;
			System.out.print("Inserire ore parcheggio (-1 to exit): ");
			ore = in.nextInt();
			
		}
		
		System.out.printf("Il totale fatturato è: €%.2f", totale);
		
		
		
		in.close();
		

	}
	
	public static double calcolaTariffa(int ore) {
		double tariffa = 2.00;
		int oreExtra = 0;
		
		if(ore > 3 && ore != 24) {
			oreExtra = ore - 3;
			tariffa += oreExtra * 0.5;
		}
		else if(ore == 24)
			tariffa = 10.00;
		
		System.out.printf("La tariffa da pagare è: €%.2f\n", tariffa);
		return tariffa;
		
	}

}
