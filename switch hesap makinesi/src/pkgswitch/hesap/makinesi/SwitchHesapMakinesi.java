
package pkgswitch.hesap.makinesi;

import java.util.Scanner;

public class SwitchHesapMakinesi {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("BİR İSLEM SECİNİZ: ");
        int birinciSayi;
        int ikinciSayi;
        int sonuc;
            String islemler =   ("1. TOPLAMA ISLEMI \n"
                + "2. CIKARMA ISLEMI \n"
                + "3. CARPMA ISLEMI \n"
                + "4. BOLME ISLEMI ");
            System.out.println(islemler);
            islemler = k.nextLine();
        
        switch(islemler){
            case "1":
                System.out.print("Birinci Sayiyi Giriniz:");
                birinciSayi = k.nextInt();
                System.out.print("İkinci Sayiyi Giriniz:");
                ikinciSayi = k.nextInt();
                sonuc = birinciSayi+ikinciSayi;
                System.out.println( sonuc);
                break;
            case "2":
                 System.out.print("Birinci Sayiyi Giriniz:");
                birinciSayi = k.nextInt();
                System.out.print("İkinci Sayiyi Giriniz:");
                ikinciSayi = k.nextInt();
                sonuc = birinciSayi-ikinciSayi;
                System.out.println( sonuc);
                break;
            case "3":
                System.out.print("Birinci Sayiyi Giriniz:");
                birinciSayi = k.nextInt();
                System.out.print("İkinci Sayiyi Giriniz:");
                ikinciSayi = k.nextInt();
                sonuc = birinciSayi*ikinciSayi;
                System.out.println( sonuc);
                break;
            case "4":
                 System.out.print("Birinci Sayiyi Giriniz:");
                birinciSayi = k.nextInt();
                System.out.print("İkinci Sayiyi Giriniz:");
                ikinciSayi = k.nextInt();
                //sonuc = (double)birinciSayi/ikinciSayi;
                System.out.println( "Sonuc:" +( double)birinciSayi/ikinciSayi);
                break;
    }
    
}
}
