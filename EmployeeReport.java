package com.bridgelabz.empreport;

import java.util.Random;

public class EmployeeReport {

	int wageperhr = 20;
	int dailyhrs = 8;
	int partTimeHours = 4;
	int fullTimeHours = 8;
	int daysPerMonth=20;
	int monthlyWage;
	int fullTimeWage;
	int partTimeWage;
	int dailywage;
	int empHour;

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
	
	public void attendanceBySwitchCase() {
		Random ran = new Random();
		int empCheck= ran.nextInt(3);
		System.out.println("Random Integers: " + empCheck);

		switch (empCheck) {
		case 1:
			empHour = 8;
			System.out.print("Full time Present");
			break;
		case 2:
			empHour = 4;
			System.out.print("Part time Present");
			break;
		case 0:
			empHour = 0;
			System.out.println("Absent");
			break;

		default:
			empHour = 0;
			break;
		}
		System.out.println();
	}
	
	public void monthlyWage() {
	
		 monthlyWage= dailywage * daysPerMonth;
			System.out.println("Monthly Wage Of Employee is ="+monthlyWage);
	}

	public static void main(String[] args) {
		EmployeeReport obj = new EmployeeReport();
		
		obj.Welcome();
		
		obj.employeeAttendance();
		
		obj.dailyWage();
		
		obj.empFullAndPartTimeWage();
		
		obj.attendanceBySwitchCase();
		
		obj.monthlyWage();
	}

}
