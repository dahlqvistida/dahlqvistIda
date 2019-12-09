package dahlqvistIda;

public class anteckningar_homework {

	public static void main(String[] args) {

		int[] numbers = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};

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
				
				//nameL(names);
				System.out.print("Det finns ");
				System.out.print(countNameWithLetter(names, ("L")));
				System.out.println(" personer som börjar på L");
	}

	
	private static int countNumbers(int[] numbers, int comparable) {
		int comparableCount = 0;
		for (int index = 0; index < numbers.length; index++) {

			if (numbers[index] == comparable) {
				comparableCount++;
			}
		}
		return comparableCount;

	}
	// MED HJÄLP AV COMPARABLE COUNT SÅ KAN VI RÄKNA UT UNGEFÄR SAMMA SAK FLERA GÅNGER UTAN ATT SKRIVA SÅ MYCKET KOD
	private static int countNameWithLetter(String[] names, String comparable) {
		
		int comparableCount = 0;
		for (int index = 0; index < names.length; index++) {

			if (names[index].contains(comparable)) {
				comparableCount++;
			}
		}
		return comparableCount;
		
	}

	/*if (names[index].contains("L")) { 
		antal++;		
}*/
	
	
	
	
}


