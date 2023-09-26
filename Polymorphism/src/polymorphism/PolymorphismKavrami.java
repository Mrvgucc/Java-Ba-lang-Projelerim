package polymorphism;

public class PolymorphismKavrami {
//polymorphism: üst sınıf degıskenının alt sınıf nesnelerıne referans edılebılmesıdır
    public static void main(String[] args) {
       
        Hayvan h1 = new Hayvan();
        Kopek kopek1 = new Kopek("Golden");
        Kedi kedi1 = new Kedi("Van Kedisi");
        
        adiniSoyle(kedi1);
        adiniSoyle(kopek1);
        adiniSoyle(h1);
        
    }
    public static void adiniSoyle(Hayvan hayvan){
    hayvan.adiniSoyle();
    }
    
    
}

class Hayvan{
    private int ayakSayisi;
    
    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }
    
    public void adiniSoyle(){
        System.out.println("Ben bir hayvan sinifi nesnesiyim.");
    }
    
}

class Kopek extends Hayvan{
    private String tur;

    public Kopek(String tür){
        setAyakSayisi(4);
        setTür(tur);
        
    }
    
    public String getTür() {
        return tur;
    }

    public void setTür(String tür) {
        this.tur = tur;
    }
    
    @Override
    public void adiniSoyle(){ // bır ust sınıftakı metotla aynı
        System.out.println("Ben bir kopek nesnesiyim");
    }
    
    
}

class Kedi extends Hayvan{
    private String cinsi;
    
    public Kedi(String cinsi){
        setAyakSayisi(4);
        setCinsi(cinsi);
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    @Override
    public void adiniSoyle(){
        System.out.println("ben bir kedi nesnesiyim.");
        }
    
    
    
}
