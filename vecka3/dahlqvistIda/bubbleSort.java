package dahlqvistIda;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
				//bubbleSort sorterar massa data
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Användaren får bestämma hur många platser arreyen skall ha.
		System.out.println("Hur många platser skall det finnas? ");
		
		
		int lenght = input.nextInt();
		int []  numbers = new int[lenght];
		System.out.println("Såhär många platser finns det: " + lenght);
		System.out.println();

		boolean swapped = false;
		int temp;
		
		
		System.out.println("Skriv två tal som den skall välja mellan");
		
		int choice = input.nextInt();
		int choice2 = input.nextInt(); 
		System.out.println("Du valde detta intervallet " + choice + " och " + choice2);
		choice2 += 1;
		
		
		//Vi slumpar fram heltal att fylla arrayen. Tal från 0 till 100
		for (int i = choice; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * choice2); 
		}
		
		System.out.println(Arrays.toString(numbers));
		
		do {
			
			swapped = false;
		for (int i = choice; i < numbers.length - 1; i++) {
			
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
