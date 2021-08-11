package week1.day2.assignment3;

import java.util.Arrays;

public class ReverseEvenWords {
	//Build a logic to reverse the even position words (output: I ma a erawtfos tester)

	
	
		public static void main(String[] args) {
//			 * Declare the input as Follow
			String test = "I am a software tester"; 
//			a) split the words and have it in an array
			String[] splitArray=test.split(" ");
//			b) Traverse through each word (using loop)
			for(int i=0;i<splitArray.length;i++)
			{
//				c) find the odd index within the loop (use mod operator)
				if(i%2!=0)
				{
//					d)split the words and have it in an array
					char[] charArray = splitArray[i].toCharArray();
//					e)print the even position words in reverse order using another loop (nested loop)

					for(int j=charArray.length-1;j>=0;j--) 
					{
						System.out.print(charArray[j]);
					 }
					System.out.print(" ");
				}
//				f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).

				else
				
					System.out.print(splitArray[i]+" ");
					 }
				}
				

						
					}
				
				           

						






