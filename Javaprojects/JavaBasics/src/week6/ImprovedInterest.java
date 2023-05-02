package week6;

import java.util.Scanner;

public class ImprovedInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("Amount deposited each month: ");
		
		//variables to help validate/run infinite loop
		boolean validDeposit= false;
		boolean validAnnRate= false;
		boolean validNumOfMonths= false;
		boolean playing= true;
		boolean validResponse= false;
		
		//interest rate variables
		double deposit = 0;
		double annRate= 0;
		int numOfMonths= 0;
		
		
		System.out.println("This program will ask the user for a monthly deposit, an annual interest rate and the number of months the user plans on saving. ");
		System.out.println("It will then show the monthly balance over the period of planned savings. ");
		System.out.println();


		do { 
			//primary loop
			

			do {
				//amount deposited validation loop

				try {

					System.out.println("Please enter the amount to be deposited each month:  ");
					deposit= Double.parseDouble(in.nextLine());
					validDeposit = true;

				} catch (Exception e) {
					System.out.println("Invalid entry. Please enter a whole number. ");
				}
			} while (!validDeposit); //deposit is validated

			do {
				//annual rate validation loop

				try {

					System.out.println("Please enter the annual rate: ");
					annRate= Double.parseDouble(in.nextLine());
					validAnnRate = true;

				} catch (Exception e) {
					System.out.println("Invalid entry. Please enter a whole number. ");
				}
			} while (!validAnnRate); //Annual Rate is validated

			do {
				//number of months validation loop

				try {

					System.out.println("Please enter the number of months you plan to save: ");
					numOfMonths= Integer.parseInt(in.nextLine());
					validNumOfMonths = true;

				} catch (Exception e) {
					System.out.println("Invalid entry. Please enter a whole number. ");
				}
			} while (!validNumOfMonths); //number of months is validated
			
			//the actual game/monthly deposit totals
			System.out.println("The following table shows the balance of the account for each month of the designated savings period. ");
			System.out.println("Month     Balance");
			
			double monRate= (annRate/100/12);
			double balance= 0;
			
			for (int i = 1; i <= numOfMonths ; i++) {
				
				balance= (balance + deposit) * (1 + monRate);
				
				System.out.printf("Month %d: $%,.2f%n", i, balance);
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
