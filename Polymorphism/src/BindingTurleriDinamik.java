public class BindingTurleriDinamik {
    
public static void main(String[] args) {
  
    UstSİnif ustSİnif = new UstSİnif();
    ustSİnif.adiniSoylee();
    
    AltSinif altSinif = new AltSinif();
    altSinif.adiniSoylee();
    
    UstSİnif ustSİnif1 = new AltSinif();
    ustSİnif1.adiniSoylee();// burada alt sinif classı cagırılır dinamik baglama budur // alt siniftaki metotu cagırdı
    
}
    
}
class UstSİnif{
    public static void adiniSoyle(){
        System.out.println("Ust sınıfın static adini soyle metodu cagirildi");
    }
    public void adiniSoylee(){
        System.out.println("Ust sinifin adini soyle metotu cagirildi");
        
    }
}
class AltSinif extends UstSİnif{
    public static void adiniSoyleStatic(){
            System.out.println("Alt sinifin static adini soyle metotu cagirildi");
    }

    @Override
    public void adiniSoylee() { // static metot olmadıgı ıcın ve ust sınıfta oldugu ıcın bu metot cagıırlabılfı
        System.out.println("Alt snifin adini soyle metotu cagirildi");
    }
    
}
        
