package dahlqvistIda;

public class anteckningar_homework {

	public static void main(String[] args) {

		int[] numbers = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};

		mostNumbers(numbers);
		System.out.println(mostNumbers(numbers));
		
		leastNumbers(numbers);
		System.out.println(leastNumbers(numbers));
		
	}
private static int mostNumbers(int[]numbers) {
	
	int most = 0; 
	int max = 0;
	
	for (int i = 0; i < numbers.length; i++) { //kollar från 0 till 10
		int amount = 0; //ökar vid varje träff
		for (int j = 0; j < numbers.length; j++) { //kollar igenom samtilga siffror 
			if(numbers[j] == i) {
				amount ++;
			}
			
		}
		if (amount > max ) {
			most = i;
			max = amount; 
		}
			
		
		
		
	}
	return most;
	
}
private static int leastNumbers(int[]numbers) {
	
	int least = 0;
	int min = 100;
	
	for (int i = 0; i < 10; i++) { //kollar från 0 till 10
		int amount = 0; //ökar vid varje träff
		for (int j = 0; j < numbers.length; j++) { //kollar igenom samtilga siffror 
			if(numbers[j] == i) {
				amount ++;
			}
			
		}
		if (amount < min ) {
			least = i;
			min = amount; 
		}
			
		
		
		
	}
	return least;
}

}
