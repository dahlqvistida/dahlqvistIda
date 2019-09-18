import java.util.Scanner;

//få fram medelvärde, högsta och lägsta talet på fem heltal

public class läxa_v38 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //används för om man vill ha input
		int tal5 = 0;
		int tal1 = 0;
		int tal2 = 0;
		int tal3 = 0; 
		int tal4 = 0;
		
				System.out.println("skriv in ett heltal");
		tal1 = input.nextInt();
		          
		        System.out.println("skriv in ett heltal");
		tal2 = input.nextInt();
		
		        System.out.println("skriv in ett heltal");
		tal3 = input.nextInt();
		
		        System.out.println("skriv in ett heltal");
	    tal4 = input.nextInt();
			
	            System.out.println("skriv in ett heltal");
		tal5 = input.nextInt();
		
		
	    if (tal1 >= tal2 && tal1 >= tal3 && tal1 >= tal4 && tal1 >= tal5) { //om tal1 är stört så kommer den printas ut och hoppa över resten, annars går den vidare
	    	System.out.println("Största tal:" + "  " + tal1);
	    }
	    else if (tal2 >= tal1 && tal2 >= tal3 && tal2 >= tal4 && tal2 >= tal5) { //om tal2 är störst, kommer det printas ut annars går den vidare till nästa "else if"
	    	System.out.println("Största tal:" + "  " + tal2);
	    }
	    else if (tal3 >= tal1 && tal3 >= tal2 && tal3 >= tal4 && tal3 >= tal5) { //om tal3 är störst så kommer det printas ut annars går den vidare till nästa "else if"
	    	System.out.println("Största tal:" + "  " + tal3);
	    }
	    else if (tal4 >= tal1 && tal4 >= tal2 && tal4 >= tal3 && tal4 >= tal5) { //om tal4 är störst så kommer det printas ut, annars går den vidare
	    	System.out.println("Största tal:" + "  " + tal4);
	    }
        else if (tal5 >= tal1 && tal5 >= tal2 && tal5 >= tal3 && tal5 >= tal4) { //om inget annat hänt så kommer tal5 printas ut
        	System.out.println("Största tal:" + "  " + tal5);
        }
	    
	   
	    if (tal1 <= tal2 && tal1 <= tal3 && tal1 <= tal4 && tal1 <= tal5) {
	    	System.out.println("Minsta tal:" + "  " + tal1);
	    }
	    else if (tal2 <= tal1 && tal2 <= tal3 && tal2 <= tal4 && tal2 <= tal5) {
	    	System.out.println("Minsta tal:" + "  " + tal2);
	    }
	    else if (tal3 <= tal1 && tal3 <= tal2 && tal3 <= tal4 && tal3 <= tal5) {
	    	System.out.println("Minsta tal:" + "  " + tal3);
	    }
	    else if (tal4 <= tal1 && tal4 <= tal2 && tal4 <= tal3 && tal4 <= tal5) {
	    	System.out.println("Minsta tal:" + "  " + tal4);
	    }
	    else if (tal5 <= tal1 && tal5 <= tal2 && tal5 <= tal3 && tal5 <= tal4) {
	    	System.out.println("Minsta tal:" + "  " + tal5);
	    }                                                                            //här printas det minsta tal ut
	    
	    
		double summa = tal1 + tal2 + tal3 + tal4 + tal5; //här räknar den ut summan av de fem talen
		
		double medel = summa / 5; // här dividerar den summan med fem, för att få fram medelvärdet. 
		
		
		System.out.println("Medelvärde:" + "  " + medel);
				
	
		
		
	
		
				
	}

}
