package dahlqvistIda;

import java.util.Scanner;

public class hittaFelEx2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] numbers = new int[10];
		int index;
		
		for (int i = 1; i < numbers.length; i++) {
			
			numbers[i] = i+1; //detta skapar en INT array från 0 till 9
		}
		
		/* System.out.println(numbers[11]); //skriver vi ut detta så går det inte eftersom
										//vi försöker skriva ut ett element som inte finns
										//därför kan vi här skapa en try- catch istället */
		
		
		System.out.println("Write an index number ");
		index = input.nextInt();
		
		//SKRIV FÖRFAN ALLTID TRY CATCH NÄR DU SKRIVER KOD
		try { 
			System.out.println(numbers[index]);

		} catch (Exception e) {
			
			System.out.println("Array index out of bound");
		}
		

	}

}
