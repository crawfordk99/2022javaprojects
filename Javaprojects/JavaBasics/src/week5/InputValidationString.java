package week5;

import java.util.Scanner;

public class InputValidationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in= new Scanner(System.in);
		
		boolean validResponse= false;
		
		//user is being asked a yes or no question.
		do {
			System.out.println("Do you like to code in Java? Y/N ");
			String yesOrNo= in.nextLine();
				if (yesOrNo.equalsIgnoreCase("Y")) {
					validResponse= true;
					System.out.println("That's great! I do too!");
				} else if (yesOrNo.equalsIgnoreCase("N")) {
					validResponse= true;
					System.out.println("That's ok. There are many wonderful things in life to learn.");
				} else {
					System.out.println("Invalid Response! Please answer with a Y/y or N/n.");
					validResponse= false;
				}
				
			//Response has been validated, therefore, the loop can be closed.
			} while (!validResponse);
		
			
		in.close();
		
	}

}
