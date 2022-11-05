package prova;

import java.util.Scanner;

public class Quadrato {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserire numero: ");
		int lato = in.nextInt();
		int a = 1, b = 1, c = 1, d = 1;
		
		
		while(a <= lato) {
			System.out.print("*");
			a++;
		}
		
		System.out.print("\n");
		
		while(b <= lato - 2) {
			System.out.print("*");
			while(c <= lato - 2) {
				System.out.print(" ");
				c++;
			}
			System.out.print("*");
			System.out.println("");
			c=1;
			b++;
		}
		
		while(d <= lato) {
			System.out.print("*");
			d++;
		}
		
		
		in.close();

	}

}
