package dahlqvistIda;

public class lektion_modulus {

	public static void main(String[] args) {
		
		// % == modulus (det är same shit) modulus betyder rest
		
		int tal1 = 47;
		int tal2 = 19;
		int tal3 = 69;
		int tal4 = -137;
		
		System.out.println(tal1 % 3); //testar ifall tal1 är delbart med 3 och vad den har för rest. 
		                              //är talet belbart med 3 så blir svaret 0, är den inte det så anges "rest";en.
		
		int sum = 0;
		
		for(int i = 0; i < 101; i++) {
			
			if(i % 3 == 0) {
				System.out.println("Talet" + " " + i + " är delbart med 3");
				
				sum += i;
				
			}
			
		}
		System.out.println("summan av dessa talen är " + sum);
		
		
		int turn =0 ;
		
		while  (true) {   //while loopar har alltid ett villkor
			                         
			//skriver ut vems tur det är upp till 100gånger(????)
			turn++;
			
			if(turn % 3 == 0) {
				System.out.println("Davids tur");
				
			}
			else if (turn % 3 == 1) {
				System.out.println("Johans tur"); //fattar rn inget
			}
			else if (turn % 3 == 2) {
				System.out.println("Lucas tur");
			}
			
			if (turn == 100) {
				break;
			}
				
		
		}
	}

}
