package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PasswordScanner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			//Setting up ArrayLists to separate valid and invalid passwords
		ArrayList<String> validPasswords= new ArrayList<String>();
		ArrayList<String> invalidPasswords= new ArrayList<String>();
		
		//checking for file
		File passwords= new File("Pwd.txt");
		Scanner inPwds= null;	
		System.out.println("Beginning password analysis."); 
		try {
			System.out.println("Opening file 'Pwd.txt' ");
			inPwds= new Scanner(passwords);
			while (inPwds.hasNextLine()) { //read through the file
				String pWord= inPwds.nextLine(); //grab the passwords
				if (hasUpper(pWord)== true && hasLower(pWord)== true && hasNumber(pWord)== true && hasSpecial(pWord)== true) {
					validPasswords.add(pWord);
				} else {
					invalidPasswords.add(pWord);
				}
			}
			PrintWriter myPrinter1= new PrintWriter("Valid Passwords.txt");//create the valid Passwords file
			
			for (String validPwds : validPasswords) {//creating Valid passwords file
				myPrinter1.println(validPwds);
			}
			myPrinter1.close();
			
			PrintWriter myPrinter2= new PrintWriter("Invalid Passwords.txt");
			
			for (String invalidPwds : invalidPasswords) {//creating invalid passwords file
				myPrinter2.println(invalidPwds);	
			}
			myPrinter2.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Error! File not found.");
		}
	
		
		
		System.out.println("Analysis complete. Closing files.");
		System.out.println("Results can be found in files 'invalidpwd.txt' and 'validpwd.txt' in the ");
		System.out.println("C:\\MyLDSBC\\CS105\\eclipse-workspace\\CD105\\ directory.\n" + " ");
		
		if (inPwds != null) { //close scanner
			inPwds.close();
		}
	}// end of main method
	/**Each of these other methods is used to determine if the Passwords are valid or not.
	 * 
	 * @param passwordsCheck
	 * @return
	 */
	public static boolean hasUpper(String passwordsCheck) {
		
		for (char p : passwordsCheck.toCharArray()) {
			if (Character.isUpperCase(p)) {
				return true;
			}
		}
		
		
		return false;
	}
	public static boolean hasLower(String passwordsCheck) {
		
		for (char p : passwordsCheck.toCharArray()) {
			if (Character.isLowerCase(p)) {
				return true;
			}
		}
		
		return false;
	}
	public static boolean hasNumber(String passwordsCheck) {
		
		for (char p : passwordsCheck.toCharArray()) {
			if (Character.isDigit(p)) {
				return true;
			}
		}
		
		return false;
	}
	public static boolean hasSpecial(String passwordsCheck) {
		ArrayList<Character> specialCharacters= new ArrayList<Character>();//Setting up which special characters to check for.
		specialCharacters.add('@');
		specialCharacters.add('#');
		specialCharacters.add('%');
		specialCharacters.add('-');
		specialCharacters.add('&');
		specialCharacters.add('*');
		
		for (char p : passwordsCheck.toCharArray()) {
			if (specialCharacters.contains(p)) {
				return true;
			}
		}
		
		
		return false;
	}
}
