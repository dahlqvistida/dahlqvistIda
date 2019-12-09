package dahlqvistIda;

import java.util.Scanner;

public class hittafelLektion {

	public static void main(String[] args) {
		//vi ska hitta fel när vi skriver kod under dagens lektion
		//Måndag vecka 50
		
		
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.println("Write an Integer"); 
		
		
		//TRY CATCH hoppar över om det blir något fel, så den stannar inte koden
		// utan fortsätter
		try {
		//Man kan inte skriva try utan catch
			number = input.nextInt();
		
			System.out.println("The number is " + number); 

		} catch (Exception e) {
			System.out.println("You typed the WRONG input!");
			
		}
		
		
		boolean success = false; //om vi inte anger vad denna är så är den alltid true
		int number2;
		
		System.out.println();
		System.out.println("Write another integer");
		
		while (!success) { //Sålänge success är true så skall denna köras
			//eftersom success är false från början o sedan "false är inte false"
			
			try {
				number2 = input.nextInt();
				System.out.println("The number is " + number2);
				success = true; 
				               
				
			} catch (Exception a) {
				input.next();
				System.out.println("You typed the WRONG input, try again!");
			}
		}
		
		
		
	}

}
