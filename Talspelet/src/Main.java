import java.util.Random;
import java.util.Scanner;

public class Main {

    static boolean run = true;
    static Scanner input = new Scanner(System.in);
    
    static int startInterval;
	static int endInterval;
	
	public static void main(String[] args) {
		
		//Skapar variabler som behövs för intervall och antal gissningar
		
		int guesses = 0;
		int hiddenNumber = 0;
		
		//Instruktioner till spelet
		System.out.println("Välkommen till Talspelet!");
		System.out.println("Spelet går ut på att du ska gissa vilket tal som är rätt.");
		System.out.println();
		
		
	//Spelet körs sålänge run = true
	do {
		
		//Skapar en int för det gömda nummret för nivå 1 till 3
		
		//Användaren får välja vilken svårighets nivå den vill ha
		System.out.println("Välj nivå");
		System.out.println();
		System.out.println("(1) - Enkel: 100 Gissningar. Tal: 1-100");
		System.out.println("(2) - Medel: 10 Gissningar. Tal 1-100");
		System.out.println("(3) - Svår: 5 Gissningar. Tal 1-100");
		System.out.println("(4) - Välj antal gissningar och intervall");
	
		//Input från användaren
		 int difficulty = input.nextInt();
		 
		switch (difficulty) {
		
		//Om man valt enklaste nivån så körs case 1
		case 1:
			
			System.out.print("Du har valt den enklaste nivån.");
			System.out.print(" Talet kommer vara mellan 0 till 100. ");
			System.out.println("Du har 100 gissningar");
			System.out.println();
			
			//Intervall och antal gissningar
			startInterval = 0;
			endInterval = 100;
			guesses = 100;
			
			//Metod för intervallet och tar fram det gömda nummret
			hiddenNumber = chooseInterval(startInterval, endInterval, hiddenNumber);

			//metod för när man gissar på talet
			game(hiddenNumber, guesses);
			
			break;

		//Om man valt medelnivån så körs case 2
		case 2:
			
			System.out.print("Du har valt medel nivån. ");
			System.out.println("Talet kommer vara mellan 0 till 100. ");
			System.out.print("Du har 10 gissnigar på dig.");
			System.out.println();
			
			//Intervall och antal gissningar
			startInterval = 0;
			endInterval = 100;
			guesses = 10;
		
			//Metod för intervallet och tar fram det gömda nummret
			hiddenNumber = chooseInterval(startInterval, endInterval, hiddenNumber);
			
			//metod för när man gissar på talet
			game(hiddenNumber, guesses);
			
			
			break;
			
		//Om man valt svåraste nivån så körs case 3	
		case 3: 
			
			System.out.print("Du har valt den svåraste nivån. ");
			System.out.print("Talet kommer vara mellan 0 till 100. ");
			System.out.println("Du har 5 gissnigar.");
			System.out.println();
			
			//Intervall och antal gissningar
			startInterval = 0;
			endInterval = 100;
			guesses = 5;

			//Metod för intervallet och tar fram det gömda nummret
			hiddenNumber = chooseInterval(startInterval, endInterval, hiddenNumber);
			
			//metod för när man gissar på talet
			game(hiddenNumber, guesses);
			
			break;
		
		//Om man valt att välja intervall o gissningar själv så körs case 4
		case 4:
			
			//Användaren bestämmer intervall
			System.out.println("Skriv in start värdet på ditt intervall");
			startInterval = input.nextInt();
			System.out.println("Skriv in slut värdet på ditt intervall");
			endInterval = input.nextInt();
			
			//Metod för intervallet och tar fram det gömda nummret
			hiddenNumber = chooseInterval(startInterval, endInterval, hiddenNumber);
			
			System.out.println("Välj hur många gissningar du vill ha:");
			guesses = input.nextInt();
			
			System.out.print("Du valde intervallet " + startInterval  + " - " + endInterval);
			System.out.println(" och du har " + guesses + " gissningar");
			
			//metod för när man gissar på talet
			game(hiddenNumber, guesses);
			
			break;	
		}
		
		//Användaren får välja om den vill spela igen
		System.out.println("Vill du spela igen?");
		System.out.println("(1) - JA");
		System.out.println("(2) - NEJ");
		
		int playAgain = input.nextInt();
		
		switch (playAgain) {
		case 1:
			
			break;

		case 2:
			//Om användaren inte vill spela igen så ändras run till false och då kommer inte do-while loopen köras igen
			System.out.println("Okej ha det så bra!");
			run = false;
			
			break;
		}
		
	} while (run);
	
	}
	
	/**
	 * Denna metod tar fram siffran användaren skall gissa med användarens egna intervall
	 * @param hiddenNumber
	 * @param startInterval
	 * @param endInterval
	 * @return hiddenNumberOwn
	 */
	private static int chooseInterval(int startInterval, int endInterval, int hiddenNumber) {
		
		Random number = new Random();
		hiddenNumber = number.nextInt(endInterval-startInterval)+startInterval;

		return hiddenNumber;
		
	}
	
	/**
	 * En for loop som inehåller if satser, och detta pågår tills man har gissat rätt tal. 
	 * @param hiddenNumber
	 * @param guesses
	 */
	 private static void game(int hiddenNumber, int guesses) {
		
		 int guess = 0;
		 
		 //En forloop som pågår tills användaren har svarat rätt.
		 for (int i = 1; i <= guesses; i--) {
			
			System.out.println("Gör en gissning");
			
			guess = input.nextInt();
			guesses--;
			
			//Om gissninen är samma som det gömda nummret så körs detta 
			if (guess == hiddenNumber) {
				
				System.out.println("GRATTIS DU GISSADE RÄTT!");
				System.out.println();
				break;
			
			//Om gissningen inte är lika med 0 eller inte samma som det gömda nummret så körs detta
			}else if (guesses != 0) {
				
				//Om gissningen är mindre är det gömda nummret
				if (guess < hiddenNumber) {
					
					System.out.println();
					System.out.println("Fel");
					System.out.println("Ledtråd: Talet är större");
					
				 //Om gissningen är större än det gömda nummret
				}else if (guess > hiddenNumber) {
				    
					System.out.println();
					System.out.println("Fel");
					System.out.println("Ledtråd: Talet är mindre");
				
				}
				System.out.println("Du har " + guesses + " gissningar kvar.");
				
			//Om inget av ovanstående ställen körs så körs denna. 
			//Om antalet gissningar man har kvar är noll
			}else {
				
				System.out.println();
				System.out.println("Du Förlora! ");
				System.out.println("Talet var: " + hiddenNumber);
				System.out.println();
				break;
			} 
			
		}

		
}

	 

}
