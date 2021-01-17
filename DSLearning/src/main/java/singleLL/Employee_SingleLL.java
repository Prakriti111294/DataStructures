package singleLL;

public class Employee_SingleLL {

	private EmployeeNode head;
	
	//Default value of size will be 0
	private int size;

	public void addToFront(Employee employee) {
		
		EmployeeNode node=new EmployeeNode(employee);
		
		node.setNext(head);
		
		head=node;
		
		size++;
	}
	
	public int getSize() {
		return size;
	}
	
	public Boolean isEmpty() {
		
		if(head==null) {
			return true;
		}
		else
			return false;
	}
	
	public void printList() {
		
		EmployeeNode current=head;
		
		System.out.print("Head -->");
		while(current!=null) {
			
			System.out.println(current);
			
			System.out.print("-->");
			
			current = current.getNext();
			
		}
		
		System.out.println("null");
	}
	
	public EmployeeNode removeFromFront() {
		
		EmployeeNode removeNode=head;
		head=head.getNext();
		removeNode.setNext(null);
		
		size--;
		
		return removeNode;
	}
}
