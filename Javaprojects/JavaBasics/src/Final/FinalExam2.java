/*
 * Program: Final Exam 2
 * Name: Keith Crawford
 * Date: 12/11/22
 * Description: Arrays and Functions
 */
package Final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FinalExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//intial setup/variables
		Scanner in= new Scanner(System.in);
		ArrayList<Integer> numbers= new ArrayList<Integer>();
		String numbersEntered= new String();
		System.out.println("In this program, you will be asked to enter a series of numbers.");
		System.out.println("The program will then find the sum of the numbers, and the largest number entered.");
		
		do {//Adding to the Array List loop
			System.out.println("Please enter a whole number (or press enter when done): ");
			numbersEntered=in.nextLine();
			if (numbersEntered.equals("")) {
				break;
			}
			int addNum= Integer.parseInt(numbersEntered);
			numbers.add(addNum);
		} while (true);
		
		System.out.println("The sum of the list of numbers is: " + addNumbers(numbers));
		System.out.println("The largest number is: " + largestNumber(numbers));
		
	}// end of main method
	public static int addNumbers(ArrayList<Integer> numbers) {//Finding the sum
		int sum= 0;
		for (int nums : numbers) {
			sum += nums;
		}
		return sum;
	}//End of addNumbers method
	public static int largestNumber(ArrayList<Integer> numbers) {//Finding the largest number
		int max= 0;
		
		Collections.sort(numbers);
		for (int i=0; i<numbers.size(); i++) {
			max= numbers.get(numbers.size()-1);
		}
		
		
		return max;
	}//End of largestNum method
}//end of FinalExam2 class
