package azkodcokis;

public class KalitimliOrnek {

    public static void main(String[] args) {
        Personel mudur = new Personel("ahmet", 123132123, 55, "mudur");
        System.out.println(mudur);
        
        Ogrenci ogr = new Ogrenci("merve", 12313132, 15, 5656);
        System.out.println(ogr);
    }
}

class Kisi {

    private String isim;
    private long tcNo;
    private int yas;

    public Kisi() {
        isim = "Hneuz atanmamis";
        tcNo = 0;
        yas = 18;
    }

    public Kisi(String isim, long tcNo, int yas) {
        this.isim = isim;
        this.tcNo = tcNo;
        this.yas = yas;

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public long getTcNo() {
        return tcNo;
    }

    public void setTcNo(long tcNo) {
        this.tcNo = tcNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas >= 18) {
            this.yas = yas;
        } else {
            this.yas = 18;
        }
    }

    @Override
    public String toString() {
        return "isim:" + isim + "tc kimlik:" + tcNo + "yas:" + yas;
    }
}

class Personel extends Kisi {

    private String pozisyon;

    public Personel(String isim, long tcNo, int yas, String pozisyon) {
        super(isim, tcNo, yas);
       // setIsim(isim); // bu set metodlarını uzun uzun yazmak yerıne super annahtar kelımesı kullanılarak ıslem kolaylıgı saglanır
       // setTcNo(tcNo);
       // setYas(yas); 
        this.pozisyon = pozisyon;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public void setPozisyon(String pozisyon) {
        this.pozisyon = pozisyon;
    }

    @Override
    public String toString() {
        return "Personel adı:" + getIsim() + " tc kimlik no:" + getTcNo() + " yas:" + getYas() + " pozisyon:" + pozisyon;
    }

} 

class Ogrenci extends Kisi{
    private int ogrenciNo;

    public Ogrenci(String isim, long tcNo, int yas, int ogrenciNo) {
        //setYas(yas);
        //setIsim(isim);
        //setTcNo(tcNo);
        super(isim, tcNo , yas);
        this.ogrenciNo = ogrenciNo;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String toString() {
        return "ogrenci adi:" + getIsim() + "tc kimlik:" +getTcNo() + "yas:"+ getYas()+ "ogrenci no:" + ogrenciNo;
    }
    
}
