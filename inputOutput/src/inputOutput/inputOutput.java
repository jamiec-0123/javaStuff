package inputOutput;
import java.util.*;
public class inputOutput {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String userInput;
		Boolean error;
		int userNumber;
		Random rand = new Random();
		//creates a new random number
		int randomNumber = rand.nextInt(25)+1;
		//Random number with the minimum of 1 to 25

		do
		{
		System.out.println("Guess the number between 1 and 25");
		//outputs instructions to the user 

		//reads from system in
		 userInput =  reader.next();
		//gets  what ever the user has entered
		 
		
		 do {
		 try 
		 {
			 userNumber =Integer.parseInt(userInput);

			 error = false;
			 
		 }
		 catch(Exception e)
		 {
			userNumber = 0;
			System.out.println("Guess the number between 1 and 25");
			//outputs instructions to the user 
			//reads from system in
			userInput =  reader.next();
			//gets  what ever the user has entered
			error =true;
			 
		 }
		 }
		 while(error == true);
		 
		 if(userNumber > randomNumber) 
		 //checks to see if the users number is greater than the random number
		 {
			 System.out.println("Too high");
		 }
		 else if(userNumber < randomNumber)
			 
		 {
			 System.out.println("Too low");
		 }
		}
		while(userNumber !=randomNumber);
		//keep repeating until the guess is correct
		System.out.println("You've guessed correctly the random number is "+randomNumber);
		reader.close();
			 //closes the reader

	}			 
}
