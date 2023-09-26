package javaapplication20;

public class StaticKavrami {
    
    public static void main(String[] args) { //burası psvm e sahıp olmalı ki Memur dan bır nesen uretılebılsın
        
        Memur m1 = new Memur();
        m1.setIsim("emre");
        m1.setMaas(5000);
        
        Memur m2 = new Memur();
        m2.setIsim("Hasan");
        m2.setMaas(4500);
        
        Memur m3 = new Memur();
        m3.setIsim("Hasan");
        m3.setMaas(4500);

        m3.bilgileriGoster();
   /*     System.out.println("Nesne Sayisi: " + m1.olusturulanMemurNesnesi);
        System.out.println("Nesne Sayisi: " + m2.olusturulanMemurNesnesi);
        System.out.println("Nesne Sayisi: " + m3.olusturulanMemurNesnesi);
        System.out.println("Nesne Sayisi Sinif: " + Memur.olusturulanMemurNesnesi);
       */ 
    }}

class Memur {
    private String isim;
    private int maas;
    private static int olusturulanMemurNesnesi; //nesneye baglı degıl de sınıf degıskenı yapmak ıcın static anahtar kelımesı kullandık
 
    public Memur(){
         olusturulanMemurNesnesi ++;
    }
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
 
    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        if (maas< 0){
            maas = 0;
        }
        else {
            this.maas = maas;
        }
        this.maas = maas;
    }
    public void bilgileriGoster(){
        System.out.println("Olusturulan Memur Nesnesi: " + olusturulanMemurNesnesi);
    }
}
