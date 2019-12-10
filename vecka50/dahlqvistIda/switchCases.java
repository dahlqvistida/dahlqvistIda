package dahlqvistIda;

import java.util.Scanner;

public class switchCases {

	// "for each" loopar är bara tillför arrayer

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int choice;

		System.out.println("Welcome to this little game");
		System.out.println("Choose one of these alternatives, write the number of your choice");
		System.out.println();

		System.out.println("(1) - New game");
		System.out.println("(2) - Load game");
		System.out.println("(3) - Options");
		System.out.println("(4) - Credits");
		System.out.println("(5) - Quit");
		System.out.println();

		choice = input.nextInt();

		
		switch (choice) {
		case 1:
			System.out.println("You are creating a new game...");
			
			break;
		case 2:
			System.out.println("Your games are loading...");
			
			break;
		case 3:
			System.out.println("Sound");
			System.out.println("Controls");
			System.out.println("Text");
			
			break;
		case 4:
			System.out.println("This game was created by ME");
			
			break;
		case 5:
			System.out.println("Do you want to save your game before you quit?");
			
			break;

		default: 
			System.out.println("Make an choice please...");
			break;
		}

	}

}
