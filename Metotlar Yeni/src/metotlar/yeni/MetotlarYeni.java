package metotlar.yeni;



public class MetotlarYeni {

    public static void main(String[] args) {

      //  menuGoster();
        sayilariTopla(10,15);
        int sayi =5;
        sayiDegistir(sayi);
        System.out.println("Sayının Deegeri: " + sayi);
        
        System.out.println("Sayıların Farkı: " +  sayilarinFarkınıBul(10,6 ));
        
        System.out.println("rastgele sayı: "  + Math.random()); // parametre almayan ve gerıye deger dondurmeyen metod
    }
    
     public static void sayiDegistir(int x){
         x+=10;
         System.out.println("Sayının 10 Fazlası: " + x);
        
    }

    public static void menuGoster() { //parametre almayan ve gerıye deger dondurmeyen metod

        System.out.println("***MENU***\n"
                + "1-İki Sayının Toplamını Bul\n"
                + "2-İki Sayının Farkını Bul\n"
                + "3-İki Sayının Çarpımını Bul\n"
                + "4-İki Sayınını Bolumunu Bul");

    }

    public static void sayilariTopla(int sayi1,int sayi2) { //parametre alan metod ornegı
        System.out.println("Sayıların Toplamı: " + (sayi1+sayi2));
        
    }

    public static int sayilarinFarkınıBul(int i,int i1) { //geriye deger donduren parametreli metod
       // System.out.println("Sayıların Farkı: " + (i-i1));
        return (i-i1);
    }
   

}
