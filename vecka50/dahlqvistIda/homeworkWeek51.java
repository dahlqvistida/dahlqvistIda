package dahlqvistIda;

import java.util.Scanner;

public class homeworkWeek51 {

	public static void main(String[] args) {
		
		//Creating a scanner to get input from the console
		Scanner input = new Scanner(System.in);
		
		//Creating integers where the user later will make their choice. 
		//The numbers stands for in which switch the choice is made in.
		int choice;
		int choice1;
		int choice2;
		int choice3;
		int choice4;
		
		
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
			System.out.println("Here are my favorite xmas candy, which one do you choose?");
			//Prints out an empty line to make the console look more structured 
			System.out.println();
			System.out.println("1. Candy Cane Chocolate Swirl Fudge");
			System.out.println("2. Gingerbread House White Chocolate Bark");
			System.out.println("3. Peanut Brittle");
			System.out.println("4. Back to menu");
			System.out.println();
			
			System.out.print("Your choice is ");
			choice1 = input.nextInt();
			
			//Creates a new switch-case whit the recipes 
			switch (choice1) {
			
			//Case1 holds the recipe for choice 1 
			case 1:
				pastry = "Candy Cane Chocolate Swirl Fudge";
				System.out.println("You chose " + pastry );
				System.out.println("This is an wonderful xmas candy! This is the recipie");
				System.out.println();
				System.out.println("RECIPIE:");
				System.out.println("3 cups white chocolate morsels ");
				System.out.println("1 can sweetened condensed milk");
				System.out.println("1/2 teaspoon peppermint extract");
				System.out.println("8 crushed candy canes");
				System.out.println("2/3 cup mini semi-sweet chocolate chips");
				System.out.println();
				
				break;
				
			//Case 2 holds the recipe for choice 2
			case 2: 
				pastry = "Gingerbread House White Chocolate Bark";
				System.out.println("You chose " + pastry );
				System.out.println("This is an wonderful xmas candy! This is the recipie");
				System.out.println();
				System.out.println("RECIPIE:");
				System.out.println("1 1/2 bags white chocolate chips");
				System.out.println("2 1/2 cups lightly crushed gingersnap cookies");
				System.out.println("1 cup gumdrops");
				System.out.println("1/2 cup coates chocolate candies");
				System.out.println("1 cup soft peppermint candier");
				System.out.println();
				
				break;
				
			//Case 3 holds the recipe for choice 3
			case 3: 
				pastry = "Peanut Brittle";
				System.out.println("You chose " + pastry );
				System.out.println("This is an wonderful xmas candy! This is the recipie");
				System.out.println();
				System.out.println("RECIPIE:");
				System.out.println("1 cup white sugar");
				System.out.println("1/2 cup light corn syrup");
				System.out.println("1/4 teaspoon salt");
				System.out.println("1/4 cup water");
				System.out.println("1 cup peanuts");
				System.out.println("2 tablespoons butter");
				System.out.println("1 teaspoon baking soda");
				System.out.println();
				
				//stops this switch
				break;
 
			//Case 4 makes you go back to the menu
			case 4:
				pastry = "Back to menu";
				System.out.println("You chose " + pastry );
				System.out.println();
				
				//Stops this switch
				break;	
			}
			
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
			System.out.println("4. Back to menu");
			System.out.println();
			
			//Make your choise for which case you want...
			System.out.print("Your choice is: ");
			choice2 = input.nextInt();
			
			//Creating a switch-case for something vegan
			switch (choice2) {
			
			//You go to this case if you choosed 1
			case 1:
				pastry = "Vegan choclate Chip Cookies";
				System.out.println("You chose " + pastry );
				System.out.println("This is an wonderful vegan cookie!");
				System.out.println();
				System.out.println("RECIPIE:");
				System.out.println("I'm sorry but this recipe is to long to write...");
				System.out.println("Just google on Vegan choclate Chip Cookies");
				System.out.println();
				
				//We all know that this one stops this switch by now
				break;
			
			//You go to this case if you choosed 2
			case 2: 
				pastry = "Keto Peanut Butter Cookies";
				System.out.println("You chose " + pastry );
				System.out.println("This is an wonderful vegan cookie!");
				System.out.println("Im too lazy to copy the recipe so just google on Keto Peanut Butter Cookies");
				System.out.println();
				
				//Stops the switch
				break;
			
			//You go to this case if you choosed 3
			case 3: 
				pastry = "Vegan Unicorn Cookies";
				System.out.println("You chose " + pastry );
				System.out.println("Doesn't this sounds lovely?!");
				System.out.println("And I can assure you that this doesn't contains real unicorns");
				System.out.println("Sadly I am to tired to write the recipe so just google on it");
				System.out.println();
				
				break;
				
			//You go to this case if you choosed 4
			case 4:
				pastry = "Back to menu";
				System.out.println("You chose " + pastry );
				System.out.println();
				
				//stops this switch
				break;
				
					
			}
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
			System.out.println("4. Back to menu");
			System.out.println();
			
			//Make you choice for which chocolate recipe you want
			System.out.print("Your choice is; ");
			choice3 = input.nextInt();
			
			//Creating a switch-case for something vegan
			switch (choice3) {
			
			//You go to this case if you choosed 1
			case 1:
				pastry = "Swidish kladdkaka";
				System.out.println("You chose " + pastry );
				System.out.println("WHO DOESN'T LOVE KLADDKAKA??");
				System.out.println("Just google the recipe, it's not that hard");
				System.out.println("Good Luck!");
				System.out.println();
				
				//stops this switch
				break;
			
			//You go to this case if you choosed 2
			case 2: 
				pastry = "Chocolate cupcake";
				System.out.println("You chose " + pastry );
				System.out.println("Ah so traditional of you");
				System.out.println("Im too lazy to copy the recipe so just google on it");
				System.out.println();
				
				//Stops the switch
				break;
			
			//You go to this case if you choosed 3
			case 3: 
				pastry = "Chocolate fudge";
				System.out.println("You chose " + pastry );
				System.out.println("Oh this looks nice!");
				System.out.println("I have heard that this is really difficult to make");
				System.out.println("Good Luck!");
				System.out.println();
				
				break;
				
			//You go to this case if you choosed 4
			case 4:
				pastry = "Back to menu";
				System.out.println("You chose " + pastry );
				System.out.println();
				//stops this switch
				break;	
			}
			
			//stops the switch
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
			System.out.println("4. Back to menu");
			System.out.println();
			
			//Make to choice for which candy you want to make
			System.out.print("Your choice is; ");
			choice4 = input.nextInt();
			
			//Creating a switch-case for something vegan
			switch (choice4) {
			
			//You go to this case if you choosed 1
			case 1:
				pastry = "Marshmallows";
				System.out.println("You chose " + pastry );
				System.out.println("Have you ever tried to hold them over an open fire?");
				System.out.println("Thats an perfect idea! ");
				System.out.println("Grab your friends and do that during the summer!");
				System.out.println("By the way, you know that it is cheaper to buy marshmallows at the store right?");
				System.out.println();
				
				//stops this switch
				break;
			
			//You go to this case if you choosed 2
			case 2: 
				pastry = "Maple fondant";
				System.out.println("You chose " + pastry );
				System.out.println("I think maple is an tree, and I know there is an syrup made of it");
				System.out.println("So this may just be a maple syrup fondant");
				System.out.println("It sounds hard to make, so Good Luck (google the reciepe)");
				System.out.println();
				
				//Stops the switch
				break;
			
			//You go to this case if you choosed 3
			case 3: 
				pastry = "Strawberry Lollipop";
				System.out.println("You chose " + pastry );
				System.out.println("It's easier to buy one.....");
				System.out.println("I just want to sleep, why am I still up?");
				System.out.println("Eh Merry Christmas");
				System.out.println();
				
				break;
				
			//You go to this case if you choosed 4
			case 4:
				pastry = "Back to menu";
				System.out.println("You chose " + pastry );
				System.out.println();
				
				//stops this switch
				break;	
			}
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
			System.out.println("Just start over the program again! Don't be so lazy...");
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