package doubleLL;

public class Main {

	public static void main(String[] args) {

		Employee_DLL linkedList = new Employee_DLL();
		
		for(int i=1; i<6; i++) {
			linkedList.addToFront(new Employee("First"+i, "Last"+i, i));
		}
		
		/* linkedList.printList(); */
		
		linkedList.addToFront(new Employee("pretty", "insaan",111294));
		
		linkedList.addToEnd(new Employee("lalloo", "insaan",24));
		
		/* linkedList.printList(); */
		
		linkedList.removeFromFront();
		
		/* linkedList.printList(); */
		

		linkedList.removeFromEnd();
		
		/* linkedList.printList(); */
		
		linkedList.removeFromBetween(new Employee("First2", "Last2", 2));
		
		linkedList.printList();
		
	}
}
