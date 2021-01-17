package singleLL;

public class Employee_Main_SingleLinkedList {

	public static void main(String[] args) {
		
		Employee_SingleLL linkedList = new Employee_SingleLL();
		
		
		
		  for(int i=1; i<6;i++) { linkedList.addToFront(new Employee("First"+i,
		  "Last"+i, i)); }
		 
		
		linkedList.printList();
		
		System.out.println("the size is :"+linkedList.getSize());
		
		System.out.println("the removed node is :"+linkedList.removeFromFront());

	}

}
