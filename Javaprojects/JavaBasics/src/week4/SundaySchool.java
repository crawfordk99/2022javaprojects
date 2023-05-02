package week4;

import java.util.Scanner;

public class SundaySchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		
		System.out.println("Please enter the member's age: ");
		String input= in.nextLine();
		
		
		int a= Integer.parseInt(input);
		
		if (a<1) {
			System.out.println("Babe in Arms");
		} else if (a>=1 && a<3) {
			System.out.println("Nursery");
		} else if (a>=3 && a<12) {
			System.out.println("Primary");
		} else if (a>=12 && a<18) {
			System.out.println("Please enter member's gender: ");
			String gen= in.nextLine();
			String f= new String("f");
			String m= new String("m");
			
			if (gen.equalsIgnoreCase(f)) {
				System.out.println("Young Women's");
			} else if (gen.equalsIgnoreCase(m)) { 
				System.out.println("Young Men's");
			}
		} else if (a>=18) {
			System.out.println("Please enter member's gender: ");
			String gen= in.nextLine();
			String f= new String("f");
			String m= new String("m");
			
			if (gen.equalsIgnoreCase(f)) {
				System.out.println("Relief Society");
			} else if (gen.equalsIgnoreCase(m)) {
				System.out.println("Elders Quorum");
			}
			
			
		}

	}

}
