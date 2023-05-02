package week10;

import java.util.Scanner;

import java.io.File;

public class StudentScores1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= null;
		try {
			in= new Scanner(new File("Student Assignment Scores.csv"));
			
			while(in.hasNextLine()); {
				System.out.println(in.nextLine());
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
