package org.emp;

import org.emp.EmployeeDetails;

public class Employee {
	private void empName() {
		System.out.println("Emp Name : SatheesKumar Murugan");
	}
	
	public static void main(String[] args) {
		Employee E = new Employee();
		E.empName();
		EmployeeDetails I = new EmployeeDetails();
		I.empId();
		I.empDob();
		I.empEmail();
		I.empPhone();
		I.empAddress();
	}
}
