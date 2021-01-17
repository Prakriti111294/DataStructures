package Codility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MissingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(new int[] {1 , 2 , 3 }));
	}
	
	public static int solution(int[] A) {
		
		Arrays.sort(A);
		int smallest = 1 ;
		for (int i = 0; i < A.length-1; i++) {
			if ((A[i] <= 0 && A[i+1] <= 0 )  || (A[i] == A[i+1]) ) {
				continue ;
			}
			if (A[i] <= 0 && A[i+1] > 1) {
				smallest = 1 ;
				break ;	
			}
			
			else if (A[i] > 0 && A[i+1] > (A[i] + 1) ) {
				smallest = A[i] + 1 ;
			}
			else {
				smallest = A[i+1] + 1 ;
			}
		}
		return smallest ;
	}

}
