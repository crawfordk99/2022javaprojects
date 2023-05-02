package week3;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner (System.in);
		
		
		
		System.out.println("Amount deposited each month");
		double deposit = Double.parseDouble(in.nextLine());
		System.out.println("What's the annual interest rate");
		double aRat= Double.parseDouble(in.nextLine());
		double mrt= aRat/100/12;
		
		double dOne= deposit * (1 + mrt);
		double dTwo= (dOne + deposit) * (1 + mrt);
		double dThree= (dTwo + deposit) * (1 + mrt);
		double dFour= (dThree + deposit) * (1 + mrt);
		double dFive= (dFour + deposit) * (1 + mrt);
		double dSix= (dFive + deposit) * (1 + mrt);
		
		System.out.println("The ending balance after 6 months is: $" + dSix);


		

	}

}
