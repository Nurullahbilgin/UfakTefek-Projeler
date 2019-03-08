package com.java;

import java.util.Scanner;

public class mysample05 {

	public static void main(String[] args) {
		//Geliþmiþ not hesaplama 
		Scanner input =new Scanner(System.in);
		System.out.print("Vize 1 :");
		int vize1=input.nextInt();
		System.out.print("Vize 2 :");
		int vize2=input.nextInt();
		System.out.print("Final :");
		int finalnot=input.nextInt();
		System.out.print("Okul ortalamanýz :");
		double ortalama = input.nextDouble();
		double toplamnot = (vize1 *3 / 10.0) + (vize2*3/10.0)+(finalnot*4/10.0);
		if(toplamnot >=90) System.out.println("AA");
		else if (toplamnot >=85)System.out.println("BA");
		else if (toplamnot >=80)System.out.println("BB ");
		else if (toplamnot >=75)System.out.println("CB");
		else if (toplamnot >=70)System.out.println("CC");
		else if (toplamnot >=65)System.out.println("CD");
		else if(toplamnot >=60) 
		{
			System.out.println("DD");
			if (ortalama <2.50)System.out.print("ve not ortalamanýz düþük. Bu dersi tekrardan almayý düþünebilirsiniz.");
		}
		else if (toplamnot >=55)System.out.println("FD");
		else if (toplamnot >=50)System.out.println("FF aldýn kaldýn canm");
		else
		{
			System.out.println("valla hacým kaldýn yaz okuluna kalmaný tercýh ederým bebeyim :((((((");
		}
		
		
	}

}
