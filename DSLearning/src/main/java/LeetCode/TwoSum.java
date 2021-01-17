package LeetCode;

import java.util.Hashtable;
import java.util.List;

public class TwoSum {
	
	public static int[] sum(int[] a ,int target) {
		
		Hashtable<Integer , List<Integer>> table=new Hashtable<Integer , List<Integer>>() ;
		int i=0 ;
		int[] resultArr = new int[2] ;
		
		for (int num : a) {
			table.put(num, i++) ;
		}
		
		
		for (int num : a) {
			
			if (table.containsKey(num) && table.containsKey(target-num) && table.get(num)!=table.get(target-num)) {
				resultArr[0] = table.get(num) ;
				resultArr[1] = table.get(target-num) ;
				System.out.println(resultArr[1]);
			}
		}
		return resultArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,3} ;
		//System.out.println(sum(a , 5)) ;
		int[] r = sum(a, 6);
		System.out.println(r[0] + " , " + r[1]);
		
	}

}
