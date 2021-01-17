package doubleLL;

import java.util.Iterator;
import java.util.LinkedList;

public class DLL_JDK {
	
	public static void main(String[] args) {
	
		LinkedList<Employee> list = new LinkedList<Employee>();
		
		for(int i=1; i<6; i++) {
			list.add(new Employee("First"+i, "Last"+i, i));
		}
		
		list.add(new Employee("Bill", "jhonson", 123));
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		list.removeLast();
		
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	

}
