import java.util.Scanner;
//ANTECKNINGAR I SLUTET
public class monday {

	public static void main(String[] args) {

		// lär dig villkor :) "Denna lektion: om du är äldre än blabla så... jämför två
		// heltal"

		boolean again = true; // boolean says true or false
		int age = 0; // vi har skapat en låda som heter age och har gett den ett tillfälligt värde, 0
						// int är ett heltal + när något är understruket i gult så betyder det att
						// variabeln inte används.
		int svar = 1;
		if (again) {

			Scanner input = new Scanner(System.in); // detta gör d möjligt att få input från användaren
			// tryck ctrl och space för att slippa lägga in "import blablabla"

			System.out.println("Hur gammal är du?");
			age = input.nextInt();

			if (age >= 18) { // om något är större eller lika med 18 så är det true, om något är mindre så
								// äre false
				System.out.println("Vroom Vroom!");
			}

			else if (age > 14 && age < 18) { // två och tecken om man skall jämföra något
				System.out.println("Överlev med moppe ett tag till");

			}

			else {
				System.out.println("HAHAHAHAHAHAH Hej lille vän!");
			}
			
		}
		
	}
	
}

// && betyder lika med, man jämför två saker om det är sant
// || betyder eller
// == betyder att två saker är samma
// != betyder att något inte är desamma
