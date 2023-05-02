package week13;


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FormLetter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Initialize variables
        String sFilename = "Student Assignment Scores.csv";
        String sFormLetterFilename = "Warning Letter to Student -.txt";
        String sLetterFileName = "Warning Letter to Student -";
        String sFormLetterContent = "";

        System.out.printf("Opening file '%s'.%n",sFilename);        
        System.out.printf("Beginning student assignment analysis");



       // Read from the form letter
        try {
            Path filePath = Path.of(sFormLetterFilename);
            sFormLetterContent = Files.readString(filePath);
        } catch (IOException e) {
            System.out.println("File does not exist.");
        }

        try {
            File myObj = new File("Student Assignment Scores.csv");
            Scanner myReader = new Scanner(myObj);
            String data = myReader.nextLine();        // Must read the header to get to the assignment scores
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                String[] assignments = data.split(",");
                writeLetters(assignments,sFormLetterContent, sLetterFileName);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

		
	}// end of main method
	
	public static void writeLetters(String[] assignments, String sLetterContent, String sLetterFile)  {
		
		String sStudent = assignments[0];
		Boolean bZeros=false;
		try {
			for (int i=1;i<assignments.length;i++) {//checking for which assignments had a 0 on them
				if(assignments[i].equals("0")) {
					sLetterContent += "Assignment "+i+"\n";
					bZeros=true;
				}
			}
			if(bZeros) {//creating student files
				FileWriter fw = new FileWriter(sLetterFile+sStudent+".txt",true);
				fw.write("Dear "+sStudent+"\n\n"+sLetterContent+"\n");
				fw.close();
			}
		}
		catch(IOException ioe)
		{
			System.err.println("IOException: " + ioe.getMessage());
		}        
	}// end of writeLetters method
}
