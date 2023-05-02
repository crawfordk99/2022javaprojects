package week4;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner (System.in);
		
		System.out.println("Please enter a person's height in inches: ");
		String hei= in.nextLine();
		System.out.println("Please enter a person's weight in pounds: ");
		String wei= in.nextLine();
		
		double met= .0254;
		double kg= .45359237;
		
		double height= Double.parseDouble(hei);
		double weight= Double.parseDouble(wei);
		
		double metHeight= (met * height);
		double kgWeight= (kg * weight);
		
		double bmi= (kgWeight / (metHeight * metHeight));
		
		if (bmi<18.5) {
			System.out.println("The person's BMI is: " + bmi + ". The person has a BMI classification of: Underweight.");
		} else if (bmi>=18.5 && bmi<24.9) {
			System.out.println("The person's BMI is: " + bmi + ". The person has a BMI classification of: Normal.");
		} else if (bmi>=24.9 && bmi<29.9) {
			System.out.println("The person's BMI is: " + bmi + ". The person has a BMI classification of: Overweight.");
		} else { 
			System.out.println("The person's BMI is: " + bmi + ". The person has a BMI classification of: Obese.");
		}
		

	}

}
