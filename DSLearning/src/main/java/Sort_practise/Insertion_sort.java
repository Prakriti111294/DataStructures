package Sort_practise;

public class Insertion_sort {

	public static void main(String[] args) {
		int a[]=new int[] {5,4,1,2,8};
		// 4 5 1 2
		
		a=sort(a);
		
		for (int i : a) {
			System.out.print(i);
		}

	}
	
	// 0 to i-1 sorted
	// i to a.length unsorted
	//pick one element from unsorted side each time
	//And place it corrected in sorted part
	
	public static int[] sort(int a[]) {
		
		int temp = -1;
		
		for (int i=1 ; i<a.length ;i++) {
			temp = a[i];
			int j=i-1 ;
			
			while ( j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				a[j]=temp;
				j--;
			}		
		}
		return a;
	}

}
