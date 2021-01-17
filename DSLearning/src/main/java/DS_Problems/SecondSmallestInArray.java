package DS_Problems;

public class SecondSmallestInArray {
	
	static int fun(int[] a) {
		int sec_smallest = a[1] ;
		int smallest = a[0] ;
		
		
		for (int i = 0; i < a.length; i++) {
			
			if (smallest > a[i]   ) {
				sec_smallest = smallest ;
				smallest = a[i] ;
			}
			
			else if (smallest < a[i] && sec_smallest>a[i]) {
			sec_smallest = a[i] ;
			}
		}
		return sec_smallest;
		
	}

	public static void main(String[] args) {
		int[] a= {4,3,1,6,8,2} ;
		System.out.println(fun(a));

	}

}
