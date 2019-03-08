package com.java;

import java.util.Scanner;

public class mysample04 {

	public static void main(String[] args) {
		// hipotenüs
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		System.out.println("birinci kenar girin");
		a = input.nextInt();
		System.out.println("ikinci kenarý girin");
		b=input.nextInt();
		
		double h = Math.sqrt(a*a+b*b);
		System.out.println("Hipotenüs : "+h+"dur");
	}

}
