package week1.day2.assignment3;

import java.util.Arrays;

public class FindTypes {
	public static void main(String[] args) {
		// Here is the input
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;

		// Build the logic to find the count of each
		/* Pseudo Code:
			*/

		// Print the count here
//		a) Convert the String to character array
		
		char[] string =test.toCharArray();
		String str=Arrays.toString(string);
		System.out.println(string);
		
//		b) Traverse through each character (using loop)
		
		for(int i=0;i<string.length;i++)
		{
//			c) Find if the given character is what type using (if)
//			i)  Character.isLetter
		  if(Character.isLetter(string[i])  )
		  {
			  letter++;

		  }

//		ii) Character.isDigit
		  else if(Character.isDigit(string[i])  )
		  {
			  num++;

		  }
//		iii)Character.isSpaceChar
		  else if(Character.isSpaceChar(string[i])  )
		  {
			  space++;

		  }
		  else {
			  specialChar++;
		  }
		  
		}

//		iv) else -> consider as special character
			System.out.println("letter: " + letter);

		  System.out.println("number: " + num);

			System.out.println("space: " + space);

			System.out.println("specialCharcter: " + specialChar);

			
		}
		
		
	}
