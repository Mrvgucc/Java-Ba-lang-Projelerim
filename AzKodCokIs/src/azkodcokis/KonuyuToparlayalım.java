package azkodcokis;

public class KonuyuToparlayalım {

    public static void main(String[] args) {
        
        Canli canli = new Canli();
        canli.adiniSoyle();
        
        Canli kartal = new Kartal();
        kartal.adiniSoyle();
        ((Kartal)kartal).uc(); // direkt olarak Kartal Sinifini atadık(explicit)
        
        Canli panda = new Panda();
        panda.adiniSoyle();
        ((Panda)panda).oyna();// direk olarak Panda sinifini atadik(exlicit)
    }
    
   /* public static void Canli rastgeleSec(){
        int sec = (int)(Math.random() *3); //Math kutuphanesınden rastgele 3 deger olusturur
    }*/
    
}
class Canli{
    public void adiniSoyle(){
        System.out.println("ben bir canli sinifi nesnesiyim");
    }
}
class Kartal extends Canli{

    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir Kartal sinifi nesnesiyim");
    
}
    public void uc(){
        System.out.println("Ben ucabilirim");
    }
}
class Panda extends Canli{

    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir Panda sinifi nesnesiyim");
    }
    public void oyna(){
        System.out.println("Ben oyun oynayabilirim");
    }
    
}