package azkodcokis;

import java.net.Socket;


public class kompozisyonOrnegi {
// kompozisyon: var olan bırseyı kullanmak demek mesela bız burada motor classı olusturduk ve araba classı ıcınde de motor class ını cagırdık 
// String sınıfı da kompozisyona gırer cunku String class ı hazır var ve bız bunu kullanıyoruz
    public static void main(String[] args) {
        
        Araba myAraba = new Araba();
        myAraba.hareketeGec();
        myAraba.durdur();
      
    }
    
}

class Motor{
    private String isim;
    private int beygirGucu;
    
    public Motor(){
        isim = "Honda";
        beygirGucu = 135;
        System.out.println(isim + " isimli " + beygirGucu+" beygir güçlü motor olusturuldu.");
    }
    public void motorCalistir(){
        System.out.println("Motor Calısıyor...");
    }
    public void motorDurdur(){
        System.out.println("Motor Durduruldu...");
    }
}
class Araba{
    private Motor arabaMotoru; // kompozisyon yapıldı
    private String renk; // kompozisyon yapıldı
    private String marka; // kompozisyon yapıldı
    private int uretimYili;
    
    

public Araba(){
    arabaMotoru = new Motor();
    renk = "mavi";
    marka = "Toyota";
    uretimYili = 2015;
    System.out.println(renk + " renkli " + marka + " markalı " +uretimYili + " model arac olusturuldu");
}
public void hareketeGec(){
    System.out.println("Araba Harekete Geciyor...");
}
public void durdur(){
    System.out.println("Araba Durduruldu...");
}




}
