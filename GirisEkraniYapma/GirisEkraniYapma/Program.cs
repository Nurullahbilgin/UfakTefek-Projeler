﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GirisEkraniYapma
{
    class Program
    {
        static void Main(string[] args)
        {
            //program başlarken kullanıcı adı ve parola oluşturtalım.
            //parola oluştururken parolanın 2 kez aynı girilmesini sağlayalım
            //parola oluşturulduktan sonra ekrandaki yazılar silinsin kullanıcı girişi kısmı açılsın
            //yukarda oluşturulan kullanıcı adı ve parolanın doğru girilip girilmedği kontrol edilsin
            // kullanıcı adı veya parola yanlış girilirse hata versin. 

            string kullaniciadi, asilparola, parolakontrol;
            Console.WriteLine("Kullanıcı Adı ve Parola Oluşturma Ekranı : ");
            Console.WriteLine("Kullanıcı Adı Giriniz");
            kullaniciadi = Console.ReadLine();
            sifre:
            Console.WriteLine("Şifre Giriniz");
            asilparola = Console.ReadLine();

            if (asilparola.Length < 6)  // string bir değişkenin .Lenght özelliği değişkenin kaç karakter olduğunu gösterir.
            {
                Console.WriteLine("Lütfen Parolanızı 6 karakter giriniz");
                goto sifre;
            }

            Console.WriteLine("Şifreyi Tekrar Giriniz");
            parolakontrol = Console.ReadLine();
            if (asilparola == parolakontrol)
            {
                Console.WriteLine("Kullanıcı adı ve Parola Başarılı Bir Şekilde Oluşturuldu.");
                Console.WriteLine("Sisteme Giriş İçin Herhangi Bir Tuşa Basınız");
                Console.ReadKey();
                goto yeniekran;
            }
            else
            {
                Console.WriteLine("Şifreler Eşleşmiyor");
                goto sifre;
            }

            //yeni giriş ekranı :
            yeniekran:
            Console.Clear();
            Console.WriteLine("Sisteme Giriş Ekranı ");
            Console.WriteLine("Kullanıcı adı giriniz");
            string geciciad = Console.ReadLine();
            Console.WriteLine("Parola giriniz");
            string geciciparola = Console.ReadLine();
            if (geciciad == kullaniciadi && geciciparola == asilparola)
            {
                Console.WriteLine("Giriş Başarılı . Tebrikler");
                Console.Clear();
                Console.WriteLine("Sisteme Giriş Yapıldı. Hoşgeldiniz.");
                Console.ReadKey();
            }
            else
            {
                Console.WriteLine("Kullanıcı adı veya Parola Hatalı !");
                Console.ReadKey();
                goto yeniekran;
            }
            }
    }
}
