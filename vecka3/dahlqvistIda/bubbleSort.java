package dahlqvistIda;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		
		//Vi skapar en array med 37 platser
		int []  numbers = new int[37];

		boolean swapped = false;
		int temp;
		
		//Vi slumpar fram heltal att fylla arrayen. Tal från 0 till 100
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100); 
		}
		
		System.out.println(Arrays.toString(numbers));
		
		do {
			
			swapped = false;
		for (int i = 0; i < numbers.length - 1; i++) {
			
			//byter plats på två intill liggande tal
			if (numbers[i] > numbers[i+1]) { 
				temp = numbers[i]; //sparar värdet tillfälligt
				numbers[i] = numbers[i+1];
				numbers[i+1] = temp; 
				swapped = true;

			}
		  }
		}
		while (swapped);
		System.out.println(Arrays.toString(numbers));
		
	}
	

}
