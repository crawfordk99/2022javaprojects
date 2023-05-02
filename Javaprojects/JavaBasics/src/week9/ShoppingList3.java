package week9;

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
public class ShoppingList3 {
	
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
	 * Calls: getChoice(), addItems(), deleteItems(), showItems(), sortItems().
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
			System.out.println("6. Exit");
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
				saveList(shoppingList);
			case "6": // Exit the program
				System.out.println();
				System.out.println("Goodbye");
				done = true;
				break;
			default: // Handles all input that is not between 1-5
				System.out.println("Invalid response.  Please enter a choice from the menu (1-5).");
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
					shoppingList.add(food + " : " + itemAmount);
					System.out.println(food + " : " + itemAmount + " has been added to the Shopping List.");
					valid=true;
				} catch (Exception e) {
					valid=false;
				}
			}
			if (!valid) { //for some reason this only works the first time, if I enter in a second item without the format it doesn't give the warning message
				System.out.println("Invalid Entry. No ':' found. Entry must be in the form '<item>:<amount>'");
			}
		} while (true);
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
		String input= shoppingList.toString();
		int seperator= input.indexOf(":");
		
		System.out.println("-------------");
		System.out.println("Shopping List");
		System.out.println("-------------");
		String itemName= input.substring(0, seperator - 1);
		String itemAmount= input.substring(seperator + 1);
		System.out.printf("", itemName, itemAmount); //can't figure out how to format this right
		
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
	
	public static void saveList(Scanner in, ArrayList<String> shoppingList, FILENAME) {
		
	}
}			




