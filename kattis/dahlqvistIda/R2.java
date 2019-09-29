package dahlqvistIda;

import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int r1 = input.nextInt();   //användaren namnger R1
		int S = input.nextInt();    //användaren namnger S
		
		System.out.println(S*2-r1); //räknar ut vad R2, eftersom S är (R1+R2)*2. Därför dividerar vi S med två och subtraherar med R1 = R2
		

	}

}
