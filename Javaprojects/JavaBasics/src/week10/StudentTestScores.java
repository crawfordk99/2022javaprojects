package week10;

import java.io.File;// Import the File
import java.io.FileNotFoundException;// Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner; // Import the Scanner class to read text files

public class StudentTestScores {

	public static void main(String[] args) {
		// Setup the Percentages and Grades        
		int[] iPercentages = new int[] {94,90,87,84,80,77,74,70,67,64,60,-1};// 12 items        
		String[] sGrades = new String[] {"A","A-","B+","B","B-","C+","C","C-","D+","D","D-","E"};// 12 items        
		ArrayList<String[]> sArray = new ArrayList<String[]>();
		
		try { //loading data
			File myObj = new File("Student Test Grades.csv");
			Scanner myReader = new Scanner(myObj);
			String[] values = myReader.nextLine().split(",");
			sArray.add(values);
			while (myReader.hasNextLine()) {
				values = myReader.nextLine().split(",");
				for (int i=1;i<values.length;i++) { 
					for (int x = 0; x < iPercentages.length; x++) {
						if (Integer.parseInt(values[i]) > iPercentages[x]) {
							values[i]=sGrades[x];
							break;
						}
					}
				}
				sArray.add(values);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		System.out.printf("----------------------------------------------------------%n");
		System.out.printf("%-25s%10s%10s%10s%n",sArray.get(0)[0],sArray.get(0)[1],sArray.get(0)[2],sArray.get(0)[3]);
		System.out.printf("----------------------------------------------------------%n%n");

		for (int i=1;i<sArray.size();i++) {
			System.out.printf("%-30s%-10s%-10s%-10s%n", sArray.get(i)[0], sArray.get(i)[1], sArray.get(i)[2], sArray.get(i)[3]);  
		}
	

	}

}

