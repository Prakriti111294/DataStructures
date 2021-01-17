package Stack1_LinkedList;

public class Main {

	public static void main(String[] args) {
		
		Linked_Stack obj = new Linked_Stack();
		obj.push(new Employee("Prakriti1" , "Gupta" , 1));
		obj.push(new Employee("Prakriti2" , "Gupta" , 2));
		obj.push(new Employee("Prakriti3" , "Gupta" , 3));
		obj.print();
		
		System.out.println(obj.pop());
		
		System.out.println(obj.peek());
		
		
	}

}
