package com.tranining.utils;

import java.util.Scanner;

public class ReadUtils {

	public static String readString(String msg) {
		System.out.println(msg);
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
	
	public static int readInteger(String msg) {
		System.out.println(msg);
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	
	public static float readFloat(String msg) {
		System.out.println(msg);
		Scanner input = new Scanner(System.in);
		return input.nextFloat();
	}
}
