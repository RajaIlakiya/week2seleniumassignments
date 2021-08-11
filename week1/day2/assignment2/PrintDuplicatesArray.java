package week1.day2.assignment2;

import java.util.Arrays;

public class PrintDuplicatesArray {

	public static void main(String[] args) {
		// Input

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		Arrays.sort(arr);

		// get the length of the array

		int len = arr.length;
		System.out.println("Duplicates of Array:");


		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int j = 0; j < len - 1; j++) {

			// assign 0 to count
			int count = 0;

			// iterate from i to the length of the array by adding 1 to it (inner loop
			// starts here)

			for (int i = j + 1; i < len; i++) {
				// compare both the loop variables & check they're equal
				if (arr[j] == arr[i]) {

					// increase the count if both the arrays are equal
					count = count + 1;
				}
				// Out of the inner loop, check and print the first array variable if count is
				// more than 0
				if (count > 0) {
					System.out.println(arr[j]);
					break;
				}

			}
		}

	}
}