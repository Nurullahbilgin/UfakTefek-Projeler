package com.java;

import java.util.Scanner;

public class mysample04 {

	public static void main(String[] args) {
		// hipoten�s
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		System.out.println("birinci kenar girin");
		a = input.nextInt();
		System.out.println("ikinci kenar� girin");
		b=input.nextInt();
		
		double h = Math.sqrt(a*a+b*b);
		System.out.println("Hipoten�s : "+h+"dur");
	}

}
