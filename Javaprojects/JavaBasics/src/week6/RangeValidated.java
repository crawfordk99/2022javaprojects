package week6;

import java.util.Scanner;

public class RangeValidated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);

		//what each do while loop is testing
		boolean playing= true;
		boolean validStartNum= false;
		boolean validEndNum= false;
		boolean validMultiplier= false;
		boolean validResponse= false;


		//introduction to game
		System.out.println("In this program, we will ask the user for 3 numbers. ");
		System.out.println("You will ask the user for the starting number, the ending number and the integer to be considered. ");
		System.out.println();
		
		


		do { 
			//primary loop
			int startNum= 0;
			int endNum= 0;
			int multNum= 0;

			do {
				//Starting number validation loop
				String num1= new String ("");

				try {

					System.out.println("Please enter the starting number: ");
					num1=in.nextLine();
					startNum = Integer.parseInt(num1);
					validStartNum = true;

				} catch (Exception e) {
					System.out.println("Invalid entry. Please enter a whole number. ");
				}
			} while (!validStartNum); //first number is validated

			do {
				//Ending number validation loop
				String num2= new String ("");

				try {

					System.out.println("Please enter the ending number: ");
					num2=in.nextLine();
					endNum = Integer.parseInt(num2);
					validEndNum = true;

				} catch (Exception e) {
					System.out.println("Invalid entry. Please enter a whole number. ");
				}
			} while (!validEndNum); //Second number is validated

			do {
				//Test number validation loop
				String num3= new String ("");

				try {

					System.out.println("Please enter the multiplier: ");
					num3=in.nextLine();
					multNum = Integer.parseInt(num3);
					validMultiplier = true;

				} catch (Exception e) {
					System.out.println("Invalid entry. Please enter a whole number. ");
				}
			} while (!validMultiplier); //third number is validated
			
			
			

			for (int i = startNum; i <= endNum; i++) {

				int sum= i * multNum;
				System.out.println("Multiplying " + i + " by " + multNum + " results in: " + sum);

			}



			do {
				// non-numeric input validation

				System.out.println("Do you wanna play again?");
				String answer = in.nextLine();                

				String yes = new String ("y");
				String no = new String ("n");



				if(answer.equalsIgnoreCase(yes)) {//replay
					validResponse= true;
					playing=true;
				}else if(answer.equalsIgnoreCase(no)) {//exit
					System.out.println("Thanks for playing!");
					validResponse= true;
					playing= false;
				}else {
					System.out.println("Invalid, please answer Y/N");                
				}
			} while (!validResponse);

		} while (playing);	//exit primary loop

		in.close();


	}

}
