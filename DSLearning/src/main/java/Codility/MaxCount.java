package Codility;

public class MaxCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[] {3 ,4 , 4 , 6 , 1 , 4, 4} ;	
		int N = 5 ;
		test (N , A) ;

	}
	
	public static void test(int N , int[] A) {
		
		int[] counters = new int[N] ;
		int max = 0 ;
		
		if (counters.length>0 && A.length>0) {
			for (int a : A) {
				if (a <= counters.length) {
					counters[a-1] = counters[a-1]+1;
					if (max < counters[a-1]) {
						max = counters[a-1] ;
					}
					
				}
				else {
					for (int i = 0; i < counters.length; i++) {
						counters[i] = max ;
					}
				}
			}
			
			return counters ;
			
		}
		
		/*
		 * if (counterArray.length>0 && A.length>0) { for (int i = 1; i <
		 * counterArray.length; i++) {
		 * 
		 * //To inc counter if (A[i-1] <= N) { //To find counter , capture max
		 * counterArray[i-1]=counterArray[i-1]++ ; if (counterArray[i-1]> max) { max =
		 * counterArray[i-1] ; } } else { if (A[i-1] > N){ for (int j = 1; j <=
		 * counterArray.length; j++) { counterArray[j-1] = max; } } } } }
		 */
	}

}
