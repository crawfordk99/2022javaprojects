package week3;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter the width of the square");
		int sqWidth= Integer.parseInt(input.nextLine());
		System.out.println("Please enter the width of the rectangle");
		int recWidth= Integer.parseInt(input.nextLine());
		System.out.println("Please enter the height of the rectangle");
		int recHeight= Integer.parseInt(input.nextLine());
		
		int sqArea= sqWidth * sqWidth;
		int recArea= recWidth * recHeight;
		
		System.out.println("The area of a square with a width of 5 is " + sqArea);
		System.out.println("The area of a rectangle with a width of 4 and a height of 10 is " + recArea);
		
		

	}

}
