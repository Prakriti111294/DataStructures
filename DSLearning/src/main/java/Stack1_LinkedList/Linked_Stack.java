package Stack1_LinkedList;

import java.util.LinkedList;

public class Linked_Stack {
	
	private LinkedList<Employee> stack ;
	
	public Linked_Stack() {
		stack =  new LinkedList<Employee>();
	}
	
	public void push(Employee emp) {
		stack.push(emp);
	}
	
	public Employee pop() {
		return stack.pop();
		
	}
	
	public Employee peek() {
		return stack.peek();
	}
	
	public void print() {
		for (Employee employee : stack) {
			System.out.println(employee);
		}

}
}
