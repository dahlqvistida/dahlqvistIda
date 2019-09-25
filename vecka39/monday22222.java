import java.util.Scanner;

public class monday22222 {
	public static void main(String[] args) {

		boolean repeat = true; // boolean says true or false
		int age = 0;
		int replay;


			Scanner input = new Scanner(System.in);


			while (repeat) {
				
				System.out.println("Hur gammal är du?"); 
				age = input.nextInt();
				
			if (age >= 18) {
				System.out.println("Vroom Vroom!");
			}

			else if (age > 14 && age < 18) { 
				System.out.println("Överlev med moppe ett tag till");

			}

			else { 
				System.out.println("HAHAHAHAHAHAH Hej lille vän!");
			}
			System.out.println();
			System.out.println("Would you like to play again? press 1 + enter for yes");
			
			replay = input.nextInt();
			
			if(replay !=1) {
				repeat = false;
				System.out.println("Have a nice day!");
				}
			}
	
}
}
