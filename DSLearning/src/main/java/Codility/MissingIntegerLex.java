package Codility;

import java.util.*;

public class MissingIntegerLex {
	
	public static void main(String[] args) {
		
		int[] A = {2,5,7,8,7,1,4,6,10};
		int[] B = {10,4,2,2,7};
		ArrayList<Integer> result = new ArrayList<Integer>();
		List<Integer> bList = new ArrayList<Integer>();
		for(int i=0; i<B.length; i++) {
			bList.add(B[i]);
		}
		for(int i=0; i<A.length; i++) {
			if(!bList.contains(A[i])) {
				result.add(A[i]);
			}
		}
		Collections.sort(result);
		System.out.println(result);
	}

}
