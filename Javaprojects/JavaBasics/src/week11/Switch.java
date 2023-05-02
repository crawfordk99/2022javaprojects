package week11;
import java.util.Scanner;



public class Switch {



	public static void main(String[] args) {



		Scanner sIn = new Scanner(System.in);
		String[] sApostles = new String[] {"Russell M. Nelson"
				,"Dallin H. Oaks"
				,"M. Russell Ballard"
				,"Jeffrey R. Holland"
				,"Henry B. Eyring"
				,"Dieter F. Uchtdorf"
				,"David A. Bednar"
				,"Quentin L. Cook"
				,"D. Todd Christofferson"
				,"Neil L. Andersen"
				,"Ronald A. Rasband"
				,"Gary E. Stevenson"
				,"Dale G. Renlund"
				,"Gerrit W. Gong"
				,"Ulisses Soares"};
		String choice;
		boolean done = false;



		System.out.println("This program will show the name of an apostle based on the order they were called, with the Prophet as #1");
		do {
			System.out.println("Enter a number between 1 and 15 to display the corresponding apostle (or press Enter to quit):");
			choice = sIn.nextLine();



			switch (choice) {
			case "":
				done=true;
				break;
			case "1":
				System.out.println("Number "+choice+" is: "+sApostles[0]);
				break;
			case "2":
				System.out.println("Number "+choice+" is: "+sApostles[1]);
				break;
			case "3":
				System.out.println("Number "+choice+" is: "+sApostles[2]);
				break;
			case "4":
				System.out.println("Number "+choice+" is: "+sApostles[3]);
				break;
			case "5":
				System.out.println("Number "+choice+" is: "+sApostles[4]);
				break;
			case "6":
				System.out.println("Number "+choice+" is: "+sApostles[5]);
				break;
			case "7":
				System.out.println("Number "+choice+" is: "+sApostles[6]);
				break;
			case "8":
				System.out.println("Number "+choice+" is: "+sApostles[7]);
				break;
			case "9":
				System.out.println("Number "+choice+" is: "+sApostles[8]);
				break;
			case "10":
				System.out.println("Number "+choice+" is: "+sApostles[9]);
				break;
			case "11":
				System.out.println("Number "+choice+" is: "+sApostles[10]);
				break;
			case "12":
				System.out.println("Number "+choice+" is: "+sApostles[11]);
				break;
			case "13":
				System.out.println("Number "+choice+" is: "+sApostles[12]);
				break;
			case "14":
				System.out.println("Number "+choice+" is: "+sApostles[13]);
				break;
			case "15":
				System.out.println("Number "+choice+" is: "+sApostles[14]);
				break;
			default:
				System.out.println("That's not a valid choice. Try again.");
			}
		} while (!done);
		System.out.println("Thank you.");
		sIn.close();
	}




}
