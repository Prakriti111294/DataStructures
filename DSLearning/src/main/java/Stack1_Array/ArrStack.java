package Stack1_Array;

import java.util.EmptyStackException;

public class ArrStack {
	
	private Employee[] stack ;
	private int top ;
	
	public ArrStack(int capacity) {
		this.stack = new Employee[capacity] ;
	}
	
	public void push (Employee emp) {
		
		if (top == stack.length ) {
			
			Employee[] newArr = new Employee[stack.length * 2] ;
			System.arraycopy(stack, 0, newArr, 0, stack.length);
			stack = newArr ;
		}
		stack[top++] = emp ;
	}
	
	//Top points to next free space always
	public boolean isEmpty () {
		return top == 0 ;
	}
	
	public Employee pop () {
		if(isEmpty()) {
			throw new EmptyStackException() ;	
		}
		Employee emp = stack[--top] ;
		stack[top] = null ;
		
		return emp ;
	}
	
	public Employee peek() {
		if (isEmpty()) {
			throw new EmptyStackException() ;
		}
		return stack[top-1] ;
	}
	
	public int size() {
		return top ;
	}
	
	public void printStack() {
		
		System.out.println("Printing stack starting from top");
		for(int i = top-1 ; i>=0 ; i--) {
			System.out.println(stack[i]);
		}
	}

}
