package metotornek;

import java.util.Scanner;

public class MetotOrnek {

    public static void main(String[] args) {

        int kullaniciSecimi = -1; //kullanıcı secımı asla secılemeyecek bır varsayılan degere atandı.

        while (kullaniciSecimi != 0) {
            kullaniciSecimi = menuGoster();
            if (kullaniciSecimi == 0) {
                break;
            }

            Scanner k = new Scanner(System.in);
            System.out.print("Birinci Sayiyi Giriniz: ");
            int birinciSayi = k.nextInt();
            System.out.print("Ikinci Sayiyi Giriniz: ");
            int ikinciSayi = k.nextInt();

            switch (kullaniciSecimi) {
                case 1:
                    System.out.println("Sonuc: " + ikiSayiyiCarp(birinciSayi, ikinciSayi));
                    break;

                case 2:
                    System.out.println("Sonuc: " + ikiSayiyiTopla(birinciSayi, ikinciSayi));
                    break;
                case 3:
                    System.out.println("Sonuc: " + kuvvetiBul(birinciSayi, ikinciSayi));
                    break;
            }

        }
    }

    public static int ikiSayiyiCarp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public static int ikiSayiyiTopla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static int kuvvetiBul(int sayi1, int sayi2) {
     /*   double sonuc = Math.pow(sayi2, sayi2);
        System.out.println("Sonuc: " + sonuc);*/ //Math. kutuphanesınden us alma fonksıyonunun kısayolu

        int sonuç = 1;
        for (int i = 0; i < sayi2; i++) {
            sonuç *= sayi1;

        }
        return sonuç;
    }

    public static int menuGoster() {
        System.out.println("***Menu***\n"
                + "1-Iki Sayinin Carpimini Bul\n"
                + "2-Iki Sayinin Toplamini Bul\n"
                + "3-Iki Sayinin Kuvvetini Bul\n"
                + "Cikmak Icin 0 i Tuslayiniz");

        Scanner k = new Scanner(System.in);
        int secim = k.nextInt();

        return secim;
    }

}
