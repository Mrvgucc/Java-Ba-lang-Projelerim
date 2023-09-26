package azkodcokis;

public class KalitimsizOrnek {
    public static void main(String[] args) {
        // Kalıtım kullanılmayan bır ornegı kalıtımla yapılmıs hale donusturecegız
        Personel mudur = new Personel("ahmet" , 12313212 , -8);
        System.out.println(mudur);
        
        Ogrenci emre = new Ogrenci("emre" , 26 , 12313212 , 8526);
        System.out.println(emre);
    }
}

class Personel{
    private String isim;
    private long tcNo;
    private int yas;
    
    public Personel(){
        isim = "Henuz atanmadi";
        tcNo = 0;
        yas = 18;
    }

    public Personel(String isim, long tcNo, int yas){
        this.isim = isim;
        this.tcNo = tcNo;
        setYas(yas); // dırekt olarak atamaya ızın vermedık boylece -8 gıbı bır deger gırılırse set metoduna ugrayıp dogru bit atmama olacak
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
        if(yas >= 18)
        this.yas = yas;
        else 
            this.yas = 18;
    }

    @Override
    public String toString() {
        return "isim:"  + isim + "tc kimlik:" + tcNo + "yas:" +yas;
    }
    
    
    
}

class Ogrenci{
    
    private String isim;
    private int yas;
    private long tcNo;
    private int okulNo;

    public Ogrenci(String isim, int yas, long tcNo, int okulNo) {
        this.isim = isim;
        setYas(yas);
        this.tcNo = tcNo;
        this.okulNo = okulNo;
    }

    public Ogrenci(){
        isim = "henuz atanmadi";
        tcNo = 0;
        yas = 7;
        okulNo = 5000;
    }
    
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

     public void setYas(int yas) {
        if(yas >= 7)
        this.yas = yas;
        else 
            this.yas = 7;
    }

     public long getTcNo() {
        return tcNo;
    }

    public void setTcNo(long tcNo) {
        this.tcNo = tcNo;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }
    
    @Override
    public String toString() {
        return "isim:"  + isim + " tc kimlik:" + tcNo + " yas:" +yas  + " okulNo:"  + okulNo;
    }
    
}

