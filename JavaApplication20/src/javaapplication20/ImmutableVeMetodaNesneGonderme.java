package javaapplication20;

public class ImmutableVeMetodaNesneGonderme {
    
    public static void main(String[] args) {
       // String[] ureticiFirmalari = {"HP " +"Fujitsu " + "Dell"};
       Bilgisayar b1 = new Bilgisayar(8,16,new String[] {"HP " ,"Fujitsu " , "Dell"});
        bilgisayarYazdir(b1);
        
        String[] ureticiler = b1.getUreticiFirmalar();
        ureticiler[0] = "Apple";
         
        bilgisayarYazdir(b1);
       
       
    }
    public static void bilgisayarYazdir(Bilgisayar yazdiralacakBilgisayar){
        System.out.println("Cekirdek Sayisi: " +yazdiralacakBilgisayar.getCekirdekSayisi() +
        " Ram Boyutu: " + yazdiralacakBilgisayar.getRamBoyutu() +
                " Uretici Firmalar: " + yazdiralacakBilgisayar.getUreticiFirmalar()[0]);
    }
}

class Bilgisayar{
   private int cekirdekSayisi;
   private int ramBoyutu;
   private String[] ureticiFirmalar;
   
   public Bilgisayar(int csayisi,int ramBoyutu, String[] ureticiFirmalar){
       this.cekirdekSayisi = csayisi;
       this.ramBoyutu = ramBoyutu;
       this.ureticiFirmalar = ureticiFirmalar;
   
   }
    public int getCekirdekSayisi() {
        return cekirdekSayisi;
    }

    
    public int getRamBoyutu() {
        return ramBoyutu;
    }

     
    public String[] getUreticiFirmalar() {
        
        String[] kopyaFirmaIsimleri = new String[ureticiFirmalar.length];
        
         for (int i= 0 ; i<kopyaFirmaIsimleri.length; i++ ) {
             kopyaFirmaIsimleri[i] = ureticiFirmalar[i];
                     
         }
        return kopyaFirmaIsimleri;
    }

    
}
        


