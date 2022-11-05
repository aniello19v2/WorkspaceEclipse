package contoCorrente;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner inputString = new Scanner(System.in);
		Scanner inputNumber = new Scanner(System.in);
		
		System.out.print("Inserire nome primo account: ");
		String nome1 = inputString.nextLine();
		System.out.print("Inserire saldo primo account: ");
		double saldo1 = inputNumber.nextDouble();
		
		System.out.print("Inserire nome secondo account: ");
		String nome2 = inputString.nextLine();
		System.out.print("Inserire saldo secondo account: ");
		double saldo2 = inputNumber.nextDouble();
		
		
		ContoCorrente account1 = new ContoCorrente(nome1, saldo1);
		ContoCorrente account2 = new ContoCorrente(nome2, saldo2);
		
		visualizzaAccount(account1);
		visualizzaAccount(account2);
		
		System.out.print("Inserire quantita da depositare: ");
		double amount1 = inputNumber.nextDouble();
		account1.deposita(amount1);
		System.out.print("Inserire quantita da depositare: ");
		double amount2 = inputNumber.nextDouble();
		account2.deposita(amount2);
		System.out.print("\n");
		
		visualizzaAccount(account1);
		visualizzaAccount(account2);
		
		System.out.print("Inserire quantita da prelevare: ");
		double preleva1 = inputNumber.nextDouble();
		account1.deposita(preleva1);
		System.out.print("Inserire quantita da prelevare: ");
		double preleva2 = inputNumber.nextDouble();
		account2.deposita(preleva2);
		
		visualizzaAccount(account1);
		visualizzaAccount(account2);
		
		inputString.close();
		inputNumber.close();
	}
	
	public static void visualizzaAccount(ContoCorrente account) {
		System.out.printf("Conto Corrente di %s\n"
				+ "Saldo: %.2f\n\n", account.getNome(), account.getSaldo());
	}

}


