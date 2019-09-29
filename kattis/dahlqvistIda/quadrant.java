package dahlqvistIda;

import java.util.Scanner;

public class quadrant {
 
	//skriv in en punkt från ett kordinatsystem och få reda på vilken kvadrant den är placerad i.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt(); //användaren ger ett värde på x kordineten
		int y = input.nextInt(); //användaren ger ett värde på y kordinaten
		
		if (x > 0 && y > 0) {       
			System.out.println(1);   // om x är större än noll och y är större än noll, så hamnar punkten i 1a kvadrant
		}
		else if (x < 0 && y > 0) {   
			System.out.println(2);   // om x är mindre än noll och y är större än noll, så hamnar punkten i 2a kvadranten
		}
		else if (x < 0 && y < 0) {
			System.out.println(3);   // om x är mindre än noll och y är mindre än noll, så hamnar punkten i 3dje kvadranten
		}
		else if (x > 0 && y < 0) {
			System.out.println(4);   // om x är större än noll och y är mindre än noll, så hamnar punkten i 4e kvadranten
		}
		
		

	}

}
