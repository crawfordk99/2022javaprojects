package week7;

import java.util.Scanner;

public class GetValidX1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		//Play the game until the user says they don't want to play again.
		String playAgain = "Y";
		while (playAgain.equalsIgnoreCase("Y")) {

			//Get an integer from the user
			int intNum = getValidInt(in, "Please enter a whole number: ", "Invalid Response! Please enter a whole number.");
			System.out.printf("The whole number your entered was: %d.%n", intNum);
			System.out.println("Now we will test your whole number in a math equation...");
			System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.%n", intNum, intNum + 10);
			System.out.println();

			//Get a floating-point from the user
			double doubleNum = getValidDouble(in, "Please enter a decimal-point number: ", "Invalid Response! Please enter a number.");
			System.out.printf("The float your entered was: %f.%n", doubleNum);
			System.out.println("Now we will test your floating-point number in a math equation...");
			System.out.printf("Adding 10 to your float would be: 10 + %f = %f.%n", doubleNum, doubleNum + 10);
			System.out.println();

			//Get a 'Y' or 'N' from the user
			playAgain = getValidYN(in, "Would you like to play again? (Y/N): ", "Invalid Response! Please answer with a 'Y' or 'N'");
			System.out.println();
		}// end of while (playAgain.equalsIgnoreCase("y"))
	}// end of Main()
	public static int getValidInt(Scanner in, String question, String warning) {

		String num1= new String ("");
		boolean validInt = false;
		int userNumInt = 0;
		do { //validation
			try {
				System.out.println(question);
				num1 = in.nextLine();
				userNumInt = Integer.parseInt(num1);
				validInt = true;



			} catch (Exception e) {
				System.out.println(warning);
				validInt = false;
			}
		} while (!validInt);

			return userNumInt;
		
	}
	
	public static double getValidDouble(Scanner in, String question, String warning) {


		String num2= new String ("");
		boolean validDouble = false;
		double userNumDouble = 0;
		do { //validation
			try {


				System.out.println(question);
				num2 = in.nextLine();
				userNumDouble = Double.parseDouble(num2);
				validDouble = true;



			} catch (Exception e) {
				System.out.println(warning);
				validDouble= false;
			}
		} while (!validDouble);


			return userNumDouble;
	}
	
	public static String getValidYN(Scanner in, String question, String warning) {
		
	    String answer= new String("");   
		boolean validInput= false;
		
			do {
				System.out.println(question);
				answer = in.nextLine();   
				if(answer.equalsIgnoreCase("y")) {//replay
					validInput= true;
				}else if(answer.equalsIgnoreCase("n")) {//exit
					System.out.println("Thanks for playing!");
					validInput= true;
				}else {
					System.out.println(warning);  
					validInput=false;
				} 
			} while (!validInput);
		
		return answer; 
		
	}
	
}
