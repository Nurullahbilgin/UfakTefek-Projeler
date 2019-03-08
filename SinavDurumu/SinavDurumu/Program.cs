using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SinavDurumu
{
    class Program
    {
        static void Main(string[] args)
        {
            // 03 - Not Hesabı: yüzlük not sistemine göre 5 lik not karşılığını yazan uygulama

            basla:
            Console.Write("Sınav notunuzu giriniz    : ");
            byte not = byte.Parse(Console.ReadLine());
            byte notdurum = 0;

            if (not >= 0 && not < 25) notdurum = 0;
            else if (not >= 25 && not < 45) notdurum = 1;
            else if (not >= 45 && not < 55) notdurum = 2;
            else if (not >= 55 && not < 70) notdurum = 3;
            else if (not >= 70 && not < 85) notdurum = 4;
            else if (not >= 85 && not <= 100) notdurum = 5;
            else
            {
                Console.WriteLine("Doğru değer Giriniz");
                goto basla;  // basla etiketinin olduğu yere dön.
            }
            Console.WriteLine("Girdiğiniz not olan {0} ' ın 5'lik düzende karşılığı :  {1} 'dir.", not, notdurum);
            goto basla; // basla etiketinin olduğu yere dön

            //  Console.ReadKey();  //herhangi bir tuşa basılıncaya kadar bekle. basa döneceği için buna gerek yok.
        }
    }
}
