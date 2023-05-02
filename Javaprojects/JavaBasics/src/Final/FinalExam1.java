/*
 * Program: Final Exam 1
 * Name: Keith Crawford
 * Date: 12/11/22
 * Description: Strings
 */
package Final;

import java.util.Scanner;

public class FinalExam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initial setup/variables
		Scanner in= new Scanner(System.in);
		String name= new String();
		String ward= new String();
		int males= 0;
		int females= 0;
		boolean valid= false;
		boolean validMales= false;
		boolean validFemales= false;
		
		System.out.print("Please enter your name: " + name);
		name=in.nextLine();
		System.out.print("Please enter the name of your ward: " + ward);
		ward=in.nextLine();
		
		do {//Main loop
			do {//Male validation loop
				System.out.println("Please enter the approximate number of adult males in the ward: ");
				String sMales= new String("");
				try {//integer validation
					sMales=in.nextLine();
					males=Integer.parseInt(sMales);
					validMales= true;
				} catch (Exception e) {
					System.out.println("Invalid Response! Please enter a whole number. ");
					validMales= false;
				}
			} while (!validMales);
			do {//Female validation loop
				System.out.println("Please enter the approximate number of adult females in the ward: ");
				String sFemales= new String("");
				try { //integer validation
					sFemales=in.nextLine();
					females=Integer.parseInt(sFemales);
					validFemales= true;
				} catch (Exception e) {
					System.out.println("Invalid Response! Please enter a whole number. ");
					validFemales= false;
				}
			} while (!validFemales);
			valid= true;
		} while (!valid);
		
		int total= females + males;//The total amount of members in the ward.
		
		System.out.printf("There are %d adult members in %s's %s ward", total, name, ward);
		
		
		
		
	}

}
