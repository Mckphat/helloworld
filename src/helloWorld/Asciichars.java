package helloWorld;
import java.util.*;

public class Asciichars {
	
	static public Scanner keyboard = new Scanner(System.in);
	
	
	public static void printNumbers() {
		//TODO: Print valid numeric input
		System.out.print("Hello, enter a number and I will print out all the numbers: ");
		int number = keyboard.nextInt();
		System.out.println("Here are the numbers: ");
		for(int i = 1; i <= number; i++) {
			 System.out.println(i);
			
		}
		
	}
	
	public static void printLowerCase() {
		//TODO: print valid lowercase alphabetic input
		System.out.print("Welcome to printing only lowercase letters. Say something: ");
		String input = keyboard.nextLine();
		for (int i = 0; i<input.length(); i++) {
			if(Character.isLowerCase(input.charAt(i))) {
				System.out.println(input.charAt(i));
			
			}
		}
	
	}
	
	public static void printUpperCase() {
		//TODO: print valid Uppercase alphabetic input
		System.out.print("Welcome to printing only uppercase letters. Say something: ");
		String prompt = keyboard.nextLine();
		for (int i = 0; i<prompt.length(); i++) {
			if(Character.isUpperCase(prompt.charAt(i))) {
				System.out.println(prompt.charAt(i));
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**okay, for some reason it only works one at a time so 
		 * please uncomment the main methods below one at a time to test them out.
		 */
		//Asciichars.printNumbers();
		//Asciichars.printLowerCase();
		//Asciichars.printUpperCase();
		
		System.out.print("Hi. What's your name? ");
		String name =  keyboard.nextLine();
		System.out.println("Hello " + name + "!");
		//System.out.print("Would you like to continue interacting with me? Enter (y/n) ");
		//String input = keyboard.nextLine();
		System.out.print("Would you like to continue interacting with me? Enter (y/n) ");
		
		while(true) {
			String input = keyboard.nextLine();
			if (input.equalsIgnoreCase("n")) {
				System.out.println("Please return later to complete this survey. ByeBye.");
				System.exit(0);
				break;
			}
			System.out.println("Okay! Let's go!");
			System.out.println("Q1: What is the name of your favorite pet?");
			String pet = keyboard.next();
			System.out.println("Q2: What is the age of your favorite pet?");
			int pet_age = keyboard.nextInt();
			System.out.println("Q3: What is your lucky number?");
			int lucky = keyboard.nextInt();
			System.out.println("Q4: Do you have a favorite quarter back? (Y/N)");
			String sports = keyboard.next();
			
			if (sports.equalsIgnoreCase("Y")) {
				System.out.println("What's their jersey number?");
				int jersey_num = keyboard.nextInt();
			}
			else {
				System.out.println("Let's move on then!");
			}
			
			System.out.println("Q5: What is the two-digit model year of your car?");
			int model_year = keyboard.nextInt();
			System.out.println("Q6: What is the first name of their favorite actor or actress?");
			String celeb = keyboard.next();
			
			System.out.println("Q7: Enter a random number between 1 and 50: ");
			int rand = keyboard.nextInt();
			
			int magic_8_ball_max = 75;
			int magic_8_ball = (lucky * rand);
			//int magic_8_ball2 = (jersey_num * rand);
			
			if (magic_8_ball > magic_8_ball_max) {
				int new_magic = magic_8_ball - 75;
				//int new_magic2 = magic_8_ball2 - 75;
				System.out.println(new_magic);
				//System.out.println(new_magic2);
				
			}
			else {
				System.out.println(magic_8_ball);
				//System.out.println(magic_8_ball2);
			}
			
			//lottery numbers will be 5 different numbers between 1-65
			//so lets figure out how to generate values starting from 1
			int lot_one = model_year + pet_age;
			if(lot_one < 0) {
				lot_one = lot_one + 20;
			}
			else if (lot_one > 50) {
				lot_one = lot_one - 50;
			}
			
			int lot_two = model_year + lucky;
			if(lot_two < 0) {
				lot_two = lot_two + 20;
			}
			else if (lot_two > 50) {
				lot_two = lot_two - 50;
			}
			
			char charAt = pet.charAt(2);
			int lot_three = charAt;
			if(lot_three < 0) {
				lot_two = lot_two + 20;
			}
			else if (lot_three > 50) {
				lot_three = lot_three - 50;
			}
			
			int lot_four = rand - lot_two;
			if(lot_four < 0) {
				lot_four = lot_four + 20;
			}
			else if (lot_four > 50) {
				lot_four = lot_four - 50;
			}
			int lot_five = 42;
			
			
			
			
			System.out.println("Lottery numbers: " + lot_one + " " + lot_two + " " + lot_three + " " 
			+ lot_four + " " + lot_five);
			
			System.out.println("Magic ball: " + magic_8_ball);
			
			System.out.println("Would you like to play again? (Y/N)");
			String answer = keyboard.nextLine();
			if(answer.equalsIgnoreCase("N")) {
				//would not print out this statement for some reason but it does 
				//exit when prompt
				System.out.println("Thank you for playing. Bye");
				System.exit(0);
				break;
				
			}

		}
	
	}
	
}
























