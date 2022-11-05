package prova;

import java.security.SecureRandom;
import java.util.Scanner;

public class Craps {
	
	// create secure random number generator for use in method rollDice
	private static final SecureRandom randomNumbers = new SecureRandom();

	// enum type with constants that represent the game status
	private enum Status {CONTINUE, WON, LOST};                

	// constants that represent common rolls of the dice
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;      
	private static final int SEVEN = 7;     
	private static final int YO_LEVEN = 11; 
	private static final int BOX_CARS = 12; 

	// plays one game of craps
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("BENVENUTI AL GIOCO CRAPS!\n");
		int myPoint = 0; // point if no win or loss on first roll
		Status gameStatus; // can contain CONTINUE, WON or LOST
		int bankBalance = 1000;
		int wager = 0;
		boolean play = false;
		

		while(true) {
			
			System.out.print("Enter 1 to play, 2 to quit: ");
			int choice = in.nextInt();
			if(choice == 1)
				play = true;
			else
				play = false;
			
			while(play != false) {
				
				System.out.printf("Saldo Disponibile: %d\nQuanto vuoi scommettere?: ", bankBalance);
				wager = in.nextInt();
				if(wager > bankBalance) {
					
					while(wager <= bankBalance) {
						System.out.print("Scommessa non valida, riprovare: ");
						wager = in.nextInt();
					}
					
				}
					
				int sumOfDice = rollDice(); // first roll of the dice

				// determine game status and point based on first roll 
				switch (sumOfDice) {
		        	case SEVEN: // win with 7 on first roll    
		        	case YO_LEVEN: // win with 11 on first roll
		        		gameStatus = Status.WON;
		        		break;
		        	case SNAKE_EYES: // lose with 2 on first roll
		        	case TREY: // lose with 3 on first roll      
		        	case BOX_CARS: // lose with 12 on first roll 
		        		gameStatus = Status.LOST;
		        		break;
		        	default: // did not win or lose, so remember point  
		        		gameStatus = Status.CONTINUE; // game is not over
		        		myPoint = sumOfDice; // remember the point       
		        		System.out.printf("Point is %d%n", myPoint);
		        		break; 
				}

				// while game is not complete
				while (gameStatus == Status.CONTINUE) { // not WON or LOST
					sumOfDice = rollDice(); // roll dice again

					// determine game status
					if (sumOfDice == myPoint) { // win by making point
						gameStatus = Status.WON;
					} 
					else { 
						if (sumOfDice == SEVEN) { // lose by rolling 7 before point
							gameStatus = Status.LOST;
						} 
					} 
				} 

				// display won or lost message
				if (gameStatus == Status.WON) {
					System.out.println("Complimenti, hai vinto");
					bankBalance =+ wager;
					System.out.printf("Nuovo saldo: %d", bankBalance);
					play = false;
				} 
				else {
					System.out.println("Player loses");
					bankBalance -= wager;
					System.out.printf("Nuovo saldo: %d", bankBalance);
					play = false;
				}
	
				
			}// fine secondo while
			
			System.out.print("\nVuoi giocare ancora? (1 - Si, 2 - No): ");
			choice = in.nextInt();
			if(choice == 1)
				play = true;
			else {
				play = false;
				break;
			}
				
		}//fine while loop
		
		in.close();
		 
	} 

	// roll dice, calculate sum and display results
	public static int rollDice() {
		// pick random die values
		int die1 = 1 + randomNumbers.nextInt(6); // first die roll
		int die2 = 1 + randomNumbers.nextInt(6); // second die roll

		int sum = die1 + die2; // sum of die values

		// display results of this roll
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

		return sum; 
	} 
} 