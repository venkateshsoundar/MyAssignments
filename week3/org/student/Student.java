package org.student;

import org.department.Department;

public class Student extends Department {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student();		
		
		std.studentId();
		std.studentName();
		std.studentDept();
		
		std.deptName();
		
		std.collegeCode();
		std.collegeName();
		std.collegeRank();

	}

	public void studentName() {
		System.out.println("StudentClass|studentName:Venkatesh");
	}

	

	public void studentDept() {
		System.out.println("StudentClass|studentDept:Mechanical");
	}

	

	public void studentId() {
		System.out.println("StudentClass|studentId:239491");
	}

	
}
