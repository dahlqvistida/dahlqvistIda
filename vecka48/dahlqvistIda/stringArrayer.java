package dahlqvistIda;

public class stringArrayer {

	public static void main(String[] args) {
		
		String[] namn = {"Malte", "Emil", "Petter", "Linus"}; //String-array med namn
		
		for (int i = 0; i < 40;) {
			
			for (int j = 0; j < namn.length; j++) {
				i += 1;
				System.out.println( i + ". " + namn[j]);
				
			}

		}
		
		
		
	}
}
