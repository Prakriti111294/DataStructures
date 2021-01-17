package Codility;

public class Cl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(new int[] {3,-4,2,-1,-3,2,1}) ;

	}
	
	public static void test(int[] a) {
		
		if (a.length==1) {
			System.out.println("Only one element thus , eq is :"+ a[0]);
		}
		
		else if (a.length==2) {
			System.out.println("No eq");
		}
		
		else if (a.length==0) {
			System.out.println("Empty array");
		}
		
		else {
			int[] left = new int[a.length] ;
			
			for (int i = 1; i < left.length; i++) {
				
				left[i] = left[i-1] + a[i] ;
				System.out.println(left[i]);
			}
		
			int totalSum = left[left.length-1] ;
			
			for (int i = 1; i < a.length-1; i++) {
				//when i - 1 is pivot
				int rightSum = totalSum - left[i] ;
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
	}

}
