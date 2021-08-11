package week1.day2.assignment2;

import java.util.Arrays;

public class FindSecondLargest {

	// Here is the input
//	int[] data = {3,2,11,4,6,7};

	
	/*
	 Pseudo Code:
	 1) Arrange the array in ascending order
	 2) Pick the 2nd element from the last and print it
	 */

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int length=data.length;
		System.out.println("Second Largest elemnent:"+ data[length-2]);


	}
}
