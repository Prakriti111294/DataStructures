package Codility;

import java.util.ArrayList;
import java.util.Arrays;

public class Binary {

	public static void main(String[] args) {
		
		bin(15) ;
	}
	
	public static void bin (int n) {
		int temp = n ;
		
		String b = Integer.toBinaryString(temp) ;
		
		//System.out.println("Binary is "+ b);
		
		String[] arr = b.split("1") ;
		
		
		if (!b.endsWith("1")) {
			
			String[] arr1 = new String[arr.length-1] ; 
			System.arraycopy(arr, 0, arr1, 0, arr1.length);
			arr =arr1 ;
		}
		
		if (arr.length>0) {
			/*
			 * for (String string : arr) { System.out.print(" Element is " +string); }
			 * 
			 * System.out.println();
			 */
			
			String max = arr[0] ;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i].length()>max.length()) {
					max = arr[i] ;
				}
				
				}
			
			//System.out.println("the max no of 0s between 1s is " +max);
			
		}
		
		else {
			System.out.println("Sorry the len is 0");
		}
		
		
		
	}
	
	public void findLargest( ) {
		
	}

}
