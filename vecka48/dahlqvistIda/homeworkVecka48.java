package dahlqvistIda;

public class homeworkVecka48 {

	public static void main(String[] args) {
		// 100 tal i intervallet [0-9]
		int[] numbers = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};


		// 100 namn
		String[] names = {"Crystal","Tam","Ed","Beulah","Daina","Benjamin","Kia","Clelia","Cassy","Gita","Celsa","Karoline","Talitha","Lewis","Betsy","Colin","Glendora","Carola","Rosalba","Jeanie","Yevette","Armand","Neal","Lilla","Dorethea","Delta","Maye","Nikita","Shoshana","Carola","Margie","Haywood","Venessa","Natacha","Gilbert","Kandi","Tyisha","Tammie","Blossom","Penney","Diana","Audrey","Willard","Zoraida","Drusilla","Jacquline","Cyndy","Janiece","Tressie","Kami","Lashanda","Leann","Tom","Santana","Junita","Gisela","Tom","Marquerite","Bryant","Lauralee","Yael","Kelle","Samantha","Tom","Meta","Lanette","Wanetta","Carola","Jana","Neal","Brady","Rigoberto","Felicia","Hellen","Georgeann","Carola","Isaias","Ellis","Roseanne","Lenard","Ela","Ophelia","Alesha","Mafalda","Flor","Kelsi","Autumn","Sondra","Pasty","Jacquelyne","Benjamin","Emmie","Mickie","Lang","Jamee","Felice","Daniella","Carola","Nathalie","Genevive"};
		
		countNumbers(numbers);
		System.out.println(countNumbers(numbers));
		
		countTom(names);
		System.out.println(countTom(names));
		
		mostVsLeastNumbers(numbers);
		System.out.println(mostVsLeastNumbers(numbers));
		
		
	}
	
	
	
	/**
	 * UPPGITF 1 Räknar hur många sjuor det finns i names
	 * @param numbers
	 * @return seven
	 */
	private static int countNumbers(int[]numbers) {
		int seven = 0;
		for (int i = 0; i < numbers.length; i++) {
			
			if (numbers[i] == 7) {
				
				seven++;
			} 	
		}
		return seven;
			
		}
	
	/**
	 * UPPGIFT 2 Räknar hur många som heter Tom
	 * @param names
	 * @return tom
	 */
	private static int countTom(String[]names) {
		int tom = 0;
		for (int i = 0; i < names.length; i++) {
			
			if (names[i] == "Tom") {
				tom ++;
			} 	
		}
		return tom;	
	}
	

	
	
	
	
	
	
	
	
	
	}

