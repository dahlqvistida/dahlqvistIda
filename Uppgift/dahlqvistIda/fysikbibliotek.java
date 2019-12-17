package dahlqvistIda;

import java.util.Scanner;

public class fysikbibliotek {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Skriv in grader i Fahrenheit");
		double fahrenheit = input.nextInt();
		fahrenheitToKelvin(fahrenheit);
		System.out.print(fahrenheit + " i kelvin är ");
		System.out.printf("%.2f", fahrenheitToKelvin(fahrenheit));
		System.out.println();
		
		
		System.out.println("Skriv in grader i Kelvin");
		double kelvin = input.nextInt();
		kelvinToCelsius(kelvin);
		System.out.print(kelvin + " i celsius är ");
		System.out.printf("%.2f", kelvinToCelsius(kelvin));
		System.out.println();
		
		
		System.out.println("Skriv in en hastighet i km/h");
		double kmh = input.nextInt();
		velocityConversion(kmh);
		System.out.print(kmh + " i m/s är ");
		System.out.printf("%.2f", velocityConversion(kmh));
		System.out.println();
		
		
		System.out.println("Skriv in en massa och sedan en hastighet");
		double massk = input.nextInt();
		double velocity = input.nextInt();
		kineticEnergy(massk, velocity);
		System.out.print("Den kinetiska energin är ");
		System.out.printf("%.2f", kineticEnergy(massk, velocity));
		System.out.println();
		
		
		System.out.println("Skriv in en massa och sedan en höjd");
		double massp = input.nextInt();
		double height = input.nextInt();
		potentialEnergy(massp, height);
		System.out.print("Den potentiella energin är ");
		System.out.printf("%.2f", potentialEnergy(massp, height));
		System.out.println();
		
		
		System.out.println("Skriv in tre tal");
		double tal1 = input.nextInt();
		double tal2 = input.nextInt();
		double tal3 = input.nextInt();
		delta(tal1, tal2, tal3);
		System.out.print("Medelvärdet är ");
		System.out.printf("%.2f", delta (tal1, tal2, tal3));
		System.out.println();
		
		
		System.out.println("Skriv in paparazzi med olika storlekar på bokstäver");
		String word = input.nextLine();
		smallLetters(word);
		System.out.println(smallLetters(word));
		
		
		String word2 = "Jag vill bli godkänd i programmering! <3";
		pr0grammering(word2);
		System.out.println(pr0grammering(word2));
		
		
		System.out.println("Skriv in en sträcka och sedan en hastighet");
		double s = input.nextInt();
		double v = input.nextInt();
		svtTime(s, v);
		System.out.print("Tiden blir ");
		System.out.printf("%.2f", svtTime(s, v));
		System.out.println();
		
		
		System.out.println("Skriv in en kraft och sedan en sträcka");
		double force = input.nextInt();
		double distance = input.nextInt();
		work(force, distance);
		System.out.print("Arbetet blir ");
		System.out.printf("%.2f", work(force, distance));
		System.out.println();
		
		
		System.out.println("Skriv in en hastighet");
		double velocity2 = input.nextInt();
		velocityToHeight(velocity2);
		System.out.print("Höjden är ");
		System.out.printf("%.2f", velocityToHeight(velocity2));
		System.out.println();
		
		
		System.out.println("Skriv in en volym");
		double volym = input.nextInt();
		sphereVolumeToRadius(volym);
		System.out.print("Radien är ");
		System.out.printf("%.2f", sphereVolumeToRadius(volym));
		System.out.println();
		
		
		//Räknar ut sträcka med hjälp av tid och konstantacceleration och hastighet
		System.out.println("Skriv in en accelleration");
		double a = input.nextInt();
		System.out.println("Skriv in en tid");
		double t = input.nextInt();
		System.out.println("Skriv in en hastighet");
		double v2 = input.nextInt();
		distanceAvAcceleration(a, t, v2);
		System.out.print("Sträckan är ");
		System.out.printf("%.2f", distanceAvAcceleration(a, t, v2));
		System.out.println();
	
		
		//Räknar ut effekt med hjälp av kraft, sträcka och tid
		System.out.println("Skriv in en kraft");
		double f3 = input.nextInt();
		System.out.println("Skriv in en sträcka");
		double s3 = input.nextInt();
		System.out.println("Skriv in en tid");
		double t3 = input.nextInt();
		effekt(f3, s3, t3);
		System.out.print("Effekten är ");
		System.out.printf("%.2f", effekt(f3, s3, t3));
		System.out.println();
		
		input.close();
	}
	
	/**
	 * Tar emot fahrenheit och omvandlar det till kelvin
	 * @param fahrenheit
	 * @return kelvin
	 */
	public static double fahrenheitToKelvin(double fahrenheit){
		
		double kelvin = (fahrenheit +459.67) *5 / 9;
		return kelvin;
		
	}

	/**
	 * Tar emot grader i kelvin och omvandlar till celsius
	 * @param kelvin
	 * @return celsius
	 */
	public static double kelvinToCelsius(double kelvin){
		
		double celsius = kelvin -273.15;
		return celsius;
		
	}
	
	/**
	 * Tar emot en hastighhet i km/h och omvandlar till m/s
	 * @param kmh
	 * @return ms
	 */
	public static double velocityConversion(double kmh){
		
		double ms = kmh / 3.6;
		return ms;
		
	}
	
	/**
	 * Tar emot em massa och en hastighet och räknar ut den kinetiska energin
	 * @param massk
	 * @param velocity
	 * @return energyk
	 */
	public static double kineticEnergy(double massk, double velocity){
		
		double energyk = (massk*velocity*velocity) / 2;
		return energyk;
		
	}

	/**
	 * Tar emot en massa och en höjd och omvandlar det till potentiell energi
	 * @param massp
	 * @param height
	 * @return energy
	 */
	public static double potentialEnergy(double massp, double height){
		
		double energyp = massp*9.82*height;
		return energyp;
	}

	/**
	 * Tar in tre tal och räknar ut medelvärdet 
	 * @param tal1
	 * @param tal2
	 * @param tal3
	 * @return medel
	 */
	public static double delta(double tal1, double tal2, double tal3){
		
		double medel = (tal1 + tal2 + tal3) / 3;
		return medel;
		
	}
	
	/**
	 * Tar in en sträng och ändrar alla bokstäver till små
	 * @param word
	 * @return word i små bokstäver
	 */
	public static String smallLetters(String word){
		
		return word.toLowerCase();
		
	}
	
	/**
	 * Omvandlar en sträng till att alla är stora bokstäver
	 * @param word2
	 * @return word2 i stora bokstäver
	 */
	public static String pr0grammering(String word2){
		
		return word2.toUpperCase();
	}

	/**
	 * Tar in sträcka och hastighet och räknar ut tid
	 * @param s
	 * @param v
	 * @return t
	 */
	public static double svtTime(double s, double v){
		
		double t = s/v;
		return t;
	}

	/**
	 * Tar in en kraft och en sträcka och räknar ut arbetet
	 * @param force
	 * @param distance
	 * @return w
	 */
	public static double work(double force, double distance){
		
		double w = force*distance;
		return w;
	}

	/**
	 * Tar in en hastighet och omvandlar det till en höjd
	 * @param velocity2
	 * @return height
	 */
	public static double velocityToHeight(double velocity2){
		
		double height = (velocity2 * velocity2) / (2*9.82);
		return height;
	}
	
	/**
	 * Tar in en volym och räknar ut radien på en spfären  
	 * @param volym
	 * @return radie
	 */
	public static double sphereVolumeToRadius(double volym){
		
		double radie = (Math.cbrt((3*volym) / (4*Math.PI)));
		return radie;
		
	}
	
	/**
	 * Tar in en acceleration, tid och en hastighet och räknar ut sträckan
	 * @param a
	 * @param t
	 * @param v2
	 * @return s
	 */
	public static double distanceAvAcceleration(double a, double t, double v2) {
		
		double s = v2*t + ((a*t*t)/2);
		
		return s;
		
	}
	
	/**
	 * Tar in kraft, sträcka och tid och räknar ut effekten.
	 * @param f3
	 * @param s3
	 * @param t3
	 * @return p
	 */
	public static double effekt(double f3, double s3, double t3) {
		
		double w = f3*s3;
		double p = w/t3;
		
		return p;
		
	}
	
}
