package prova;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		int peso;
		float bmi, altezza;
		Scanner input = new Scanner(System.in);
		
		System.out.println("/* CALCOLATORE BMI */");
		System.out.print("Inserire peso (in Kg): ");
		peso = input.nextInt();
		System.out.print("Inserire altezza (in metri): ");
		altezza = input.nextFloat();

		bmi = peso / (altezza * altezza);
		
		System.out.printf("Il tuo indice di massa corporea (BMI) è %.2f: \n\n", bmi);
		System.out.print("BMI Categories:\n"
				+ "Underweight: <18.5\r\n"
				+ "Normal weight: 18.5–24.9\n"
				+ "Overweight: 25–29.9\n"
				+ "Obesity: BMI of 30 or greater");
		
		input.close();
	}

}
