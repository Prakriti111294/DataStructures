package BinarySearchAlgo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,2,3,4,5,6} ;
		System.out.println(search(a, 5));

	}
	
	public static int search(int a[], int num) {
		int low = 0;
		int high = a.length-1;
		int mid = low + (high - low)/2 ;
		while (low<=high) {
			if (num==a[mid]) return mid ;
			
			else if (num<a[mid]) {
				high=mid-1;
				mid=low + (high - low)/2 ;
			}
			
			else {
				low=mid+1;
				mid=low + (high - low)/2 ;
			}
		}
		return -1;
		
		
	}

}
