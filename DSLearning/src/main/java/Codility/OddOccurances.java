package Codility;

import java.util.HashMap;

public class OddOccurances {

	public static void main(String[] args) {
		int[] a = new int[] {9,3,9,3, 9 , 7 , 9} ;
		System.out.println(test(a)) ;

	}
	
	public static int test(int[] A) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>() ;
		
		for (int i = 0; i < A.length; i++) {
			
			if (!map.containsKey(A[i])) {
				map.put(A[i], 1) ;
			}
			else if (map.containsKey(A[i])) {
				map.put(A[i], 2) ;
			}
		}
		
		int occ = 0 ;
		
		for (int i = 0; i < A.length; i++) {
			
			if (map.get(A[i]) == 1) {
				occ = A[i] ;
			}
			
		
		}
		return occ;
		
	}

}
