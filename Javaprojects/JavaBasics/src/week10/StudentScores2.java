package week10;

import java.io.File;
import java.util.Scanner;

public class StudentScores2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= null;
		try {
			in= new Scanner(new File("Student Assignment Scores.csv"));
			
			System.out.printf("%-30s%7s%7s%7s%7s%7s%7s%n", "Student", "Asn 1","Asn 2","Asn 3","Asn 4","Asn 5","Asn 6");
			
			System.out.println("--------------------------------------------------------------------------------");
			
			while(in.hasNextLine()); {
				String [] studentScores= in.nextLine().split(",");
				
				System.out.printf("%-30s%7s%7s%7s%7s%7s%7s%n", studentScores[0], studentScores[1],studentScores[2],studentScores[3],studentScores[4],studentScores[5],studentScores[6]);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
			   in.close();
			}
		}

	}

}
