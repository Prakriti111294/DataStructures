package List;

import java.util.ArrayList;
import java.util.List;

public class Employee_Main_ArrayList {

	public static void main(String[] args) {

		List<Employee> employeeList=new ArrayList<Employee>();
		
		for(int i=0; i<4; i++) {
			employeeList.add(new Employee("First"+i,"Last"+i,i));
		}
		
		//Alternative of forEach loop
		//employee is the variable which is representing elements of employeeList- the objects 
		/*
		 * employeeList.forEach(employee -> System.out.println(employee));
		 * 
		 * //Tp get 2nd element of the list System.out.println(employeeList.get(1));
		 * 
		 * employeeList.set(1, new Employee("Bewafaa", "ladka", 234));
		 * 
		 * System.out.println(employeeList.get(1));
		 */
		
		//To convert List into Array
		Employee[] emp_Array = employeeList.toArray(new Employee[employeeList.size()]);
		
		for (Employee employee2 : emp_Array) {
			
			System.out.println(employee2);
			
		}
		
		//Due to overriding .equals method and hashCode method in Employee class, we will get true
		System.out.println(employeeList.contains(new Employee("First1","Last1",1)));
		//Due to overriding .equals method and hashCode method in Employee class
		System.out.println(employeeList.indexOf(new Employee("First0","Last0",0)));
		
		employeeList.remove(2);
		
		

	}

}
