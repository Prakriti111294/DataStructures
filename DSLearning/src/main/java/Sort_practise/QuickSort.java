package Sort_practise;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {2,1,5,9,6,2};
		a=quickSort(a ,0,a.length-1);
		
		for (int i : a) {
			System.out.print(i);
		}
	}
	
	
	private static int[] quickSort(int[] a, int lb, int ub) {
		
		if (lb<ub) {
			int sorted_loc=partition(a, lb, ub) ;
			quickSort(a, lb, sorted_loc-1);
			quickSort(a, sorted_loc+1, ub);
			
		}
		return a;
	}


	public static int partition (int a[] ,int lb,int ub) {
		int start = lb;
		int end = ub ;
		int pivot = a[lb] ;
		
		while (start<end) {
			
			while (start<=end && a[start]<=pivot) {
				start++ ;
			}
			
			while(a[end]>pivot && end!=-1) {
				end--;
			}
			if (start < end ){
			//if (a[start]>pivot) {
				//swap(a[start] , a[end]);
				int temp = a[start];
				a[start]=a[end];
				a[end]=temp;
				
			}
		}
		//swap(a[lb],a[end]);
		int temp = a[lb];
		a[lb]=a[end];
		a[end]=temp;
		System.out.print(a[lb]);
		System.out.println(a[end]);
			return end;
				
	}


	/*
	 * private static void swap(int i, int j) { int temp = i; i=j; j=temp;
	 * System.out.print(i); System.out.println(j);
	 * 
	 * }
	 */
}
