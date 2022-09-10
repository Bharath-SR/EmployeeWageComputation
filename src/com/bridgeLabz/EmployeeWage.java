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
		

		Random random = new Random();
		int attendance = random.nextInt(3); 
		int wagePerHour = 20;
		int fullDayHour = 8;
		int partTime =4;
		int wage = wagePerHour*fullDayHour;
		int partTimeWage= wagePerHour*partTime;
		

		switch(attendance) {
		case 1:
			System.out.println("Employee is Present");
			System.out.println("Employee Wage is:"+wage);
			break;
		case 2:
			System.out.println("Employee is Present Part Time");
			System.out.println("Part Time  Employee Wage is:"+partTimeWage);
		default:
			System.out.println("Employee is absent");
			
		}
	}

}
