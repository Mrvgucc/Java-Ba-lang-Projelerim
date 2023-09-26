package soyutsinifkavrami;

public class SoyutSinifKavrami {

     
    public static void main(String[] args) {
        
        GeometrikSekil kare = new Kare(5);
        kare.alanHesapla();
        kare.cevreHesapla();
      //  kare.adiniSoyle();// seklinde bir kullanim yapamam cunku kare degıskenı new Kare(5)ifadesine run time da atanir yani calısma zamanında
       ((Kare)kare).adiniSoyle(); // burada Kare sinifindan oldugunu soyledık boylece hata almadık
       
       Dikdortgen dikdortgen = new Dikdortgen(10, 12);
       dikdortgen.cevreHesapla();
       dikdortgen.alanHesapla();
       dikdortgen.adiniSoyle(); // burada ıse boyle bır tanımda sıkıntı cıkmadı cunku en basta tanımlanırken zaten Dikdortgen claasından tanımlandı
       //ancak karedeki gibi olsaydi:
       GeometrikSekil dikdortgen2 = new Dikdortgen(10, 12);
     // dikdortgen2.adiniSoyle();//olmazdi bunun icin de yine turunu belırleyerek yapmamız gerekir
       ((Dikdortgen)dikdortgen2).adiniSoyle();
       
       GeometrikSekil daire = new Daire(5);
       daire.cevreHesapla();
       daire.alanHesapla();
        alanlariKarsilastir(kare, dikdortgen);
       
       
    }
    public static void alanlariKarsilastir(GeometrikSekil gs1,GeometrikSekil gs2){
        if(gs1.getHesaplananAlan() > gs2.getHesaplananAlan()){
            System.out.println("Birinci parametredeki nesnesin alani ikinci parametredeki nesnenin alanindan buyuktur ");
        }
        else if(gs1.getHesaplananAlan() < gs2.getHesaplananAlan()){
            System.out.println("Birinci parametredeki nesnesin alani ikinci parametredeki nesnenin alanindan kucuktur ");
        }
        else 
            System.out.println("alanlar birbirine esittir");
    }
            
    
}
abstract class GeometrikSekil{
    private int birinciKenar;
    private int hesaplananAlan;

    
     abstract public void cevreHesapla();
       
    abstract public void alanHesapla();

    public int getHesaplananAlan() {
        return hesaplananAlan;
    }

    public void setHesaplananAlan(int hesaplananAlan) {
        this.hesaplananAlan = hesaplananAlan;
    }
    
    
    public int getBirinciKenar() {
        return birinciKenar;
    }

    public void setBirinciKenar(int birinciKenar) {
        this.birinciKenar = birinciKenar;
    }
}
class Kare extends GeometrikSekil{

    public Kare(int kenar) {
        this.setBirinciKenar(kenar);
    }
    

    @Override
    public void cevreHesapla() {
          System.out.println("Karenin Cevresi: "+ (getBirinciKenar() * 4));
    }

    @Override
    public void alanHesapla() {
        setHesaplananAlan(getBirinciKenar()*getBirinciKenar());
        System.out.println("Karenin Alani: " + (getHesaplananAlan()));
    }
    public void adiniSoyle(){
        System.out.println("ben bir kare sinifi nesnesiyim");
    }
    
}
class Dikdortgen extends GeometrikSekil{
    private int ikinciKenar;

    public Dikdortgen(int birinciKenar,int ikinciKenar) {
        setBirinciKenar(birinciKenar);
        this.ikinciKenar = ikinciKenar;
    }

    @Override
public void cevreHesapla(){
        System.out.println("Dikdortgenin Cevresi: " + ((getBirinciKenar()+ikinciKenar)*2)) ;
}
@Override
public void alanHesapla(){
    setHesaplananAlan(getBirinciKenar()*ikinciKenar);
    System.out.println("Dikdortgenin Alani: " + getHesaplananAlan());
}

    public int getIkinciKenar() {
        return ikinciKenar;
    }

    public void setIkinciKenar(int ikinciKenar) {
        this.ikinciKenar = ikinciKenar;
    }
    public void adiniSoyle(){
        System.out.println("Ben bir dikdortgen nesnesiyim");
    }

    
}
class Daire extends GeometrikSekil{

    public Daire(int yaricap) {
        setBirinciKenar(yaricap); //burada birinciKenar dedigimiz degisken yaricap olarak atandi
    }
@Override
public void cevreHesapla(){
    System.out.println("Dairenin cevresi: " + (2*3.14*getBirinciKenar()));
}
@Override 
public void alanHesapla(){
    setHesaplananAlan((int)(3.14*Math.pow(getBirinciKenar(), 2)));
    System.out.println("Dairenin Alani: " + getHesaplananAlan());
}
}