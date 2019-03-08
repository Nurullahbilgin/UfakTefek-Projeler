package com.java;

import java.util.Scanner;

public class mysample03 {

	public static void main(String[] args) {
		//deðiþkenler arasý geçiþler
		Scanner input = new Scanner(System.in);
		
		int  birinci_sayi;
		int ikinci_sayi;
		System.out.print("Birinci sayi :");
		birinci_sayi = input.nextInt();
		System.out.print("ikinci sayi");
		ikinci_sayi = input.nextInt();
		System.out.println("deðiþtirilmeden önce : birinci sayi"+birinci_sayi+"ikinci sayi"+ikinci_sayi);
		int gecis=birinci_sayi;
		birinci_sayi=ikinci_sayi;
		ikinci_sayi=gecis;
		System.out.println("deðiþtirildikten sonra : birinci sayi: "+birinci_sayi+"ikinci sayi:"+ikinci_sayi);
		
	}

}
