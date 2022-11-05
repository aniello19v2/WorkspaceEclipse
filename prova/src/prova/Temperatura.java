package prova;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Inserire temperatura (Celsius, -1 to exit): ");
		double celsius = in.nextDouble();
		while(celsius != -1) {
			
			System.out.print("Inserire temperatura (Fahrenheit): ");
			double fahrenheit = in.nextDouble();		
			
			System.out.printf("Temperatura Celsius Iniziale: %.2f ---> in Fahrenheit: %.2f"
					+ "\nTemperatura Fahrenheit Iniziale: %.2f ---> in Celsius: %.2f\n", 
					celsius, fahrenheit(celsius), fahrenheit, celsius(fahrenheit));
			
			System.out.print("Inserire temperatura (Celsius, -1 to exit): ");
			celsius = in.nextDouble();
			
		}
		
		in.close();

	}
	
	public static double celsius(double fahrenheit) {
		return 5.0 / 9.0 * (fahrenheit - 32);
	}
	
	public static double fahrenheit(double celsius) {
		return 9.0 / 5.0 * celsius + 32;
	}

}
