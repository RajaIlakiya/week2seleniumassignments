package week1.day2.assignment3;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//			a) Declare A String value as"madam"

		String str = "madam";
//		    		b) Declare another String rev value as ""
		String rev = "";

		int strLength = str.length();
//			c) Iterate over the String in reverse order

		for (int i = (strLength - 1); i >= 0; --i) {
//				 d) Add the char into rev

			rev = rev + str.charAt(i);
		}
//			e) Compare the original String with the reversed String, if it is same then print palinDrome 
//			 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 

		if (str.equals(rev)) {
			System.out.println(str + " is a Palindrome String.");
		} else {
			System.out.println(str + " is not a Palindrome String.");
		}

	}

}
