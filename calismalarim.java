package comnurullah;

import java.util.Scanner;

public class calismalarim {

	public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);
	int sayi1,sayi2,sonuc,secim;
	System.out.println("1-Toplama \n 2-Cýkarma \n 3-Çarpma \n 4-Bölme");	
	System.out.println("iþleminizi seciniz");
	secim = input.nextInt();
	
	System.out.println("iki tam sayý giriniz");
	sayi1 = input.nextInt();
	sayi2 = input.nextInt();
	
	if(secim ==1)
	{
		sonuc = sayi1+sayi2;
		System.out.println("iþlemin sonucu : "+sonuc);
		
	}
	else if (secim==2)
	{
		sonuc = sayi1-sayi2;
		System.out.println("iþlemin sonucu : "+sonuc);
	}
	else if (secim==3)
	{
		sonuc = sayi1*sayi2;
		System.out.println("iþlemin sonucu : "+sonuc);
	}
	else if (secim==4)
	{
		sonuc = sayi1/sayi2;
		System.out.println("iþlemin sonucu : "+sonuc);
	}
	}
}
