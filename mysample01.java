package com.java;

import java.util.Scanner;

public class mysample01 {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	// K�LO ENDEKS� HESAPLAMA
	System.out.println("Kilonuzu girin :");
	int kilo = input.nextInt();
	System.out.println("Boyunuzu girin : ");
	double boy =input.nextDouble();
	
	double bki = kilo/(boy*boy);
	System.out.println("beden k�tle indeksiniz : "+bki);
	
	}
 
}
