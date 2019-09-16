    
       import java.unit.Scanner; 

public class hemläxa {


	public static void main(String[] args) {


		Scanner input = new Scanner(System.in); //använd detta när du vill ha input
		
		System.out.print("What's your name?: "); // skickar ett meddelande till användaren
		
		String Name = input.nextLine(); //läser in namn från användare
		
		System.out.print("What's your adress?" );
		
		String Adress = input.nextLine(); 
		
		System.out.print("What's your phone number" );
		
		String Phone = input.nextLine();
		
		System.out.print("Which city do you live in?" );
		
		String City = input.nextLine();
	
	
	System.out.println(Name + "\n" + Adress + "\n" + Phone + "\n" + City);      
	
	}

}
