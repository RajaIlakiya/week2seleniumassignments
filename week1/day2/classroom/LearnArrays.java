package week1.day2.classroom;

import java.util.Arrays;
import java.util.Collections;

public class LearnArrays {

	private static Collections arrays;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrNum= {1,46,37,29,999,100};
		Arrays.sort(arrNum);
		System.out.println("Largest num of array: "+arrNum[arrNum.length-1]);
		System.out.println("Second Largest num of array: "+arrNum[arrNum.length-2]);
		for(int i=arrNum.length-1;i>=0;i--)
		
		System.out.println("Reverse the array: "+arrNum[i]);
		System.out.println("Second smalles num of array: "+arrNum[arrNum.length-5]);



	}

}
