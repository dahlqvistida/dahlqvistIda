package dahlqvistIda;

public class notesHomework {

	
	//GÖR EN METOD AV DSETTA!!!!!!
	
	
	
	//Creating a loop, where success is true
			while (!success) { 
				
				try {
					//User gives the variable their number of choice
					choice = input.nextInt();
					System.out.println("You made this choice: " + choice);
					
					success = true; 
					               
					
				} 
				//If the user writes their input wrong
				catch (Exception a) {
					input.next();
					System.out.println("You typed the WRONG input, try again!");
				}
			}
}
