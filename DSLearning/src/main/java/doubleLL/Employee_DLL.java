package doubleLL;

public class Employee_DLL {
	
	private EmployeeNode head;
	private EmployeeNode tail;
	private int size;

	public void addToFront(Employee employee) {
		
		EmployeeNode node=new EmployeeNode(employee);
		
		node.setNext(head);
		
		if(head==null) {
			tail=node;
		}
		
		else {
			head.setPrevious(node);
		}
		
		head=node;
		size++;
	}
	
	public int getSize() {
		return size;
	}
	
	public void addToEnd(Employee employee){
		
		EmployeeNode  node=new EmployeeNode(employee);
		
		if(tail==null) {
			head=node;
		}
		else {
			tail.setNext(node);
		}
		node.setPrevious(tail);
		tail=node;
	}
	
	public EmployeeNode removeFromFront() {
		
		EmployeeNode removeNode=head;
		
		if(head.getNext()==null) {
			
			tail=null;
		}
		
		else {
			head.getNext().setPrevious(null);
		}
		
		head=head.getNext();
		removeNode.setNext(null);
		size--;
		return removeNode;
	}
	
	public EmployeeNode removeFromEnd() {
		
		EmployeeNode lastNode=tail;
		if(tail.getPrevious()==null) {
			head=null;
		}
		else {
			tail.getPrevious().setNext(null);
		}
		lastNode.setPrevious(null);
		tail=tail.getPrevious();
		return lastNode;
	}
	
	public void removeFromBetween(Employee employeeToBeRemoved) {
		EmployeeNode temp=head;
		while(temp!=null) {
			
			if(temp.getEmp().equals(employeeToBeRemoved)) {
				EmployeeNode removedNode = temp;
				temp.getPrevious().setNext(temp.getNext());
				temp.getNext().setPrevious(temp.getPrevious());
				removedNode.setNext(null);
				removedNode.setPrevious(null);
			}
			temp = temp.getNext();
		}
		
	}
	public void printList() {
		
		EmployeeNode current=head;
		
		System.out.print("Head -->");
		while(current!=null) {
			
			System.out.println(current);
			
			System.out.print("<==>");
			
			current = current.getNext();
			
		}
		System.out.println("null");
			
		}
	}

