package com.java;

import java.util.Scanner;

public class mysample02 {

	public static void main(String[] args) {
		//Ara� Kilometre bas�na kac kurus yakt�g�n� hesaplayan program
		Scanner input = new Scanner(System.in);
		System.out.println("Arac�n�z kilometre ka� kuru� yak�yor? (�rnek:0,32)");
		double kurus=input.nextDouble();
		System.out.println("Arac�n�zla ka� kilometre gittiniz?");
		int km =input.nextInt();
		System.out.println("Toplam �demeniz gereken tutar : "+ (kurus*km)+"Tl dir");
	}

}
