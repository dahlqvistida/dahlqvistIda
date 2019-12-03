package dahlqvistIda;

public class array2 {

	public static void main(String[] args) {
		
		int antalA = 0; 
		int aA= 0;
		
		String [] namn = { "Billskog Gabriel", "Bratland Petter", "Dahlqvist Ida", "Erlandsson Malte", "Favoryt Kalle"};
		
		//Vi vill räkna hur många a det finns i denna arrayen
		
		for (int i = 0; i < namn.length; i++) { //kollar strängen, för och efternamn
			
				
				if (namn[i].contains("B")) { 
					antalA++;		
				
				
				for (int j = 0; j < namn[i].length(); j++) { // här kollar den bokstav för bokstav
				
					
			}
		}
		

	}
		System.out.println("Antal a är " + antalA);
	}
}
