package dahlqvistIda;

import java.util.Scanner;

public class laxa43 {

	public static void main(String[] args) {
		
		lol();
		
		max();
		
//		count(); //vet tyvärr inte hur jag ska lösa denna
		
		kelvinToCelsius();
		
		fahrenheitToCelsius();
	    
		ageControl();

		stair();
		
	}
	
	

	/**
	 * Skriver ut HAHAHAHA
	 */
     public static void lol() {
	
	System.out.println("HAHAHAHAHA");
}  

	/**
	 * Tar in två heltal och jämför d
	 * @return störstatal
	 */

	public static int max() {
		
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Skriv in två tal");
		
		a = input.nextInt();
		b = input.nextInt();
		
		int storstatal; 
		
		if (b >= a) {
			storstatal = b;
		}
		else {
			storstatal = a;
		}
		
		System.out.println("Programmet är klart"); //det står ej att man skall skriva ut det största talet, så skrev detta som en liten notis.
		
		return storstatal; 	
	} 

	
	
/*	public static int count(){
		// vet inte hur jag skall göra denna tyvärr....
		Scanner input = new Scanner(System.in);
		
		int n;
		System.out.println("Skriv in ett heltaltal");
		n = input.nextInt();
		
		
		int allasiffror = 0 < n;
		
		System.out.println(allasiffror + n);
		
		return allasiffror;
	} */
	
	/**
	 * omvandlar kelvin till celsius
	 * @return celsius
	 */
	public static double kelvinToCelsius() {
	
	Scanner input = new Scanner(System.in);
	
	double kelvin;
	double celsius;
	System.out.println("Skriv in grader i kelvin");
	kelvin = input.nextInt();
	
	celsius = kelvin - 273.1500;
	
	System.out.println("detta motsvarar " + celsius + " grader celsius");
	
	
	return celsius;
	} 
	
	/**
	 * omvandlar fahrenheit till celsius
	 * @return
	 */
        public static double fahrenheitToCelsius() {
		Scanner input = new Scanner(System.in);
		double fahrenheit;
		double celsius;
		double c;  //detta är halvvägs genom uträkningen till Celsius för jag vet inte hur jag skall göra annars
		System.out.println("Skriv in grader i fahrenheit");
		fahrenheit = input.nextInt();
		
		c = fahrenheit - 32;
		celsius = c/1.80;
		
		System.out.println("detta motsvarar" + celsius + " grader celsius");
		
		return celsius;
		
		
		
	}
	

	
	/**
	 * Skriver vad du får lov o göra när du är en viss ålder.
	 */
	public static void ageControl() {
		
	Scanner input = new Scanner(System.in);
	int age;
	System.out.println("Skriv in din ålder");
	age = input.nextInt();
	
	if (age >= 0 &&  5 >= age) {
		System.out.println("Småbarn får inte göra något"); 
	}
	else if (age >= 6 && 12 >= age) {
		System.out.println("Du får spela Fortnite");
	}
	else if (age >= 13 && 14 >= age) {
		System.out.println("Du är tonåring");
	}
	else if (age >= 15 && 17 >= age) {
		System.out.println("Du får köra moppe");
	}
	else if (age >= 18 && 20 >= age) {
		System.out.println("Du får köra bil");
	}
	else if (age >= 21 && 64 >= age) {
		System.out.println("Du får vuxenstraff om du gör något dumt");
	}
	else if (age >= 65 && 99 >= age) {
		System.out.println("Du är pensionär");
	}
	else {
		System.out.println("R.I.P??");
	}
	} 
	

/**
 * gör en trappa, där användaren skriver in basen	
 */
	public static void stair() {
		
		Scanner input = new Scanner(System.in);
		
		int stair;
		System.out.println("Skriv in basen till trappan");
		stair = input.nextInt();
		
		for(int a = 0; a < stair; a++) {
			
			for (int b = 0; b < stair-a; b++) {
		
					System.out.print(" ");

				}
				for (int b = 0; a >= b; b++) {
					System.out.print("x");
				}
				System.out.println();
	}
	
	}
}
