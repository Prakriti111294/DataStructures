package Codility;

public class TapeEq {

	public static void main(String[] args) {
		test(new int[] {-1000, 1000}) ;
		
	}
	
	public static void test(int[] A) {
		int[] left = new int[A.length] ;
		left[0] = A[0] ;
		
		for (int i = 1; i < left.length; i++) {
			
			left[i] = left[i-1] + A[i] ;
			System.out.println(left[i]);
		}
		
		int[] right = new int[A.length] ;
		right[A.length-1] = A[A.length-1] ;
		
		for (int j= A.length-2 ; j>=0 ; j-- ) {
			right[j] = right[j+1] + A[j] ;
		}
		
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < right.length-1; i++) {
			
			int sub = Math.abs(left[i] - right[i+1]) ;
			
			if (sub < min) {
				min  = sub ;
			}
		}
		
		System.out.println("the min is :" + min);
		//return min ;
	}

}
