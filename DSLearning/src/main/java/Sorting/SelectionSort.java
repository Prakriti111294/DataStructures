package Sorting;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] arr = {-4,8,-9};
		
		for(int lastUnsortedIndex=arr.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
			
			int largest_index=0;
			
			for(int j=0;j<lastUnsortedIndex;j++) {
				
				if(arr[largest_index]<arr[j]) {
					
					largest_index=j;
					
				}
				
			}
		
			swap(arr,largest_index,lastUnsortedIndex);
		}
		
		for (int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
		public static void swap(int[] array, int i, int j) {
			 int temp = array[j];
			 array[j] = array[i];
			 array[i] = temp;
		}
	

}
