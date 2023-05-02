package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner

public class PasswordScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Beginning password analysis."); 
		
		try {// opening the file
            File passwords = new File("Pwd.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        }
		
		try { //creating the invalid passwords file
			File invalidPwds= new File(passwords); 
			if (invalidPwds.createNewFile()) {
				System.out.println("File created: " + invalidPwds.getName());
			}
		} catch (Exception e) {
			System.out.println("An error occurred.");
		}
		
		try { //creating the valid passwords file
			File validPwds= new File(passwords); 
			if (validPwds.createNewFile()) {
				System.out.println("File created: " + validPwds.getName());
			}
		} catch (Exception e) {
				System.out.println("An error occurred.");	
			
		if (thruPwd != null;) {
			thruPwd.close();
		}
	}
	public static void hasUpper(String passwordsCheck) {
		
	}
	public static void hasLower(String passwordsCheck) {
		
	}
	public static void hasNumber(String passwordsCheck) {
		
	}
	public static void hasSpecial(String passwordsCheck) {
		
	}
}
