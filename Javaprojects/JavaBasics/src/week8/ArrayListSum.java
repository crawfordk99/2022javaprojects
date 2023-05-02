package week8;

import java.util.Scanner;

import java.util.ArrayList;

public class ArrayListSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		
		
		
		//Explanation
		System.out.println("This program will ask the user to enter a series of numbers.");
		System.out.println("The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.");
		System.out.println("The program will then display the array of numbers and the sum total of those numbers.");
		
		
		boolean playing=true;
		
	
			
		do {	//main loop
			
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			
			
			do { //validation loop
				System.out.println("Please enter a number (or just hit enter to finish): ");
				String input= in.nextLine();

				if (input.equals("")) { //stops the loop if user hits enter
					break;
				}
				try {
					int value= Integer.parseInt(input);
					numbers.add(value);
				} catch (Exception e) {
					System.out.println("Invalid response! Please enter a whole number. ");
				}
			} while (true);

			System.out.println("Index   Item");

			for (int i= 0; i<numbers.size(); i++){ //going through the user input

				System.out.println(i + "           " + numbers.get(i));

			}
			//results
			System.out.println("There are " + numbers.size() + " items in the list. ");
			System.out.println("The sum total of the numbers in the ArrayList are " + sumValues(numbers));
			
			  ArrayList<Integer> secondNum = new ArrayList<Integer>();
              secondNum = dups(numbers);



             if (secondNum.size()==0) {
                  System.out.println("No numbers were duplicated in the ArrayList.");                
              }
              else {
                  System.out.println("The following numbers were duplicated in the ArrayList: "+secondNum.subList(0, secondNum.size()));
              }


			System.out.println("Do you want to play again? Y/N ");
			boolean spellCorrect= false;

			do {
				//Playing validation set up

				String yesOrNo=(in.nextLine());


				if (yesOrNo.equalsIgnoreCase("Y")) { //Play again validation
					spellCorrect=true;
					playing=true;
				} else if (yesOrNo.equalsIgnoreCase("N")) {
					spellCorrect=true;
					playing=false;
				} else {
					System.out.println("Invalid response! Please enter a Y/N"); 
					spellCorrect= false;
				} 
			} while (!spellCorrect);


		} while(playing);	
		
		in.close();

	}
	public static int sumValues(ArrayList<Integer> numbers) {
		int sum= 0;
		for (int i= 0; i<numbers.size(); i++) {
			sum += numbers.get(i);
		}
		return sum;
		
	}
	
	public static ArrayList<Integer> dups(ArrayList<Integer> numbers) {
		ArrayList<Integer> dupsArray = new ArrayList<Integer>();
        for (int i = 0; i < numbers.size(); i++)
        {
            for (int j = i + 1; j < numbers.size(); j++) {
            
                if (numbers.get(i) == numbers.get(j)) {
                    if (!dupsArray.contains(numbers.get(i))){
                        dupsArray.add(numbers.get(i));
                    }
                }
            }         
        }
        return dupsArray;
	}

}
