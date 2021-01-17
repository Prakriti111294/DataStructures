package singleLL;

public class EmployeeNode {

	private Employee employee;
	private EmployeeNode next;
	
	
	@Override
	public String toString() {
		return "EmployeeNode [employee=" + employee + "]";
	}
	public EmployeeNode(Employee employee) {
		
		this.employee = employee;
		//As next is not being initialized, its default value will be null
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public EmployeeNode getNext() {
		return next;
	}
	public void setNext(EmployeeNode next) {
		this.next = next;
	}
	
}
