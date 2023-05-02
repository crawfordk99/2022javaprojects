package week7;

import java.util.Scanner;

public class IsBetween {

	public static void main(String[] args) {

		Scanner in= new Scanner(System.in);

		//what each do while loop is testing
		boolean playing= true;
		boolean validLowNum= false;
		boolean validBetweenNum= false;
		boolean validHighNum= false;



		//introduction to game
		System.out.println("In this program, we will ask the user for 3 numbers, and determine if the second numbers lies between the first and the third. ");

		System.out.println();




		do { 
			//primary loop
			int lowNum= 0;
			int betweenNum= 0;
			int highNum= 0;

			do {
				//Low number validation loop
				String num1= new String ("");

				try {

					System.out.println("Please enter the low number: ");
					num1=in.nextLine();
					lowNum = Integer.parseInt(num1);
					validLowNum = true;

				} catch (Exception e) {
					System.out.println("Invalid entry. Please enter a whole number. ");
				}
			} while (!validLowNum); //Low number is validated

			do {
				//Between number validation loop
				String num2= new String ("");

				try {

					System.out.println("Please enter the between number: ");
					num2=in.nextLine();
					betweenNum = Integer.parseInt(num2);
					validBetweenNum = true;

				} catch (Exception e) {
					System.out.println("Invalid entry. Please enter a whole number. ");
				}
			} while (!validBetweenNum); //Between number is validated

			do {
				//High number validation loop
				String num3= new String ("");

				try {

					System.out.println("Please enter the high number: ");
					num3=in.nextLine();
					highNum = Integer.parseInt(num3);
					validHighNum = true;

				} catch (Exception e) {
					System.out.println("Invalid entry. Please enter a whole number. ");
				}
			} while (!validHighNum); //High number is validated

			//calling the method
			if (isBetween(lowNum, betweenNum, highNum)==true) {
				System.out.println(betweenNum + " lies between the numbers " + lowNum + " and " + highNum);
			} else {
				System.out.println(betweenNum + " does not lie in between " +lowNum + " and " + highNum);
			}

			//for the non-numeric validation
			boolean validInput= false;


			do {
				// non-numeric input validation

				System.out.println("Do you wanna play again?");
				String answer = in.nextLine();                

				if(answer.equalsIgnoreCase("y")) {//replay
					validInput= true;
					playing=true;
				}else if(answer.equalsIgnoreCase("n")) {//exit
					System.out.println("Thanks for playing!");
					validInput= true;
					playing= false;
				}else {
					System.out.println("Invalid response, please answer Y/N");    
					validInput=false;
				}
			} while (!validInput);

		} while (playing);	//exit primary loop

		in.close();

	}
	//creating the second method
	public static boolean isBetween(int a, int b, int c) {

		if (a < b && c > b) {
			return true;
		} else {
			return false;
		}


	}
}	
		

