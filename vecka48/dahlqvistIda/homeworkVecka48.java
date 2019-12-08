package dahlqvistIda;

public class homeworkVecka48 {

	public static void main(String[] args) {

		// 100 tal i intervallet [0-9]
		int[] numbers = { 1, 1, 1, 2, 6, 7, 8, 4, 3, 7, 8, 9, 3, 1, 3, 7, 8, 5, 3, 4, 8, 9, 6, 4, 2, 4, 7, 9, 7, 4, 3,
				2, 3, 6, 7, 8, 7, 7, 5, 7, 9, 6, 1, 4, 0, 8, 6, 5, 6, 8, 9, 0, 7, 5, 4, 3, 2, 4, 5, 9, 8, 5, 9, 8, 8, 4,
				5, 6, 7, 8, 9, 0, 9, 0, 9, 7, 5, 2, 1, 2, 3, 4, 5, 4, 4, 5, 3, 4, 5, 0, 8, 7, 0, 7, 9, 7, 0, 6, 5, 4 };

		// 100 namn
		String[] names = { "Crystal", "Tam", "Ed", "Beulah", "Daina", "Benjamin", "Kia", "Clelia", "Cassy", "Gita",
				"Celsa", "Karoline", "Talitha", "Lewis", "Betsy", "Colin", "Glendora", "Carola", "Rosalba", "Jeanie",
				"Yevette", "Armand", "Neal", "Lilla", "Dorethea", "Delta", "Maye", "Nikita", "Shoshana", "Carola",
				"Margie", "Haywood", "Venessa", "Natacha", "Gilbert", "Kandi", "Tyisha", "Tammie", "Blossom", "Penney",
				"Diana", "Audrey", "Willard", "Zoraida", "Drusilla", "Jacquline", "Cyndy", "Janiece", "Tressie", "Kami",
				"Lashanda", "Leann", "Tom", "Santana", "Junita", "Gisela", "Tom", "Marquerite", "Bryant", "Lauralee",
				"Yael", "Kelle", "Samantha", "Tom", "Meta", "Lanette", "Wanetta", "Carola", "Jana", "Neal", "Brady",
				"Rigoberto", "Felicia", "Hellen", "Georgeann", "Carola", "Isaias", "Ellis", "Roseanne", "Lenard", "Ela",
				"Ophelia", "Alesha", "Mafalda", "Flor", "Kelsi", "Autumn", "Sondra", "Pasty", "Jacquelyne", "Benjamin",
				"Emmie", "Mickie", "Lang", "Jamee", "Felice", "Daniella", "Carola", "Nathalie", "Genevive" };

		//countNumbers(numbers);
		System.out.print("Det finns ");
		System.out.print(countNumbers(numbers, 7));
		System.out.println(" sjuor");
		System.out.println();

		//countTom(names);
		System.out.print("Det finns ");
		System.out.print(countTom(names));
		System.out.println(" personer som heter Tom");
		System.out.println();

		//mostNumbers(numbers);
		System.out.print("Det nummer det finns flest av är ");
		System.out.println(mostNumbers(numbers));
		System.out.println();

		//leastNumbers(numbers);
		System.out.print("Det nummer det finns minst av är ");
		System.out.println(leastNumbers(numbers));
		System.out.println();

		//drusillaIndex(names);
		System.out.print("Namnet drusilla ligger på index ");
		System.out.println(drusillaIndex(names));
		System.out.println();

		//sumOfEven(numbers);
		System.out.print("Summan av alla jämna nummer är ");
		System.out.println(sumOfEven(numbers));
		System.out.println();
		
		
		//UPPGIFT 6
		System.out.print("Det finns såhär många nollor: ");
		System.out.println(countNumbers(numbers, 0));
		System.out.print("Det finns såhär många ettor: ");
		System.out.println(countNumbers(numbers, 1));
		System.out.print("Det finns såhär många tvåor: ");
		System.out.println(countNumbers(numbers, 2));
		System.out.print("Det finns såhär många treor: ");
		System.out.println(countNumbers(numbers, 3));
		System.out.print("Det finns såhär många fyror: ");
		System.out.println(countNumbers(numbers, 4));
		System.out.print("Det finns såhär många femmor: ");
		System.out.println(countNumbers(numbers, 5));
		System.out.print("Det finns såhär många sexor: ");
		System.out.println(countNumbers(numbers, 6));
		System.out.print("Det finns såhär många sjuor: ");
		System.out.println(countNumbers(numbers, 7));
		System.out.print("Det finns såhär många åttor: ");
		System.out.println(countNumbers(numbers, 8));
		System.out.print("Det finns såhär många nior: ");
		System.out.println(countNumbers(numbers, 9));
		System.out.println();
	
		//nameL(names);
		System.out.print("Det finns ");
		System.out.print(nameL(names));
		System.out.println(" personer som börjar på L");
		
		//fiveLetters(names)
		//System.out.println(fiveLetters(names));

	}

	/**
	 * UPPGITF 1 + 6 Räknar hur många tal av något det finns i numbers
	 * @param numbers
	 * @return seven
	 */
	private static int countNumbers(int[] numbers, int comparable) {
		int comparableCount = 0;
		for (int index = 0; index < numbers.length; index++) {

			if (numbers[index] == comparable) {
				comparableCount++;
			}
		}
		return comparableCount;

	}

	/**
	 * UPPGIFT 2 Räknar hur många som heter Tom
	 * 
	 * @param names
	 * @return tom
	 */
	private static int countTom(String[] names) {
		int tom = 0;
		for (int i = 0; i < names.length; i++) {

			if (names[i] == "Tom") {
				tom++;
			}
		}
		return tom;
	}

	/**
	 * UPPGIFT 3 Checkar och retunerar det tal det finns mest av
	 * 
	 * @param numbers
	 * @return most
	 */
	private static int mostNumbers(int[] numbers) {

		int most = 0;
		int max = 0;

		for (int i = 0; i < numbers.length; i++) { 
			int amount = 0; // ökar vid varje träff
			for (int j = 0; j < numbers.length; j++) { // kollar igenom samtilga siffror
				if (numbers[j] == i) {
					amount++;
				}

			}
			if (amount > max) {
				most = i;
				max = amount;
			}
		}
		return most;
	}

	/**
	 * UPPGIFT 3 Checkar vilket tal det finns minst av i numbers[]
	 * 
	 * @param numbers
	 * @return least
	 */
	private static int leastNumbers(int[] numbers) {

		int least = 0;
		int min = 100;

		for (int i = 0; i < 10; i++) { // kollar från 0 till 10
			int amount = 0; // ökar vid varje träff
			for (int j = 0; j < numbers.length; j++) { // kollar igenom samtilga siffror
				if (numbers[j] == i) {
					amount++;
				}
			}
			if (amount < min) {
				least = i;
				min = amount;
			}
		}
		return least;
	}

	/**
	 * UPPGIFT 4 Räknar ut vilken plats namnet Drusilla är på.
	 * 
	 * @param names
	 * @return drusilla
	 */
	private static int drusillaIndex(String[] names) {
		int drusilla = 0;

		for (int i = 0; i < names.length; i++) {
			if (names[i].contains("Drusilla")) {
				drusilla = i;
			}
		}
		return drusilla;

	}

	/**UPPGIFT 5 Skriver ut summan av alla jämna nummer
	 * @param numbers
	 * @return sum
	 */
	private static int sumOfEven(int[] numbers) {
		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
			}
		}

		return sum;
	}

	/**
	 * UPPGIFT 7 kollar hur många namn det är som börjar på L
	 * @param names
	 * @return antal
	 */
	private static int nameL(String[] names) {
		
		int antal = 0; //antal L
		
		for (int index = 0; index < names.length; index++) { //kollar strängens namn
			
			if (names[index].contains("L")) { 
				antal++;		
	}
			}
		return antal;
	}
	
	/*FUNKAR INTE ÄNNU
	private static int fiveLetters(String[] names) {
		int antal = 0;
		for (int index = 0; index < names.length; index++) {
		
				if (index == 5) {
					antal++;
			}
		}

	return antal;
	
}*/
	
	
	
	
	
	
}
