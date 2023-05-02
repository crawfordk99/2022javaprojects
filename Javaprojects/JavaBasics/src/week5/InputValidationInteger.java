package week5;

import java.util.Scanner;

public class InputValidationInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in= new Scanner(System.in);
		//declare variables
		String input= new String("");

		
		int num1= 0;
		int num2= 0;
		int num3= 0;
		
		boolean valid= false;
		//validation/do while loop
		do {
		System.out.println("Please enter a number: ");
		input= in.nextLine();
			try {
				num1= Integer.parseInt(input);
				valid=true;
			} catch (Exception e) {
				System.out.println("Invalid Response! Please enter a whole number.\n");
			} //end of try/catch
		
		} while (!valid);
		
		//calculations after validation
		num2= num1 + 1000;
		num3= num1 * 2;
		
		//results
		System.out.println("num1= " + num1);
		System.out.println("num2= " + num2);
		System.out.println("num3= " + num3);
		
		in.close(); //close the scanning
		
	}

}
