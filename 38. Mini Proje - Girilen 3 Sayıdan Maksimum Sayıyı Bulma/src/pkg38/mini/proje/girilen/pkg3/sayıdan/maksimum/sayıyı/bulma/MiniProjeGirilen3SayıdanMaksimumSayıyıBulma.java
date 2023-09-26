package pkg38.mini.proje.girilen.pkg3.sayıdan.maksimum.sayıyı.bulma;

import java.util.Scanner;

public class MiniProjeGirilen3SayıdanMaksimumSayıyıBulma {

    public static void main(String[] args) {
        // Kullanıcıdan alınan 3 sayıdan en buyuk sayıyı bulma
      Scanner k = new Scanner(System.in);
      int maks = -1;
        System.out.print("1.SAYIYI GIRINIZ: ");
      int a = k.nextInt();
      System.out.print("2.SAYIYI GIRINIZ: ");
      int b = k.nextInt();
      System.out.print("3.SAYIYI GIRINIZ: ");
      int c = k.nextInt();
      
      if ( a >= b && a >= c){
          maks = a;
      }
      if ( b >= a && b >= c){
          maks = a;
      }
      if ( c >= b && c >= a){
          maks = a;
      }
      
        System.out.println("en buyuk sayi: " + maks);

      
    }

}
