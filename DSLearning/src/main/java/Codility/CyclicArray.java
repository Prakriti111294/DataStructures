package Codility;

public class CyclicArray {

	public static void main(String[] args) {
		
		int[] a = new int[] {3, 8, 9, 7, 6} ;
		
		int k = 3 ;
		
		CyclicArray t = new CyclicArray() ;
		t.test(a, k);

	}
	
	public void test (int[] A  , int K) {
		
		//rule (learn code )
		reverse(A , 0 , A.length-1) ;
		reverse(A, 0, K-1);
		reverse(A , K , A.length-1) ;
		
		for (int i : A) {
			System.out.print(i + " ");
		}
		
		
	}
	
	public void reverse(int[] A , int start , int end) {
		while(start < end) {
			int temp = A[start] ;
			A[start] = A[end] ;
			A[end] = temp ;
			start++ ;
			end-- ;
		}
	}

}
