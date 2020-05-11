package dahlqvistIda;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hangman {
	
	static Scanner input = new Scanner(System.in);
	
	//sålänge run är true så körs spelet
	static boolean run = true;
	
	//sålänge runGuessing är true så kan man gissa på ett ord
	static boolean runGuessing = true;
	
	//antal gissningar man har
	static int guesses = 13;
	
	static char letter;

	//Orden man kan gissa på till de levels som finns
	static String[] shortList = {"blomma", "fjäril", "pollen", "affär", "lexikon", "dagisbarn", "lekfull", "livlig", "ärtor"};  
	static String[] longList = {"relativitetsteorin", "bokföringsdag", "arbetsmiljöproblem", "improvisationsförmåga", "regeringskansliet", "tjänstepensionsmyndigheten", "självständighetsdeklaration", "arbetsförmedlingen", "levnadsbröd", "mjölkskummare"};
	static String[] veryLongList = {"hypernervokustiskadiafragmakontravibrationer" , "luftlandsättningamfibiepansarskyttebandvagnshandtag", "sjukhuspersonalsmatsalslistonummer", "produktmomentkorrelationskoefficienten", "hyperpolysyllabicofobi"};
	
	//används för att kunna ta fram ett nummer i arrayen.
	static int startArrayNumber = 0;
	static int endArrayNumber;
	static int arrayNumber;
	
	//ordet man skall gissa på
	static String hiddenWord; 
	
	
	public static void main(String[] args) {
		
	
		//Instruktioner presenteras
		System.out.println("Välkommen till hängagubben!");
		System.out.println();
		System.out.println("Du kommer få välja en level och sedan börja gissa på bokstäver.");
		System.out.println("Om du har fel så förlorar du ett liv.");
		System.out.println("När du har gissat fel 13 gånger så dör gubben och du förlorar");
		System.out.println("Note: Alla ord är på svenska");
		
		
		//Do-while loop, körs minst en gång (körs om run = true)
		do {
			
			//Levelarna presenteras
			System.out.println();
			System.out.println("Välj nivå");
			System.out.println();
			System.out.println("(1) - Lätt: 5-10 bokstäver");
			System.out.println("(2) - Svår: 10+ bokstäver");
			System.out.println("(3) - Mycket Svår: långalånga ord");
			
			//Spelaren väljer level
			int difficulty = input.nextInt();
			
			switch (difficulty) {
			//om spelaren väljer level 1 så körs case 1
			case 1:
				
				System.out.println("Du har valt den enklaste leveln");
				
				//så många ord det är i listan, - 1 eftersom arrayen börjar på plats 0.(Så många platser det finns o välja mellan)
				endArrayNumber = 9-1;
				
				//Tar fram ett ord från arrayen genom att först:
				//ett nummer tas fram som motsvarar en plats i arrayen
				//på den platsen i arrayen finns ordet spelaren skall gissa på 
				arrayNumber = Interval(startArrayNumber, endArrayNumber, arrayNumber);
			
				
				//tar fram själva ordet man skall gissa på med hjälp av array platsen som
				//tidigare har tagits fram.
				hiddenWord = shortList[arrayNumber];
				
				convertString(hiddenWord);
				
				break;
			//om spelaren väljer level 2 så körs case 2
			case 2: 
				
				System.out.println("Du har valt medel-nivån");
				//så många ord det är i listan, - 1 eftersom arrayen börjar på plats 0.(Så många platser det finns o välja mellan)
				endArrayNumber = 10-1;
				
				//Tar fram ett ord från arrayen genom att först:
				//ett nummer tas fram som motsvarar en plats i arrayen
				//på den platsen i arrayen finns ordet spelaren skall gissa på 
				arrayNumber = Interval(startArrayNumber, endArrayNumber, arrayNumber);
				
				
				//tar fram själva ordet man skall gissa på med hjälp av array platsen som
				//tidigare har tagits fram.
				hiddenWord = longList[arrayNumber];
				
				convertString(hiddenWord);
				
				break;
			//om spelaren väljer level 3 så körs case 3
			case 3:
				//så många ord det är i listan, - 1 eftersom arrayen börjar på plats 0. (Så många platser det finns o välja mellan)
				endArrayNumber = 5-1;
				
				//Tar fram ett ord från arrayen genom att först:
				//ett nummer tas fram som motsvarar en plats i arrayen
				//på den platsen i arrayen finns ordet spelaren skall gissa på 
				arrayNumber = Interval(startArrayNumber, endArrayNumber, arrayNumber);
				
				
				
				//tar fram själva ordet man skall gissa på med hjälp av array platsen som
				//tidigare har tagits fram.
				hiddenWord = veryLongList[arrayNumber];
				
				convertString(hiddenWord);
				
				break;
			default:
				break;
			}
		
			System.out.println("Vill du spela igen?");
			System.out.println("(1) - Ja");
			System.out.println("(2) - Nej");
			
			int playAgain = input.nextInt();
			
			switch (playAgain) {
			case 1:
				
				System.out.println("Vad skoj! Lycka till!");
				
				break;
			
			case 2:
				
				System.out.println("Vad tråkigt, kom tillbaka snart!");
				
				run = false; 
				
				break;
			default:
				break;
			}
			
		} while (run);
		
		

	}
	
	/**
	 * Tar fram vilken plats ordet som användaren skall gissa på ligger i arrayen.
	 * @param startArrayNumber
	 * @param endIArrayNumber
	 * @param arrayPosition
	 * @return
	 */
	private static int Interval(int startArrayNumber, int endIArrayNumber, int arrayPosition) {
		
		Random number = new Random();
		
		//Tar fram ett nummer som motsvarar en plats i arrayen
		arrayPosition = number.nextInt(endArrayNumber-startArrayNumber)+startArrayNumber;

		return arrayPosition;
		
	}

	/**
	 * Låter användaren gissa på bokstäver till hiddenWord
	 * @param hiddenWord
	 */
	private static void convertString(String hiddenWord) {
		
		
		//Skapar en array som har lika många platser som hiddenWord har bokstäver
        char[] charGuessAtThisWord = new char[hiddenWord.length()]; 
        
        
        //Gör så varje bokstav i hiddenWord hamnar på en egen plats i charArrayen. 
        for (int i = 0; i < hiddenWord.length(); i++) { 
            charGuessAtThisWord[i] = hiddenWord.charAt(i); 
        
        } 
        
        //skapar en  charArray som har lika många platser som den tidigare,
        //men denna kommer spara alla korrekta bokstäver man gissat på
        char[] charGuessedLetters = new char[charGuessAtThisWord.length];
        
        int a = 0;
        
        //Sålänge a är mindre än antalet bokstäver i hiddenWord så körs while-loopen
        while(hiddenWord.length() > a) {
        	
       	 //Alla platser i arrayen består av '-'
       	 charGuessedLetters[a] = '-';
       	 
       	 a++;
        }
        int characters = 0;
        
        //för varje bokstav(c) i arrayen så skrivs "_" ut för att visa hur många bokstäver det skall gissas på.  
        for(char c : charGuessAtThisWord) {
        	 
        	 System.out.print("_ ");
        	 
        	 characters++;
        	 
         }
        System.out.println("Ordet har " + characters + " bokstäver");
        System.out.println();

         do {
        	 
        	 System.out.println("Gör en gissning");
			
        	 letter = input.next().charAt(0);
        	 

        	 if(hiddenWord.contains(letter + "")) {
        		
        		
        		 for(int i = 0; i < charGuessAtThisWord.length; i++) {
        			 
        				if(hiddenWord.charAt(i) == letter) {
        				
        					charGuessedLetters[i] = letter;
        					
           				 }
        				
        		 	}
        		 
        		 System.out.println(charGuessedLetters);
        		 
        	 }else {
        		 System.out.println("Du gissade fel.");
        		 
        		 guesses--;
        		 
        		 System.out.println("Du har " + guesses + " gissningar kvar");
        		 System.out.println();
        	 }
        		 
        	 if(hiddenWord.equals(String.valueOf(charGuessedLetters))) {
        					
        		 System.out.println();
        					System.out.println("Du vann!");
        					System.out.println("Ordet var: " + hiddenWord);
        					System.out.println();
        					
        					runGuessing = false;
        				}
        				 
        			 
        	 if(guesses == 0) {
        		 
        		 System.out.println("Du förlora!");
        		 runGuessing = false;
        	 }
        	 
		} while (runGuessing);
         
}
}
     
	
