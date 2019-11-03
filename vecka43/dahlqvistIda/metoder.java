package dahlqvistIda;

//En metod är ett litet sidoprogramm som man skriver nedanför main metoden
//Det är bra att ha flera metoder när man har mycket stora och jobbiga programm
import java.util.Scanner;

public class metoder {

	public static void main(String[] args) { // denna kallas för main metoden

		twoNumbers();

	}
	/**
	 * Skriver två heltal och skickar dem vidare
	 */
	public static void twoNumbers() {
		int tal1;
		int tal2;

		Scanner input = new Scanner(System.in);

		System.out.println("Skriv in två heltal:");
		tal1 = input.nextInt();
		tal2 = input.nextInt();

		minstaTal(tal1, tal2); // vi skickar tal1 och tal2 till metoden "minstaTal"

		System.out.println(minstaTal(tal1, tal2));
	}

	/**
	 * metoden jämför två heltal,och utvärderar vilket tal som är minst. Den skickar
	 * även en hälsning.
	 * 
	 * @param tal1 heltal1
	 * @param tal2 heltal2
	 * @return String hej
	 */
	// gör man en bra metod så skall men göra så som är gjort ovan, och inte
	// kommentera i själva metoden.

	static String minstaTal(int tal1, int tal2) { // här har vi skapat en metod och man skall alltid döpa metoderna till
													// vettiga namn.
		// metoder får endast vara några rader.
		// man behöver inte ha public innan static, men skriver man public så kan man
		// komma åt den från andra classer.
		// maqn måste ha med static, annars hittar inte programmet metoden.
		if (tal1 <= tal2) {
			System.out.println("Minsta talet är: " + tal1);
		} else {
			System.out.println("Minsta talet är: " + tal2);
		}

		/* man kan även skicka tillbaka saker till huvudmetoden */

		String hej = "Programmet är färdigt";
		// man kan endast skicka tillbaka en sak från en metod. Men vill man skicka
		// tillbaka så måste man skriva string istället för void.

		return hej;

	}

}
