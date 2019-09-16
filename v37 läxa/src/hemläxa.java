    
       import java.unit.Scanner; 

public class hemläxa {


	public static void main(String[] args) {


		java.util.Scanner input = new java.util.Scanner(System.in); //använd detta när du vill ha input
		
	          System.out.println("What's your name?: "); // skickar ett meddelande till användaren
		
		String Name = input.nextLine(); //läser in namn från användare
		
	       	  System.out.println("What's your adress?" );
		
		String Adress = input.nextLine(); 
		
		      System.out.println("What's you zipcode?");
		
		String zipcode = input.nextLine();
		
		      System.out.println("What's your phone number?" );
		
		String Phone = input.nextLine();
		
		      System.out.println("Which city do you live in?" );
		
		String City = input.nextLine();
	
	
		System.out.println("\n" + "Information");
		System.out.println("Name" + "       " + Name);
		System.out.println("Adress" + "     " + Adress + "\n" + "           " + zipcode + " "+ City);
		System.out.println("Phone" + "      " + Phone);
		
	
	}

}
