
package azkodcokis;

public class KalitimOrnek {
    public static void main(String[] args) {
     /*   Dikdortgen d1 = new Dikdortgen(10,20);
        d1.OzellikleriYazdir();
        System.out.println(d1); //buradakı tostrıng metodu ebeveynden aldı yanı geometrık sekıl olan metoddan kalıtım aldı eger ıstersek tabıkı kendımız ayrı yazabılırız
        
        geometrikSekil gs = new geometrikSekil(5,10);
       System.out.println(gs);    
       
       Kare k1 = new Kare(10);
       k1.alanHesaplama();
       k1.cevreHesaplama();
       
       geometrikSekil gs2 = new Kare(5);//inplicit: dolaylı yoldan, her kare bır geometrık sekıl oldugu ıcın gs2 ye kare atayabılırız
       geometrikSekil gs3 = new Dikdortgen(5,10);
       Dikdortgen d2 = new Kare(5);
       
       //Dikdortgen d3 = gs3;//normalde gs3 zaten bir dikdortgen nesnesı tutuyor bu sebeple bunu dırekt olarak karsılaması lazım ancak compiler bu kadar akıllı degıl yanı gs3 un bır dıkdortgen tuttugunu calısma anında karar verecegı ıcın bunu suan algılayamıyor
       //bu ıslemın duzeltilebilmesi için casting islemi yapılmalı yanı:
       Dikdortgen d3 = (Dikdortgen)gs3;//gs3 aslında bır geometrık sekıl degıl bır dıkdortgendır bu ısleme 'explicit' yani direkt olarak soylemek
       // ayrıca ustu alta donusturdugumuz ıcın de downcasting olur 
    */
    }
    
    public static void alaniGoster(geometrikSekil sekil){
//polymorhism olmasaydı
/*//kullanım eger bu sekılde olursa mantık yıne polımorhısm gıbı olur burada else if ve else yapılarına gırmez cunku zaten onlar da geometirksekıl clssının altsınıfı olduguu ıcın 
if(sekil instanceof  geometrikSekil){
sekil.alanHesaplama();
    System.out.println("Geometrik sekil içindeki alan hesapla cagirildi");
}
else if(sekil instanceof Dikdortgen){
    Dikdortgen gecici = (Dikdortgen)sekil;
    gecici.alanHesaplama();
    System.out.println("Dikdortgen icindeki cagirildi");
}
else {
    Kare gecici = (Kare)sekil;
    gecici.alanHesaplama();
    System.out.println("Kare içindeki alan hesapla cagırıldı ");
}*/

//Polymorhism olmasaydı bu sekılde uzun uzun yazmamız gerekırdı ancak oldugu ıcın tek satırda halledılebılıyor
if(sekil instanceof  Kare){
    Kare gecici = (Kare)sekil;
    gecici.alanHesaplama();
    System.out.println("Kare içindeki alan hesapla cagırıldı ");
}
else if(sekil instanceof Dikdortgen){
    Dikdortgen gecici = (Dikdortgen)sekil;
    gecici.alanHesaplama();
    System.out.println("Dikdortgen icindeki cagirildi");
}
else {
    sekil.alanHesaplama();
    System.out.println("Geometrik sekil içindeki alan hesapla cagirildi");
}


    //burada otomatık olarak hangısını cagıracagını bılıyor (poliymorphism)
    //sekil.alanHesaplama();
    
}


class geometrikSekil {
    private int en;
    private int boy;
    
    public geometrikSekil(int en,int boy){
        this.en = en;
        this.boy = boy;
         System.out.println("Geometrık sekıl olusturuluyor...");
    }
    public geometrikSekil(){
        System.out.println("Geometrık sekıl olusturuluyor...");
    }
    public geometrikSekil(int en){
        this.en = en;
        System.out.println("Geometrık sekıl olusturuluyor...");
    }
    /*public geometrikSekil(int boy){ // burada boy ıcın constructor yazmaya ızın vermez cunku en ıle tıplerı aynı ve parametre sayıları da aynı oldugu ıcın java hangısını alacagını bılemez 
        this.boy = boy;
    }*/

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }
    public void alanHesaplama(){
        System.out.println("Alan: " + (getBoy()*getEn()));
    }
    public void cevreHesaplama(){
        System.out.println("Cevre: " + ((getBoy()+getEn())*2));
    }

    @Override
    public String toString() {  // bu method aslında object sınfıının bır metodu  
        return "En:" + en + " Boy:" + boy;  // peki bu tostrıg metodu ne ıse yarıyor  ne zamankı nesneyı dırket olarak yazdırmak ıstersek o zaman buradakı tostrıng metodu tetıklenır ve return olan ıfadeyı gerıye dondurur
        // bır nevı gelen ozellık guncellendı 
    }
    
}
class Daire extends geometrikSekil{

        @Override
        public void alanHesaplama() {
            System.out.println("Dairenin alan hesapla metodu cagırıldı");
        }
    
}
class Dortgen extends geometrikSekil{

        @Override
        public void alanHesaplama() {
            System.out.println("Dortgenın alan hesapla metodu cagırıldı");
        }
    
}
class Dikdortgen extends geometrikSekil{ //dikdortgen bır geometrık sekıl mıdır? evet. o zaman geometrık sekılden kalıtım alabılırız
  
    public Dikdortgen(int en,int boy){
        //kalıtım aldıgımız ıcın buradakı en ve boy degerlerını geometıkSekıl class ına gondermemız gerekır setter metodu ıle yapılır
        setBoy(boy);
        setEn(en);
         System.out.println("Dikdortgen olusturuluyor...");
    }
    public Dikdortgen (int en){
        setEn(en);
         System.out.println("Dikdortgen olusturuluyor...");
    }
    
    public void OzellikleriYazdir(){
         System.out.println("Geometrik Seklin eni: " + getEn());
         System.out.println("Geometrik Seklin boyu: " + getBoy());
         alanHesaplama();
         cevreHesaplama();
     }

    @Override
    public String toString() {
        return "dikdortgenin eni:" + getEn() + " dikdortgenini boyu:" + getBoy();
    }
    
}

class Kare extends Dikdortgen{
    public Kare(int en){ // super demek ust sınıf demek yanı dıkdortgenın constructorunu belırler 
    super(en);
    setBoy(en); // geometrık sekıl metodundan gelen 
        System.out.println("Kare olusturuluyor...");
    
    }
}
}