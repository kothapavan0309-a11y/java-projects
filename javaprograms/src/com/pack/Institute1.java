package com. pack;

public class Institute1 {

//	Declaration
//	Static variable 
	static String Trainer1;
	static String Trainer2;
//	Instance variable
	int employeeId;
	String employeename;
	String employeedesignation;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Initialization
		Trainer1 = "Koushik";
		Trainer2 = "Ravindra";
//		Access the static data
		System.out.println("Trainer1:" + Trainer1);
		System.out.println("Trainer2:" + Trainer2);

//		Access the instance data

		Institute1 emp1 = new Institute1();
		emp1.employeeId = 101;
		emp1.employeename = "Hemanth";
		emp1.employeedesignation = "java";
		System.out.println("employeeId:" + emp1.employeeId);
		System.out.println("employeename:" + emp1.employeename);
		System.out.println("employeedesignation:" + emp1.employeedesignation);

//		Access the instance data

		System.out.println("Trainer1:" + Trainer1);
		System.out.println("Trainer2:" + Trainer2);

		Institute1 emp2 = new Institute1();
		emp2.employeeId = 102;
		emp2.employeename = "Balu";
		emp2.employeedesignation = "Sql";
		System.out.println("employeeId:" + emp2.employeeId);
		System.out.println("employeename:" + emp2.employeename);
		System.out.println("employeedesignation:" + emp2.employeedesignation);

//		Access the instance data

		System.out.println("Trainer1:" + Trainer1);
		System.out.println("Trainer2:" + Trainer2);
		Institute1 emp3 = new Institute1();
		emp3.employeeId = 103;
		emp3.employeename = "Pavan";
		emp3.employeedesignation = "Javascript";
		System.out.println("employeeId:" + emp3.employeeId);
		System.out.println("employeename:" + emp3.employeename);
		System.out.println("employeedesignation:" + emp3.employeedesignation);

//		Access the instance data

		System.out.println("Trainer1:" + Trainer1);
		System.out.println("Trainer2:" + Trainer2);
		Institute1 emp4 = new Institute1();
		emp4.employeeId = 104;
		emp4.employeename = "Swamy";
		emp4.employeedesignation = "Springboot";
		System.out.println("employeeId:" + emp4.employeeId);
		System.out.println("employeename:" + emp4.employeename);
		System.out.println("employeedesignation:" + emp4.employeedesignation);

//		Access the instance data

		System.out.println("Trainer1:" + Trainer1);
		System.out.println("Trainer2:" + Trainer2);
		Institute1 emp5 = new Institute1();
		emp5.employeeId = 105;
		emp5.employeename = "Garapati";
		emp5.employeedesignation = "Ai";
		System.out.println("employeeId:" + emp5.employeeId);
		System.out.println("employeename:" + emp5.employeename);
		System.out.println("employeedesignation:" + emp5.employeedesignation);

	}

}
