package week12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

/**
 * The starter code to an application that a user can use for a shopping list.
 * This provides simple operations like add, delete, show, sort, and exit.
 * 
 * @author Jeff Light
 * @author Alex May (modified by)
 *
 */
public class shoppingList4 {
	
	/**
	 * main() method displays a menu to the user and asks them to select a 
command.
	 * The method will continue to display the menu to the user until they wish 
to
	 * quit by selecting 'Exit' from the menu.
	 * <p>
	 * The method also creates a new, empty shoppingList of type 
ArrayList<String>
	 * Based on the user input, the appropriate method will be called to perform
	 * actions on the shoppingList.
	 * <p>
	 * Calls: getChoice(), addItems(), deleteItems(), showItems(), sortItems(), saveList().
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize variables
		Scanner sIn = new Scanner(System.in); // Input Scanner for String
		ArrayList<String> shoppingList = new ArrayList<String>(); // ArrayList for shoppingList
		String choice; // Holds user input of type String
		boolean done = false; // Keeps program running until user wants to quit
		// Keep running the program until the user quits
		do {
			// Print out the menu to the console
			System.out.println();
			System.out.println("1. Add Items");
			System.out.println("2. Delete Items");
			System.out.println("3. Show Items");
			System.out.println("4. Sort Items");
			System.out.println("5. Save List");
			System.out.println("6. Open List");
			System.out.println("7. Exit");
			System.out.print("Please enter a command: ");
			choice = sIn.nextLine();
			// Call the appropriate method for the choice selected.
			switch (choice) {
			case "1": // Add items to the Shopping List
				System.out.println(addItems(sIn, shoppingList) + " items have been added to your Shopping List.");
				break;
			case "2": // Delete items from the Shopping List
				System.out.println(deleteItems(sIn, shoppingList) + " items have been deleted from your Shopping List.");
				break;
			case "3": // Show the items in the Shopping List
				showItems(shoppingList);
				break;
			case "4": // Sort the items in the Shopping List
				sortItems(shoppingList);
				break;
			case "5": //Save the Shopping List to a file
				saveList(sIn, shoppingList, "Shopping List.txt");
				break;
			case "6": //Open the Shopping List file
				openList(sIn, shoppingList, "Shopping List.txt");
				break;
			case "7": // Exit the program
				System.out.println();
				System.out.println("Goodbye");
				done = true;
				break;
			default: // Handles all input that is not between 1-7
				System.out.println("Invalid response.  Please enter a choice from the menu (1-7).");
			} // End of switch (choice)
		} while (!done); // Keep running the program until the user quits
		sIn.close();
	}// end of main()
	//////////////////////////////////////////////
	// STUDENTS, FILL IN THE METHOD STUBS BELOW://
	// addItems() //
	// deleteItems() //
	// showItems() //
	// sortItems() //
	//////////////////////////////////////////////

	public static int addItems(Scanner sIn, ArrayList<String> shoppingList) {
		// FIXME: implement the method
		int value= shoppingList.size();
		String input=new String();
		boolean valid=false;
		do { //adding items loop
			System.out.println("Add an item to the list (or just press enter when done): ");
			input=sIn.nextLine();

			if (input.equals("")) {
				break;
			}
			if (input.contains(":")) {
				int seperator= input.indexOf(":");
				String food= input.substring(0, seperator).trim();// first half 
				int itemAmount= 0;
				try {
					String item= input.substring(seperator + 1).trim();// second half
					itemAmount= Integer.parseInt(item);
					shoppingList.add(food +  ":" + itemAmount);
					System.out.println(food + ":" + itemAmount + " has been added to the Shopping List.");
					valid=true;
				} catch (Exception e) {
					valid=false;
				}
			}
			if (!valid) { //for some reason this only works the first time, if I enter in a second item without the format it doesn't give the warning message
				System.out.println("Invalid Entry. No ':' found. Entry must be in the form '<item>:<amount>'");
			}
		} while (true);
		value= shoppingList.size()-value;
		return value;//# of items added
		


	}// end of method addItems(ArrayList<String>)

	/**
	 * Asks the user to enter an item to be deleted from the shoppingList and then
	 * deletes the item from the shoppingList ArrayList. The user may delete as many
	 * items as they want, hitting ENTER to stop deleting items and return to
	 * main(). Each time the user deletes an item from the list, a message will be
	 * displayed showing the item deleted in the following format:
	 * <p>
	 * 'item' has been deleted from the Shopping List.
	 * <p>
	 * Example -- 'Peaches' has been deleted from the Shopping List.
	 * <p>
	 * If the user tries to delete an item not in the list, a message will be
	 * displayed indicating the error and showItems() will be called. Returns the
	 * number of items deleted from the shoppingList
	 * 
	 * @param sIn          - The scanner to allow to get user input from the console
	 * @param shoppingList - The array list to store the items of the shopping list
	 * @return - the number of items deleted from the shopping list
	 */
	public static int deleteItems(Scanner sIn, ArrayList<String> shoppingList) {
		// FIXME: implement the method
		int value= shoppingList.size();
		do { //removing items loop
			System.out.println("Remove an item from the list (or just press enter when done): ");
			String input=sIn.nextLine();
			
			if (input.equals("")) {
				break;
			} 
			if (shoppingList.contains(input)) {
					shoppingList.remove(input);
					System.out.println(input + " has been removed from the shopping list");
					System.out.println();
			} else {
					System.out.println("Invalid Response! " + input + " is not an item in the list.");
					showItems(shoppingList);
			}
							
		} while(true);
		
		value= value - shoppingList.size();
		
		return value; //# of items deleted
	}// end of method deleteItems(ArrayList<String>)

	/**
	 * Simply displays the contents of the shoppingList ArrayList in it's 
		simplest
	 * form. <br>
	 * Example --
	 * <p>
	 * The Shopping List contains the following items: <br>
	 * [item-1, item-2, item-n]
	 * <p>
	 * 
	 * @param shoppingList - The ArrayList that stores the shopping list
	 */

	public static void showItems(ArrayList<String> shoppingList) {
		// FIXME: implement the method
		System.out.println("-------------");
		System.out.println("Shopping List");
		System.out.println("-------------");
		for (int index = 0; index < shoppingList.size(); index++) {
			String item = shoppingList.get(index);
			int separator = item.indexOf(":");
			String itemName = item.substring(0, separator);
			String itemAmount = item.substring(separator + 1);
			System.out.printf("%-15s%5s%n", itemName, itemAmount); 
		}
		
	}// end of method showItems(ArrayList<String>)
	/**
	 * Sorts the items in the shoppingList ArrayList, then calls showItems() to
	 * display the sorted list. Example --
	 * <p>
	 * The Shopping List contains the following items: <br>
	 * [item-1, item-2, item-n]
	 * <p>
	 * 
	 * @param shoppingList - The ArrayList that stores the shopping list
	 */
	public static void sortItems(ArrayList<String> shoppingList) {
		// FIXME: implement the method
		Collections.sort(shoppingList);
		showItems(shoppingList);
	}// end of method sortItems(ArrayList<String>)
	
	public static void saveList(Scanner in, ArrayList<String> shoppingList, String fileName) {
		
		if (shoppingList.size()== 0) { //if nothing has been added to the shopping list, return to main menu
			System.out.println("No new Shopping List file data to add.");
			return;
		}


		if (shoppingList.size()!= 0) {//checking to see if there is data in the ArrayList already
			boolean valid=false;
			do {//input validation/making sure they're okay with the old data being replaced
				System.out.println("Are you sure you want to overwrite the fileList data? Y/N");
				String yesOrNo= in.nextLine(); 
				if (yesOrNo.equalsIgnoreCase("y")) {

					valid=true;
				} else if (yesOrNo.equalsIgnoreCase("n")) {
					System.out.println("Shopping List is not saved.");
					valid=true;
					return;
				} else {
					System.out.println("Invalid response! Please enter a Y/N");
				}
			} while (!valid); 

		}

		try { //creating the file
			File fileList= new File(fileName); 
			if (fileList.createNewFile()) {
				System.out.println("File created: " + fileList.getName());
			}
		} catch (Exception e) {
			System.out.println("An error occurred.");
		}

		try {// writing the data into the file
			FileWriter myWriter = new FileWriter(fileName);
			for(String str: shoppingList) {
				myWriter.write(str + System.lineSeparator());

			}
			System.out.println("Shopping List saved to file: Shopping List.txt");
			myWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 

	} //end of method saveList
	public static void openList(Scanner in, ArrayList<String> shoppingList, String fileName) {
		
		
		if (shoppingList.size()!= 0) {//checking to see if items were added to the shoppingList already
			boolean valid=false;
			do {//input validation/making sure they're okay with the old data being replaced
				System.out.println("Are you sure you want to overwrite the fileList data? Y/N");
				String yesOrNo= in.nextLine(); 
				if (yesOrNo.equalsIgnoreCase("y")) {
					valid=true;
					shoppingList.clear();
				} else if (yesOrNo.equalsIgnoreCase("n")) {
					System.out.println("Shopping List is not saved.");
					valid=true;
					return;
				} else {
					System.out.println("Invalid response! Please enter a Y/N");
				}
			} while (!valid); 
		}
	
		 // Read from the file
        try {
            File myObj = new File(fileName);
             Scanner myFile = new Scanner(myObj);
             //FileReader myFile = new FileReader(sFile);
             while(myFile.hasNextLine()){
                 shoppingList.add(myFile.nextLine());
             }
             myFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        }



       System.out.println("The current shopping list has been overwritten with '"+ fileName +"' file.");


		
	} //end of method openList
}			

		
		
		