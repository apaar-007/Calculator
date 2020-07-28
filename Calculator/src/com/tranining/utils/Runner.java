package com.tranining.utils;

import com.tranining.beans.Maths;
import com.tranining.ui.CalculatorUi;

public class Runner {

	public static void main(String[] args) {// push
//		int arr[][] = new int[][] { { 1, 2, 5 }, { 3, 4, 5 }, { 3, 4, 5 } };
//
//		
//		System.out.println("Rows : " +sum.length+"\tCOls : "+sum[0].length);
		while (ReadUtils
				.readString(
						"Its a great calculator, dou you want to proceed ? press[P] to proceed any key to exit...... ")
				.equals("P")) {
			new CalculatorUi().processCalculator();
		} // pop

		System.out.println("Exiting ..........");
	}

}

//Maths mymaths = new Maths();
//// int sum = mymaths.add(10,1,20,30,40);
//int num1 = ReadUtils.readInteger("Please enter first number for addition");
//int num2 = ReadUtils.readInteger("Please enter second number for addition");
//int sum = mymaths.add(num1, num2);
//System.out.println("the sum is" + sum);
//
//Maths mymaths1 = new Maths();
//
//int num3 = ReadUtils.readInteger("Please enter fist number for multiplication");
//int num4 = ReadUtils.readInteger("Please enter second");
//int multi = mymaths1.multiply(num3, num4);
//System.out.println("the multiplication is" + multi);
//
//Maths mymaths2 = new Maths();
//
//float num5 = ReadUtils.readFloat("Please enter fist number to divide");
//float num6 = ReadUtils.readFloat("Please enter second");
//float divid = mymaths2.divide(num5, num6);
//System.out.println("the remainder is" + divid);
