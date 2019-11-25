package dahlqvistIda;

import java.util.Arrays;
import java.util.Scanner;

public class arreyer {
	/*
	 * ARRAYER en stor låda som inehåller flera smålådor. Kan tex vara intarry, då
	 * inehåller alla lådor en int. när man kallar på lådorna så är första låda
	 * låda0, och den andra är låda1. MAN KAN INTE blanda datatyper i en array. Man
	 * kan tex endast använda int med int. Och double med double.
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		
		int[] siffror1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // här har vi skapat en array och fyllt den med 10 tal.

		int[] siffror2 = new int[10]; // här skapar vi en array med 10 tomma lådor.

		int[] summa = new int[10];
		
		
		
		for (int i = 0; i < siffror2.length; i++) { //fyller array siffror2 med input från konsolen.
			
			siffror2[i] = input.nextInt();
		}
		
		for (int i = 0; i < summa.length; i++) {
			
			summa[i] = siffror1[i] + siffror2[i];
			
		}
        for (int i : summa) { // ett snabbare sätt att skriva en forloop när man använder sig av arrayer. 
			
			System.out.print(i + ", ");
		}
		
		/* System.out.println(siffror1[0]); här skriver vi ut första siffran i första
		 arrayen. ska man skriva ut alla så blir detta måncket jobbigt.*/

		
		for (int i = 0; i < siffror1.length; i++) { //denna loopar igenom siffror1[] och skriver ut innehållet
			
			System.out.print(siffror1[i]); // här printar vi siffrorna i rad, inte på nya rader
										   // skulle man endast skriva i så hade den skrivit ut nummrerna på lådorna
										   // (0-9)
		}
		
		
		
		System.out.println();
		System.out.println(Arrays.toString(siffror1)); //Arrays är en inbyggd metod, det vet vi för att den är kursiv. 
		                                             //allternativt sätt att skriva ut en array
		
		
		for (int i : siffror1) { // ett snabbare sätt att skriva en forloop när man använder sig av arrayer. 
			
			System.out.print(i);
		}
		
		
	}

}
