package Codility;

import java.util.HashMap;

public class Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {3, 8, 9, 7, 6} ;
		test(a) ;
	}

	public static void test(int[] A) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>() ;
		int counter = 0;
		if (A.length>0) {
			for (int i : A) {
				if (!map.containsKey(i)) {
					counter++ ;
					map.put(i, 1) ;
				}
			}
		}
		return counter ;
	}
}
