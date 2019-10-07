package dahlqvistIda;

import java.util.Scanner;

public class uppgifter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
///////////////////////////////////////////////////////////////////////
//
//      - Här skrivs två tal in och det minsta talet skrivs ut - 
//
//		
//		System.out.println("Skriv in två tal");
//		int tal1 = input.nextInt();
//		int tal2 = input.nextInt();
//	
//		if(tal1 > tal2) {
//			System.out.println(tal2);
//		}
//		else {
//			System.out.println(tal1);
//		}
///////////////////////////////////////////////////////////////////////
		
		
		
//     - Ett program som läser in ett okänt antal heltal och sedan skriver ut alla talens summa och medelvärde.
		boolean repeat = true;
		int sum = 0;
		
		while (repeat) {
			System.out.println("Skriv in ett tal");
			int tal = input.nextInt();
			
			System.out.println(tal);
			
			 sum = sum +tal;
					
				if(tal == 0) {
					repeat = false;
			}
			

		}
		
		System.out.println(sum);
	
		
		

	}

}
