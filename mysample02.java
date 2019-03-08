package com.java;

import java.util.Scanner;

public class mysample02 {

	public static void main(String[] args) {
		//Araç Kilometre basýna kac kurus yaktýgýný hesaplayan program
		Scanner input = new Scanner(System.in);
		System.out.println("Aracýnýz kilometre kaç kuruþ yakýyor? (Örnek:0,32)");
		double kurus=input.nextDouble();
		System.out.println("Aracýnýzla kaç kilometre gittiniz?");
		int km =input.nextInt();
		System.out.println("Toplam ödemeniz gereken tutar : "+ (kurus*km)+"Tl dir");
	}

}
