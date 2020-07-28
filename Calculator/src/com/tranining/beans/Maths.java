package com.tranining.beans;

public class Maths {
	// 1 2 3 4a 4b 5
	// <access modifier> <returnType> <methood identifier> <()>|| <(int a, int b)>
	// {}
	// <public/private/protected> <all java types like :Date , int String etc> <add>
	// (in t a , int b){return a+b}
	//
	// public int add(int num1, int num2) {
	// return num1 + num2;
	// }
	// // 0 1 2 3 4
	// ----------
	// 1,2,5,4,5
	public int add(int... numbers) {
		// java use initialisation before use principal for local variables, these
		// variables are also called temprary,stack,
		int sum = 0;
		for (int ctr = 0; ctr < numbers.length; ctr++) {
			sum += numbers[ctr];
		}
		return sum;
	}

	public int multiply(int... numbers) {
		int multi = 1;
		for (int i = 0; i < numbers.length; i++) {
			multi = multi * numbers[i];
		}
		return multi;
	}

	public float divide(float num5, float num6) {
		// TODO Auto-generated method stub
		float divid = num5 / num6;
		return divid;
	}

	public int[][] add(int[][] arr, int[][] arr2) {
		int rows = arr.length;
		int cols = arr[0].length;
		
		int sum[][] = new int[rows][cols];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				sum[row][col] = arr[row][col] + arr2[row][col];
			}
		}
		return sum;
	}

}

/*
 * Add similar functionalities as of add(int ...numbers) for sub,multiply,
 * divide once you have created these functions for integers-> then also do for
 * float double long
 */
