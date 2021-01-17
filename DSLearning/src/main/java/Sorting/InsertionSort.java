package Sorting;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {-4,8,-7,89,45,-2};
		
		for(int unsortedIndex=1 ; unsortedIndex<arr.length;unsortedIndex++) {
			
			int i;
			int newElement=arr[unsortedIndex];
			
			for (i=unsortedIndex; i>0  && newElement<arr[i-1] ; i--) {
			
				
				arr[i]=arr[i-1];
			}
			
			arr[i]=newElement;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		

	}

}
