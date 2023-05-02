package week3;
import java.util.Scanner;

public class HelloWorldRevised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using Scanner for getting input from user
		Scanner in= new Scanner(System.in);
		
		
		//Ask the user's name
		System.out.println("Please enter your name");
		String name= in.nextLine();
		System.out.println("Hello " + name + "!");
		System.out.println();
		
		//ask the user's favorite desert
		System.out.println("What is your favorite desert?");
		String desert= in.nextLine(); 
		System.out.println(desert); 
		String nice= in.nextLine(); //response
		System.out.println(nice);
		System.out.println();
		
		//ask the user what he likes to do
		System.out.println("What do you like to do?");
		String toDo= in.nextLine();
		System.out.println(toDo);
		String cool= in.nextLine();//response
		System.out.println(cool);
		System.out.println();
		
		//ask the user if he speaks another language
		System.out.println("Do you speak another language?");
		String lang= in.nextLine();//language
		System.out.println(lang);
		String casa= in.nextLine();//response
		System.out.println(casa);
		System.out.println();
		
		//ask the user who inspires him
		System.out.println("Who inspires you?");
		String who= in.nextLine();//My inspiration
		System.out.println(who);
		String seriously= in.nextLine();//response
		System.out.println(seriously);
		System.out.println();
		
		//ask the user a joke question
		System.out.println("Knock, knock, who's there?");
		String knock= in.nextLine();//Who?
		System.out.println(knock);
		String gotYa= in.nextLine();//response
		System.out.println(gotYa);
		System.out.println();
		
		//ask the user a hypothetical question
		System.out.println("Who would win in a race, you or President Nelson?");
		String win= in.nextLine();//Who wins
		System.out.println(win);
		String ageless= in.nextLine();//response
		System.out.println(ageless);
		
		
		in.close();
		
		
	}//End of main

}//End of class HelloWorldRevised
