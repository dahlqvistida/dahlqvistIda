package dahlqvistIda;

import java.util.Scanner;

public class uppgifter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
/////////////////////////////////////////////////////////////////////
//                          UPPGIFT 2
//		
//		- Här skrivs valfritt tal in och siffersumman skrivs ut - 
//
//		int digit;
//		int sum = 0;
//		int number;
//		
//		System.out.println("Skriv ett heltal");
//		
//		number = input.nextInt();
//		
//		while (number != 0) {
//			
//		digit = number%10;
//			sum += digit;
//			
//			number = number/10;
//		}
//		System.out.println("Siffersumman är " + sum);
//
////////////////////////////////////////////////////////////////////////
		
		
		
///////////////////////////////////////////////////////////////////////
//                          UPPGIFT 1
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
		

		
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		                                         UPPGIFT 3 
//		
//     - Ett program som läser in ett okänt antal heltal och sedan skriver ut alla talens summa och medelvärde - 
//		
//		boolean repeat = true;
//		int sum = 0;
//		double mede = 0;
//		double antal = 0;
//		
//		while (repeat) {
//			System.out.println("Skriv in ett tal");
//			int tal = input.nextInt();
//			
//			antal ++;
//			 sum = sum +tal;
//			 
//					 
//				if(tal == 0) {
//					repeat = false;
//			}
//				}
//		antal = antal - 1;
//		mede = sum / antal;
//		
//		System.out.println("summan av dessa tal är: " + sum); 
//		System.out.println("medelvärdet är: " + mede);
//		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
	
/////////////////////////////////////////////////////////////////////////////////////
		
//            - Läser in radie + höjd och räknar ut volymen på en cylinder - 
		System.out.println("Skriv in radien");
		double r = input.nextDouble();
		System.out.println("Skriv in höjden");
		double h = input.nextDouble();
		
		double volym = r*r*3.14*h;
		
		System.out.println("Volymen är " + volym);
	}

}
