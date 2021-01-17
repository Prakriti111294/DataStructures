package Stack1_Array;

public class Main {

	public static void main(String[] args) {
		
		ArrStack objArrStack = new ArrStack(12);
		objArrStack.push(new Employee("Prakriti1" , "Gupta" , 1));
		objArrStack.push(new Employee("Prakriti2" , "Gupta" , 2));
		objArrStack.push(new Employee("Prakriti3" , "Gupta" , 3));
		
		objArrStack.printStack();
		
		System.out.println(objArrStack.pop());
		
		System.out.println(objArrStack.peek());
		
		
		
		

	}

}
