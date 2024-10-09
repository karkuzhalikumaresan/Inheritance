package org.ini;

//Child 1
public class StudentDetails extends EmployeeDetails
{

	public void m3() {
		System.out.println("Method 3");

	}
	
	public static void main(String[] args) {
		
		StudentDetails s = new StudentDetails();
		
		s.m1();
		s.m2();
		s.m3();
		
		
	}

}
