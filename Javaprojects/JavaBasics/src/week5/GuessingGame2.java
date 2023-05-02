package week5;

import java.util.Scanner;

import java.lang.Math;

public class GuessingGame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);


		//what each do while loop is testing
		boolean playing= true;
		boolean validResponse= false;
		boolean validGuess= false;
		boolean correct= false;
		
		//introduction to game
		System.out.println("This program is a guessing game. ");
		System.out.println("The computer will generate a random number between 1 to 100. The user will guess that number. ");
		System.out.println("Let's get started!");
		System.out.println();
		System.out.println("I'm thinking of a number between 1 and 100");
		
		do { 
			//primary loop
			int max = 100;
			int min = 1;
			int range = max-min + 1;
			int randNum= (int)(Math.random() * range) +min;

			int num1= 0;
			int guessCount= 0;
					do {
						//game loop
						do {
							//numeric validation loop
							String guess= new String ("");
							
							try {
								
								System.out.println("What is your guess? ");
								guess=input.nextLine();
								num1 = Integer.parseInt(guess);
								validGuess = true;
				
							} catch (Exception e) {
								System.out.println("Invalid entry Please try a whole number");
							}
						} while (!validGuess); //guess is validated, and game will now commence
		
						guessCount++; //count how many tries/loops it takes to guess the correct answer
						
						if (num1>randNum) {
							System.out.println("Your guess is too high. Try again.");
							correct= false;
		
						} else if (num1<randNum) {
							System.out.println("Your guess is too low. Try again.");
							correct= false;
		
						} else if (num1 == randNum) {
							System.out.println("Your guess is correct. You guessed it in " + guessCount + " tries");
							correct= true;
						}
					
					} while (!correct); 
		
		
					do {
						// non-numeric input validation

						System.out.println("Do you wanna play again?");
						String answer = input.nextLine();                

						String yes = new String ("y");
						String no = new String ("n");


						if(answer.equalsIgnoreCase(yes)) {
							input.nextLine();
							validResponse= true;
							playing=true;
						}else if(answer.equalsIgnoreCase(no)) {
							System.out.println("Thanks for playing!");
							validResponse= true;
							playing= false;
						}else {
							System.out.println("Invalid, please answer Y/N");                
						}
					} while (!validResponse);
						
		} while (playing);	
		input.close();
	}
}
