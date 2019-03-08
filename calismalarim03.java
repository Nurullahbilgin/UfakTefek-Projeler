package comnurullah;

import java.util.Scanner;

public class calismalarim03 {

	public static void main(String[] args) {
		int sayi1,sayi2,sonuc=0,secim=0;
		Scanner input = new Scanner (System.in);
		System.out.println("1-Toplama\n 2-Cýkarma \n 3-Çarpma \n 4-Bölme \n 5-Çýkýþ");
		
		System.out.println("Menuden býr ýslem secýnýz : ");
		secim = input.nextInt();
		
		while (secim<0 || secim>5)
		{
			System.out.println("yanlýþ bir seçim yaptýnýz");
			System.out.println("1-Toplama\n 2-Cýkarma \n 3-Çarpma \n 4-Bölme \n 5-Çýkýþ");
			System.out.println("Menuden býr ýslem secýnýz : ");
			secim = input.nextInt();
		}
		while(secim!=5)
		{
			System.out.println("iki tam sayý giriniz : ");
			sayi1= input.nextInt();
			sayi2= input.nextInt();
			
			if(secim ==1)
			{
				sonuc = sayi1+sayi2;
				
			}
			else if (secim ==2)
			{
				sonuc = sayi1-sayi2;
				
			}
			else if (secim ==3)
			{
				sonuc = sayi1*sayi2;
				
			}
			else if (secim ==4)
			{
				sonuc = sayi1/sayi2;
				
			}
			System.out.println("iþleminizin sonucu : "+sonuc);
			input.nextLine();
			input.nextLine();
			
			System.out.println("1-Toplama\n 2-Cýkarma \n 3-Çarpma \n 4-Bölme \n 5-Çýkýþ");
			System.out.println("Menuden býr ýslem secýnýz");
			secim = input.nextInt();
		}
		System.out.println("Hesap makinesini kullandýgýnýz ýcýn tesekkur ederýz ");
	}

}
