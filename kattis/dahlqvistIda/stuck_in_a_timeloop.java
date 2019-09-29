package dahlqvistIda;

import java.util.Scanner;

public class stuck_in_a_timeloop {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int ab = input.nextInt();
		for(int i = 1; i <= ab; i++) {
		System.out.println(i + " " + "Abracadabra");
		}
		input.close();

}
}