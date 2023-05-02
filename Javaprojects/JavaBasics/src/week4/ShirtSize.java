package week4;

import java.util.Scanner;

public class ShirtSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in= new Scanner(System.in);
		
		System.out.println("Please enter the customer's chest measurement in inches");
		String input= in.nextLine();
		int chestSize= Integer.parseInt(input);
		
		if (chestSize<38) {
			System.out.println("S");
		} else if (chestSize>=38 && chestSize<40) {
			System.out.println("M");
		} else if (chestSize>=40 && chestSize<43) {
			System.out.println("L");
		} else if (chestSize>=43 && chestSize<46) {
			System.out.println("XL");
		} else {
			System.out.println("XXL");
		}
		
		
	}

}
