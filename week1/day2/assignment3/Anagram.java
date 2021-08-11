package week1.day2.assignment3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 *Declare a String 
			String text1 = "stops";
			int length1=text1.length();
//		 *Declare another String
			String text2 = "potss";	 
			int length2=text2.length();
//			concat both strings
//			String text=text1.concat(text2);		
//			   System.out.println(text);

//			* a) Check length of the strings are same then (Use A Condition)
			if(length1 == length2)
			{

//			 * b) Convert both Strings in to characters
	char[] strArray1 = text1.toCharArray();
	String string1 = Arrays.toString(strArray1);
	System.out.println(string1);
	char[] strArray2 = text2.toCharArray();
	String string2 = Arrays.toString(strArray2);
	System.out.println(string2);

			
//			 * c) Sort Both the arrays
	Arrays.sort(strArray1);
	   System.out.println(strArray1);

    Arrays.sort(strArray2);
	   System.out.println(strArray2);


//			 * d) Check both the arrays has same value
boolean result = Arrays.equals(strArray1, strArray2);
System.out.println("Is both strings are same: " + result);
	 if(result) {
	        System.out.println(text1 + " and " + text2 + " are anagram.");
	      }
	      else {
	        System.out.println(text1 + " and " + text2 + " are not anagram.");
	      }

			}
	
}
}
