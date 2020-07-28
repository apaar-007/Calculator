package com.tranining.ui;

import com.tranining.beans.Maths;
import com.tranining.utils.ReadUtils;

public class CalculatorUi {
	Maths mymaths;

	public CalculatorUi() {// push
		mymaths = new Maths();
	}

	public String mainMenu() { // push
		return "Main Menu\n1. Add\n2. Multiply\n3. Divide\n4. Martix";
	}

	public void processCalculator() { // push
		System.out.println(mainMenu());
		int num1 = 0;
		int num2 = 0;
		int opt = ReadUtils.readInteger("Please enter your choice from Main Menu.");// singleton
		switch (opt) {
		case 1:
			num1 = ReadUtils.readInteger("Please enter first number for addition");
			num2 = ReadUtils.readInteger("Please enter second number for addition");
			int sum = mymaths.add(num1, num2);
			System.out.println("the sum is" + sum);
			break;
		case 2:

			num1 = ReadUtils.readInteger("Please enter first number for addition");
			num2 = ReadUtils.readInteger("Please enter second number for addition");
			int prod = mymaths.multiply(num1, num2);
			System.out.println("the sum is" + prod);
			break;
		case 3:

			float num1f = ReadUtils.readInteger("Please enter first number for addition");
			float num2f = ReadUtils.readInteger("Please enter second number for addition");
			float div = mymaths.divide(num1, num2);
			System.out.println("the sum is" + div);
			break;
		case 4:
			int rows = ReadUtils.readInteger("Please enter firstmatirx Rows Length.");
			int cols = ReadUtils.readInteger("Please enter firstmatirx Cols Length.");
			int arr[][] = new int[rows][cols]; // { { 1, 2 }, { 3, 4 } }; // TRIKA 1
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {						
						arr[i][j]= ReadUtils.readInteger("Please Enter for arr1["+i+", "+j+"]-->Location");
				}				
			}
			
			int arr2[][] = new int[rows][cols]; // Tarika 2
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {						
						arr2[i][j]= ReadUtils.readInteger("Please Enter for arr1["+i+", "+j+"]-->Location");
				}				
			}
			
			int summatrix[][]= mymaths.add(arr, arr2);
			
			for (int i = 0; i < summatrix.length; i++) {
				for (int j = 0; j < summatrix[0].length; j++) {
					System.out.print(summatrix [i][j] + "\t");
				}
				System.out.println();
			}
			break;
		default:
			System.out.println("You have requested the unavaliable servervice");
			break;
		}
	}
}
