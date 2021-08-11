package week1.day2.assignment3;

import java.util.Arrays;

public class CharOccurance {

	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String
		
			String str = "Welcome to Chennai";

			// declare and initialize a variable count to store the number of occurrences
			    int count=0;
			    char str2='e';
			
			// convert the string into char array
				char[] strArray=str.toCharArray();
				String string1 = Arrays.toString(strArray);
                
			//get the length of the array
				int length=string1.length();
				
			// traverse from 0 till the array length 
				for(int i=0;i<length;i++) {
				// Check the char array has the particular char in it 
					
					if(string1.charAt(i)==str2)

					{
			
				// if is has increment the count
						count++;
					
				// print the count out of the loop
					
				}
					}
				
				System.out.println(count);
	}
	
	}

