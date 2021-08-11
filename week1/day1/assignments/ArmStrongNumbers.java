package week1.day1.assignments;

public class ArmStrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare your input
		int var=153;


		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
        int calculated=0;
        int remainder;
        int original;
 
	   // Assign input into variable original 
        System.out.println("Input-> " + var);

        original=var;

	
      // Use loop to calculate: use while loop to set condition until the number greater than 0
        while(var>0) {
 
	  // get the remainder when done by 10 (Tip: Use Mod operator)

	     remainder=var%10;
	 
      //get the quotient when done by 10 (Tip: Assign the result to input)

	     var=var/10;

	//Add calculated with the cube of remainder & assign it to calculated
	     calculated=calculated+((remainder)*(remainder)*(remainder));
         System.out.println(calculated);}
 
	
    // Check whether calculated and original are same
           if(calculated==original)
           {
    //When it matches print it as Armstrong number
         System.out.println("Given Number is an Armstrong Number");

	        }
           else
            {
	     System.out.println("Given number is not an Armstrong Number");
            }

      }
}