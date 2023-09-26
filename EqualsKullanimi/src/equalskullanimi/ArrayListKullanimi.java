package equalskullanimi;

import java.util.ArrayList;

public class ArrayListKullanimi {

    public static void main(String[] args) {
        
        /*Telefon telefonlar[] = new Telefon[20];
        Telefon t1 = new Telefon("MI 8", 3000);
        Telefon t2 = new  Telefon("Mate 10 Pro", 4500);
        Telefon t3 = new Telefon("Iphone X", 7000);
        
        telefonlar[0] = t1;
        telefonlar[1] = t2;
        telefonlar[2] = t3;*/
        
        // dizide ne kadar alan gerektıgını bılmıyorsak ısek ArrayLıst ler kullanılır
        
        ArrayList<Telefon> telefonlar = new ArrayList<>(); //< > arasında ne tur verı saklanacagı yazılır bu ornek ıcın Telefon turunde verı saklanacagı soylenmıs
        Telefon t1 = new Telefon("MI 8", 3000);
        Telefon t2 = new  Telefon("Mate 10 Pro", 4500);
        Telefon t3 = new Telefon("Iphone X", 7000);
        
        telefonlar.add(t1);
        telefonlar.add(t2);
        telefonlar.add(t3);
      
        listeyiYazdir(telefonlar);
        
        telefonlar.add(t1);
        telefonlar.add(0,t3);//0. indise t3 degeri atanir
        System.out.println("Degisikliklerden sonra");
        telefonlar.set(3, t1);//direkt olarak uzerine yazma islemi yapilir
        telefonlar.remove(t2);// t2 yi kaldirir
        telefonlar.remove(0); // 0. indisteki degeri kaldirir
        listeyiYazdir(telefonlar);
        System.out.println(telefonlar.contains(t3));// telefonlar t3 u ıcerıyor mu (true/false)
        System.out.println(telefonlar.contains(t1));
        
    /*    telefonlar.add(t1); // arraylist olusturuldugunda bostur add meetodu ile t1 i buna ekledık
       // telefonlar.add(10,t2); //indisi gore de ekleme yapılabilir burada 10. indise t2 degeri atancaktır ancak burada da soyle bır sıkıntı cıkar arraylistte suan iicn yalnızca 1 veri kayıtlı o da t1 dir yani dizide 10. indis henuz yok bu sebeple hata alırız
        telefonlar.add(0,t2); // 0. indise t2 atanir t1 ise bir yanina kaydırılır yanı 1. indiste
       telefonlar.remove(0);//0. indisteki elemani sil
       telefonlar.remove(t3);// t3 elemanini sil */
        System.out.println(telefonlar.size()); // dizide kac tane eleman oldugunu gosterir*/
    
    }
    public static void listeyiYazdir(ArrayList<Telefon> liste){
      /*for(int i = 0;i<liste.size();i++){ // normal for
           System.out.println(liste.get(i));
       }*/
     
        //gelismis for ile yapılırken nesnenin turu yazılır yani telefonlar nesnesinin turunu Telefon olarak belırledık burada toString metodu cagirildi
       for(Telefon oankiDeger: liste){
            System.out.println(oankiDeger);
        }
    }
        }

class Telefon {

    String model;
    int fiyat;

    public Telefon(String model, int fiyat) {
        this.model = model;
        this.fiyat = fiyat;
    }

@Override
public String toString(){
    return "Telefon{" + "model:=" + model +",fiyat:="  + fiyat  + "}";
}
    

}
