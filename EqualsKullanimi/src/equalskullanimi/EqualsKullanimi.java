package equalskullanimi;

import java.util.Objects;

public class EqualsKullanimi {
    
    //equals: ıkı tane nesneyı bırbırıyle kıyaslamaya yarar

    public static void main(String[] args) {
        Kisi k1 = new Kisi(5,"Merve");
        System.out.println(k1);
        
        Kisi k2 = new Kisi(5,"Merve");
        System.out.println(k2);
        
        System.out.println("k1 ve k2 esit mi: " + k1.equals(k2));
        System.out.println("k1 in hascode: " + k1.hashCode() + " k2 nin hashcode: " + k2.hashCode());
        
        /*k1 = k2; // burada referanslar esıtlendı
        Calisan calisan = new Calisan(5, "merve");
        System.out.println("k1 ve k2 esit mi: " + k1.equals(calisan));*/
    }
}
class Kisi{ // extends Object: buradaki gizli sınıf ve toStirng metodu burada vardır
    int id;
    String isim;

    public Kisi(int id, String isim){
        this.id = id;
        this.isim = isim;
    }
    @Override
    public String toString() {
        return "id:"+id+" isim:"+isim;//toString varsa bir ust sınıf var bu sınıfta da tostring dıye bır metot var ve kisi sınıfı(alt sınıf) isterse bunu override edebilir
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.id;
        hash = 17 * hash + Objects.hashCode(this.isim);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // this: k1 i calıstıran parametre yanı k1 esit esit mi parametre olarak gelen o ya yanı k2 ye yanı k1=k2; durumu
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Kisi other = (Kisi) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.isim, other.isim);
    }
    
}
class Calisan {
    int id;
    String isim;
    
    public Calisan(int id,String isim){
        this.id = id;
        this.isim = isim;
    }
    
    
    
}
