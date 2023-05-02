package week10;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentScores3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String[]> studentInfo= loadFileData("Student Assignment Scores.csv");
		
		System.out.printf("%-30s%7s%7s%7s%7s%7s%7s%n", "Student", "Asn 1","Asn 2","Asn 3","Asn 4","Asn 5","Asn 6");
		for (String[] studentScores : studentInfo) {
			System.out.println("--------------------------------------------------------------------------------");
			System.out.printf("%-30s%7s%7s%7s%7s%7s%7s%n", studentScores[0], studentScores[1], studentScores[2], studentScores[3], studentScores[4], studentScores[5], studentScores[6]);
		}
		
		printZeroScores(studentInfo);
		
	}
	
	public static void printZeroScores(ArrayList<String[]> studentInfo) {
		System.out.printf("%-30s Student%n", "Assignment with 0");
		System.out.println("----------------------------------------------------");
		for (String[] studentsWith0 : studentInfo) {
			for (int i=0; i<studentsWith0.length; i++) {
				System.out.printf("%-30s%n", studentsWith0, i-1);
				
			}
		}
	}
	
	public static ArrayList<String[]> loadFileData(String name) {
		Scanner in= null;
		ArrayList<String[]> data= new ArrayList<String[]>();
		try {
			in= new Scanner(new File("Student Assignment Scores.csv"));
			//skip the header line
			in.nextLine();
			
			while(in.hasNextLine()); {
				String [] studentScores= in.nextLine().split(",");
				data.add(studentScores);
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
			   in.close();
			}
		}
		return data;
	}

}
