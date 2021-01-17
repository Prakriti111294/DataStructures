package ArrQueue_1;

public class Main {

	public static void main(String[] args) {
		
		Queue_Arr obj = new Queue_Arr(10) ;
		
		obj.add(new Employee("P1", "L1", 1));
		obj.add(new Employee("P2", "L2", 2));
		obj.add(new Employee("P3", "L3", 3));
		obj.add(new Employee("P4", "L4", 4));
		obj.add(new Employee("P5", "L5", 5));
		
		//obj.print();
		
		System.out.println(obj.remove());
		System.out.println(obj.remove());
		System.out.println(obj.peek());

	}

}
