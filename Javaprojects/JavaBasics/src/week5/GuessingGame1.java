package week5;

import java.util.Scanner;

import java.lang.Math;

public class GuessingGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int max = 100;
	        int min = 1;
	        int range = max-min + 1;
	        int randNum= (int)(Math.random() * range) +min;



	       Scanner input= new Scanner(System.in);

	       boolean playing= true;
	       do {
	       String guess= new String ("");
	        int num1= 0;
	        
	        
	            do {
	            	int guessCount= 0;
		            			do {
		            				//numeric validation loop
		            				
		            				boolean validGuess= false;
		            				try{
				            		System.out.println("What is your guess? ");
				            		num1 = Integer.parseInt(guess);
				                    validGuess = true;
	
		            				} catch (Exception e) {
		            				System.out.println("Invalid entry Please try a whole number");
		            			} while (!validGuess);
		            
		            
		            		do {
		            			//game loop
		            		
		            			guessCount += 0;
		            			boolean correct= false;
		            			if (num1>randNum) {
		                        System.out.println("Your guess is too high. Try again.");
		                        correct= false;
		                        
		            			} else if (num1<randNum) {
		                        System.out.println("Your guess is too low. Try again.");
		                        correct= false;
		                        
		            			} else if (num1 == randNum) {
		                    	System.out.println("Your guess is correct. You guessed it in " + guessCount + "tries");
		                        correct= true;
		                    } while (!correct);
	            
	                
			                do {
			                // non-numeric input validation
			                
				                System.out.println("Do you wanna play again?");
				                String answer = input.nextLine();                
				                
				                String yes = new String ("y");
				                String no = new String ("n");
				                boolean playAgain= true;
				                
				                if(answer.equalsIgnoreCase(yes)) {
				                    input.nextLine();
				                    playAgain= true;
				                    playing=true;
				                }else if(answer.equalsIgnoreCase(no)) {
				                    System.out.println("thanks for playing");
				                    playAgain= false;
				                    playing= false;
				                }else {
				                    System.out.println("Invalid, please answer Y/N");                
			                } while (playAgain);




	   } while (playing);





	      } while (!valid);


		
		
		
				

	}

}
