package dahlqvistIda;

import java.util.Scanner;

public class FizzBuzz {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		int tal1 = input.nextInt(); // användaren ger talet ett värde
		int tal2 = input.nextInt(); // användaren ger talet ett värde
		int num = input.nextInt(); // användaren anger hur många tal det skall vara

		for (int i = 0; i < num; i++) {

			if (i % tal1 == 0 && i % tal2 == 0) {
				System.out.println("FizzBuzz"); // Om något tal är jämnt delbart med tal1 och tal2 så ersättstalet av
												// FizzBuzz.
			} else if (i % tal1 == 0) {
				System.out.println("Fizz"); // Om något tal är delbart med tal1 så ersätts det med Fizz.
			} else if (i % tal2 == 0) {
				System.out.println("Buzz"); // Om något tal är jämnt delbart med tal2 så ersätts det med Buzz
			} else {
				System.out.println(i); // Alla andra tal som är mindre än num skrivs ut
			}

		}

	}

}
