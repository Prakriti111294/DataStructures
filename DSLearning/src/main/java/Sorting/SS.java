package Sorting;

//Selection Sort
class SS{
	
	public static void main(String[] args) {
		
		int[] arr = {-4,8,-9,35,2,42,-12};
		
		for(int i=0; i<arr.length-1; i++) {
			
			int smallestIdx = i;
			
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[j]<arr[smallestIdx]) {
					smallestIdx = j;
				}
			}
			
			swap(arr,i,smallestIdx);
		}
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public static void swap(int[] array, int i, int j) {
		 int temp = array[j];
		 array[j] = array[i];
		 array[i] = temp;
	}
}