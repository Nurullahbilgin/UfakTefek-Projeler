package comnurullah;

import java.util.Scanner;

public class calismalarim03 {

	public static void main(String[] args) {
		int sayi1,sayi2,sonuc=0,secim=0;
		Scanner input = new Scanner (System.in);
		System.out.println("1-Toplama\n 2-C�karma \n 3-�arpma \n 4-B�lme \n 5-��k��");
		
		System.out.println("Menuden b�r �slem sec�n�z : ");
		secim = input.nextInt();
		
		while (secim<0 || secim>5)
		{
			System.out.println("yanl�� bir se�im yapt�n�z");
			System.out.println("1-Toplama\n 2-C�karma \n 3-�arpma \n 4-B�lme \n 5-��k��");
			System.out.println("Menuden b�r �slem sec�n�z : ");
			secim = input.nextInt();
		}
		while(secim!=5)
		{
			System.out.println("iki tam say� giriniz : ");
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
			System.out.println("i�leminizin sonucu : "+sonuc);
			input.nextLine();
			input.nextLine();
			
			System.out.println("1-Toplama\n 2-C�karma \n 3-�arpma \n 4-B�lme \n 5-��k��");
			System.out.println("Menuden b�r �slem sec�n�z");
			secim = input.nextInt();
		}
		System.out.println("Hesap makinesini kulland�g�n�z �c�n tesekkur eder�z ");
	}

}
