package week6;

import java.util.Scanner;

public class DivisibleByX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in= new Scanner(System.in);

		//what each do while loop is testing
		boolean playing= true;
		boolean validStartNum= false;
		boolean validEndNum= false;
		boolean validTestNum= false;
		boolean validResponse= false;


		//introduction to game
		System.out.println("In this program, we will display a series of numbers divisible by an integer specified by the user. ");
		System.out.println("You will ask the user for the starting number, the ending number and the integer to be considered. ");
		System.out.println();
		
		


		do { 
			//primary loop
			int startNum= 0;
			int endNum= 0;
			int testNum= 0;

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

					System.out.println("Please enter the test number: ");
					num3=in.nextLine();
					testNum = Integer.parseInt(num3);
					validTestNum = true;

				} catch (Exception e) {
					System.out.println("Invalid entry. Please enter a whole number. ");
				}
			} while (!validTestNum); //third number is validated
			
			//the actual game/testing of the numbers
			System.out.println("Here are the numbers between " + startNum + " and " + endNum + " divisible by " + testNum);

			for (int i = startNum; i <= endNum; i++) {

				if (i % testNum == 0 ) {
					System.out.println(i);//print out every i number that meets the for and if conditions
				}

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
