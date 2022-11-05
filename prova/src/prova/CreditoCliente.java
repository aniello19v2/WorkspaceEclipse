package prova;

import java.util.Scanner;

public class CreditoCliente {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inserire numero del conto (-1 to exit): ");
		int numeroConto = input.nextInt();
		
		while(numeroConto != -1) {
		
			System.out.print("Inserire saldo iniziale: ");
			int saldoIniziale = input.nextInt();
			System.out.print("Inserire totale articoli acquistati: ");
			int articoliTotali = input.nextInt();
			System.out.print("Inserire totale accrediti: ");
			int accreditiTotali = input.nextInt();
			System.out.print("Inserire limite di credito consentito: ");
			int limiteCredito = input.nextInt();
			
			int newSaldo = saldoIniziale + articoliTotali - accreditiTotali;
			
			if(newSaldo > limiteCredito)
				System.out.println("Limite di credito superato!");
			
			System.out.print("\nInserire numero del conto (-1 to exit): ");
			numeroConto = input.nextInt();
			
		}
		
		input.close();

	}

}
