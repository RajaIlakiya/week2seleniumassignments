package week1.day1.assignments;

public class PrimeNumber {
	

	public static void main(String[] args) {



		// Declare an int Input and assign a value 13
		
		int input=17;		

		// Declare a boolean variable flag as false
		
		boolean flag=false;
		

		// Iterate from 2 to half of the input
		
		for (int i = 2; i < input/2; i++) {		

			// Divide the input with each for loop variable and check the remainder
			
			int remainder = input%i;			

			// Set the flag as true when there is no remainder
			
			if (remainder==0) {
				flag = true;
				// break the iterator
				break;
			}
				
		}


		// Check the flag (Provide a condition)
			
			if(flag==false) {
				// Print 'Prime' when the condition matches
				   System.out.println("It is a Prime Number");
				 }
			else {
				// Print 'Not a Prime' when the condition doesn't match  
				System.out.println("It is not a Prime Number");
				 }
		

    

  }
	
}