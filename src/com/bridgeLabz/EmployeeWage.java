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
		// TODO Auto-generated method stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Random random = new Random();
		int attendance = random.nextInt(2); 
		int wagePerHour = 20;
		int fullDayHour = 8;
		int wage = wagePerHour*fullDayHour;
		if(attendance==1) {
			System.out.println("Employee is Present");
			System.out.println("Employee Wage is:"+wage);
		}
		else {
			System.out.println("Employee is absent");
		}
	}

}
