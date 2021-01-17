package Codility;

import java.util.Arrays;

public class permMissingElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(new int[] {1, 2 , 4 , 3 , 5}) ; 
		
	}
	
	public static void test(int[] A) {
		
		int[] B = new int[] {1 , 3 , 5 , 4} ;
		
		Arrays.sort(A);
		Arrays.sort(B);
		int missing = 0 ;
		
		
		if ((!A.equals(B)) && A.length>B.length) {
			for (int i = 0; i < B.length; i++) {
				if (A[i]!=B[i]) {
					missing = A[i] ;
					break ;
				}
			}
		}
		else {
			missing = A[A.length-1] ;
		}
		return missing ;
	}

}
