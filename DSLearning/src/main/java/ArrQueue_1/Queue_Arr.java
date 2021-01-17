package ArrQueue_1;

import java.util.NoSuchElementException;

public class Queue_Arr { 

	private Employee[] queue ;
	private int front ;
	private int back ;
	
	public Queue_Arr(int capacity) {
		queue = new Employee[capacity] ;
		
	}
	
	public void add(Employee emp) {
		
		if(back == queue.length) {
			Employee[] newArr =new Employee[2*queue.length] ;
			System.arraycopy(queue, 0, newArr, 0, queue.length);
			queue = newArr ;
		}
		queue[back++] = emp ;
		
	}
	
	public Employee remove() {
		if(front==back) {
			throw new NoSuchElementException();
		}
		Employee e = queue[front] ;
		queue[front] = null;
		front++ ;
		return e;
	}
	
	public Employee peek () {
		if(back==0) {
			throw new NoSuchElementException();
		}
		return queue[back-1] ;
		
	}
	
	public int size() {
		return back-front ;
	}
	
	public void print() {
		for (int i = front ; i<back ; i++) {
			System.out.println(queue[i]);
		}
	}
}
