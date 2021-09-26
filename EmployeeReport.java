package com.bridgelabz.empreport;

import java.util.Random;

public class EmployeeReport {

	int wageperhr = 20;
	int dailyhrs = 8;
	int partTimeHours = 4;
	int fullTimeHours = 8;
	int fullTimeWage;
	int partTimeWage;
	int dailywage;

	void Welcome() {
		System.out.println("Welcome to Employee Wage Computation Programme");
	}

	void employeeAttendance() {

		Random ran = new Random();
		int empCheck = ran.nextInt(2);

		System.out.println(empCheck);

		if (empCheck == 0) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
	}

	void dailyWage() {

		dailywage = wageperhr * dailyhrs;
		System.out.println("Employee Daily wage = " + dailywage);
	}

	public void empFullAndPartTimeWage() {
		
		fullTimeWage = wageperhr * dailyhrs;
		System.out.println("Employee Full Time Wage :"+ fullTimeWage);
		
	    partTimeWage = wageperhr * partTimeHours;
	    System.out.println("Employee Part Time Wage :"+ partTimeWage);
	}

	public static void main(String[] args) {
		EmployeeReport obj = new EmployeeReport();
		obj.Welcome();
		
		obj.employeeAttendance();
		
		obj.dailyWage();
		
		obj.empFullAndPartTimeWage();
	}

}
