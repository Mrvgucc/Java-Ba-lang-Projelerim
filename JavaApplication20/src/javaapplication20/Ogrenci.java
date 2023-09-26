package javaapplication20;

public class Ogrenci {
private int ogrenciNo;
private String isim;
private int sinif;
private boolean aktif;

public Ogrenci(){ // java degerleri default olarak atar
   
}
public void Ogrenci(int ogrenciNo, String isim){
    this.ogrenciNo = ogrenciNo;
    this.isim = isim;
}


public void ogrenciBilgileriniYazdır(){
    if (aktif){
        System.out.println("Adim: " + isim);
        System.out.println("Numaram: " + ogrenciNo);
        System.out.println("Sinifim: " + sinif);
    }
    else {
        System.out.println("Bu Ogrenci Aktif Degil!");
    }
}


    
}
