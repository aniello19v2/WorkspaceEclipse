package data;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Inserire mese (1 - 12): ");
		int mese = in.nextInt();
		System.out.print("Inserire giorno (1 - 30/31): ");
		int giorno = in.nextInt();
		System.out.print("Inserire anno: ");
		int anno = in.nextInt();
		
		Data date = new Data(mese, giorno, anno);
		
		date.mostraData();
		
		in.close();

	}

}
