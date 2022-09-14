/**
 * 
 */
package com.bridgeLabz;

import java.util.Random;

/**
 * @author Bharath
 *
 */
public class EmployeeWage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int WagesPerHours = 20;
		final int totalWorkingHrs = 8;
		int dailyWages = 0;
		int partTimeWorkingHrs = 4;
		 int totalWrkDays =20;
		 int totalWages=0;
		 final int maxWorkHrs = 100;
		 int empHrs =0;
		 int wrkdays =0;
		 while (empHrs <= maxWorkHrs &&  wrkdays < totalWrkDays ){
			 wrkdays++;
			 System.out.println("Total Hours"+empHrs);
		int random = (int)(Math.random()*3);
		System.out.println(random);
		
		switch (random) {
		case 1:
			System.out.println("Employee is Present Full Time");
			dailyWages = WagesPerHours*totalWorkingHrs;
			totalWages = totalWages+dailyWages;
			empHrs = empHrs+totalWorkingHrs;
			System.out.println(totalWages);
			break;
		case 2:
			System.out.println("Employee is Present Part Time");
			dailyWages = WagesPerHours*partTimeWorkingHrs;
			System.out.println("PartTimeEmployee Daily Wages"+dailyWages);
			totalWages = totalWages+dailyWages;
			empHrs = empHrs+partTimeWorkingHrs;
			System.out.println(totalWages);
			break;
			
		case 0:
			System.out.println("Employee is Absent");
		}


	}
	
		
	

}
}
