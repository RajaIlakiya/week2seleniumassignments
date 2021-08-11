package week1.day2.assignment2;

import java.util.Arrays;

public class FindInterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  a) Declare An array for {3,2,11,4,6,7};	 
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int length1 = arr1.length;
		System.out.println("Length of 1st array1: " + length1);
//	b) Declare another array for {1,2,8,4,9,7}
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };
		int length2 = arr2.length;
		System.out.println("Length of 1st array2: " + length2);
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		System.out.println("Intersection of the two arrays ::");
//	 c) Declare for loop iterator from 0 to array length  
		for (int i = 0; i < arr1.length; i++) {
//    	 d) Declare a nested for another array from 0 to array length
			for (int j = 0; j < arr2.length; j++) {
//        	e) Compare Both the arrays using a condition statement
				if (arr1[i] == arr2[j]) {
//        	   f) Print the first array (shoud match item in both arrays)
					System.out.println(arr1[i]);

				}
			}

		}
	}
}
