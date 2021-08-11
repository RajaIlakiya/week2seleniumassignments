package week1.day2.assignment2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Here is the input
		int []a = { 1, 2, 3, 4, 7, 6, 8 };

		// Sort the array

		Arrays.sort(a);	

		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 1; i <= a.length; i++) {
//			 check if the iterator variable is not equal to the array values respectively
			if (a[i-1] != i) {
				// print the number
				System.out.println("Missing element in Array:" + i);
				break;

				// once printed break the iteration
			}

		}

	}
}
