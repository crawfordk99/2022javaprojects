package week13;

import java.util.ArrayList;
import java.util.Scanner;

public class FormLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scoresInput= null;
		Scanner warningInput= null;
		try {// opening the scores file
			File scores= new File("Student Scores Assignment.csv");
			scoresInput= new Scanner(scores);
			String data = myReader.nextLine();// Must read the header to get to the assignment scores
			while (scoresInput.hasNextLine()) {
				data= scoresInput.nextLine();
				String[] assignmentScores= data.split(",");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("File not found");
		}
		
		try {// opening the warning letter file
			File warning= new File("Warning Letter to Student-.txt");
			warningInput= new Scanner(warning);
			warningInput.delimiter("\\Z");
			String warningLBody= warningInput.next(); //stores the whole letter into a string
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("File not found");
		}

	}// end of main method
	public static void printZeroScores(ArrayList<String[]> studentInfo) {
		System.out.printf("%-30s Student%n", "Assignment with 0");
		System.out.println("----------------------------------------------------");
		for (String[] studentsWith0 : studentInfo) {
			for (int i=0; i<studentsWith0.length; i++) {
				System.out.printf("%-30s%n", studentsWith0, i-1);
				
			}
		}
	}

}
