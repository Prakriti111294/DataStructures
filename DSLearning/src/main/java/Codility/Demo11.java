package Codility;

import java.util.HashSet;
import java.util.Set;

public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set numbers = new HashSet();
		numbers.add(new Integer(45));
		numbers.add(88);
		numbers.add(null);
		numbers.add(789L);
		
		for(Object obj :numbers) {
			System.out.println(obj);
		}
		
	}

}
