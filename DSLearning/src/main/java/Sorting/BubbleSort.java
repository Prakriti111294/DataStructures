package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]=new int[7];

		arr[0]=-1;
		arr[1]=3;
		arr[2]=9;
		arr[3]=-8;
		arr[4]=22;
		arr[5]=0;
		arr[6]=-33;
		
		for (int i = 0; i< arr.length; i++) {
			
			for(int j=0; j<arr.length-1; j++) {
				int temp=-1;
				
				if(arr[j]>arr[j+1]) {
					
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for (int k =0; k<arr.length;k++) {
			System.out.println(arr[k]);
		}
		
		
		

	}

}
