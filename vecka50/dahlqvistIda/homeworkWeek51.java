package dahlqvistIda;

import java.util.Scanner;

public class homeworkWeek51 {

	public static void main(String[] args) {
		
		//Creating a scanner to get input from the console
		Scanner input = new Scanner(System.in);
		
		//Creating an integer where the user later will make their choice. 
		int choice;
		
		//A do-while loop so the program loops until you type 5 
		do {
		//Printing out information about what choices the user can make
		System.out.println("Choose what you would want to bake");
		System.out.println("(1) - Xmas candy");
		System.out.println("(2) - Something Vegan");
		System.out.println("(3) - Something with Chocolate");
		System.out.println("(4) - Candy");
		System.out.println("(5) - Quit");
		//Prints out an empty line to make the console look more structured 
		System.out.println();

		
		//Printing out text about what choice the user makes
		System.out.print("Your choice is: ");
		//Where the user makes their choice
		choice = input.nextInt();
		
		
		//Creating a String variable for the pastries (bakverk)
		String pastry;
		
		//Creating a switch statement and all cases for the users choice 
		switch (choice) {
		//Case 1 prints out different types of xmas candy recipes
		case 1:
			pastry = "Xmas candy";
			System.out.println("You chose " + pastry );
			System.out.println("Here are my favorite xmas candy ");
			//Prints out an empty line to make the console look more structured 
			System.out.println();
			System.out.println("1. Candy Cane Chocolate Swirl Fudge");
			System.out.println("2. Gingerbread House White Chocolate Bark");
			System.out.println("3. Peanut Brittle");
			System.out.println();
			//This is to stops this switch
			break;
			
		//Case 2 prints out different types of vegan recipes
		case 2:
			pastry = "Something Vegan";
			System.out.println("You chose " + pastry);
			System.out.println("Here are some vegan recipies ");
			//Prints out an empty line to make the console look more structured 
			System.out.println();
			System.out.println("1. Vegan choclate Chip Cookies");
			System.out.println("2. Keto Peanut Butter Cookies");
			System.out.println("3. Vegan Unicorn Cookies");
			System.out.println();
			//This is to stops this switch
			break;
			
		//Case 2 prints out different types of chocolate pastry recipes
		case 3:
			pastry = "something with chocolate";
			System.out.println("You chose " + pastry);
			System.out.println("Here are some chocolate recipies");
			//Prints out an empty line to make the console look more structured 
			System.out.println();
			System.out.println("1. Swedish Kladdkaka");
			System.out.println("2. Chocolate cupcake");
			System.out.println("3. Chocolate fudge");
			System.out.println();
			//This is to stops this switch
			break;
			
		//Case 2 prints out different types of candy recipes
		case 4:
			pastry = "candy";
			System.out.println("You chose " + pastry);
			System.out.println("Here are some candy recepis");
			//Prints out an empty line to make the console look more structured 
			System.out.println();
			System.out.println("1. Marshmallows");
			System.out.println("2. Maple Fondant");
			System.out.println("3. Strawberry Lollipop");
			System.out.println();
			//This is to stops this switch
			break;
		
		//Case 5 prints out a goodbye phrase because the user choose to quit
		case 5:
			System.out.println("That's your loss. Have a great day!");
			
			//This is to stops this switch
			break;
		
		//If the user writes an incorrect number this one tells it to write it correct
		default:
			pastry = "invalid";
			System.out.println("You have made a " + pastry + " choice!");
			System.out.println("You have to restart the program and try again");
			System.out.println();
			
			//This is to stops this switch
			break;
			
		}
		}
		//When you type 5 the loop will stop 
		while (choice != 5 );
		
		//Closes the scanner input
		input.close();
		
		
	}
	
}