package dahlqvistIda;

import java.util.Scanner;

public class homeworkWeek51 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Choose an what you would want to bake");
		System.out.println("(1) - Xmas candy");
		System.out.println("(2) - Something Vegan");
		System.out.println("(3) - Something with Chocolate");
		System.out.println("(4) - Candy");
		System.out.println("(5) - Quit");
		System.out.println();

		int choice = input.nextInt();

		String genre;

		switch (choice) {
		case 1:
			genre = "Xmas candy";
			System.out.println("You chose " + genre );
			System.out.println("Here is my favorite xmas candy ");
			System.out.println();
			System.out.println("1. Candy Cane Chocolate Swirl Fudge");
			System.out.println("2. Gingerbread House White Chocolate Bark");
			System.out.println("3. Peanut Brittle");
			System.out.println();
			break;
		case 2:
			genre = "Something Vegan";
			System.out.println("You chose " + genre);
			System.out.println("Here is some vegan recipies ");
			System.out.println();
			System.out.println("1. Vegan choclate Chip Cookies");
			System.out.println("2. Keto Peanut Butter Cookies");
			System.out.println("3. Vegan Unicorn Cookies");
			System.out.println();
			break;
		case 3:
			genre = "something with chocolate";
			System.out.println("You chose " + genre);
			System.out.println();
			System.out.println();
			System.out.println("1. The notebook, av Nick Cassavetes");
			System.out.println("2. The holidays, av Nancy Meyrs");
			System.out.println("3. Love Simon, av Greg Berlanti");
			System.out.println();
			break;
		case 4:
			genre = "Fantasy";
			System.out.println("You chose " + genre + "! Here are three good movies!");
			System.out.println();
			System.out.println("1. Lord of the rings - Sagan om ringen, av Peter Jackson");
			System.out.println("2. Aquaman, av James Wan");
			System.out.println("3. Avengers - Infinity war, av Anthony & Joe Russo");
			System.out.println();
			break;
		case 5:
			System.out.println("Thank you for today!");
			break;
		default:
			genre = "invalid";
			System.out.println("You have made a " + genre + " choice! Too bad for you!");
			System.out.println();
			break;
		}

		input.close();
	}

}
