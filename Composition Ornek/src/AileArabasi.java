
public class AileArabasi {
private Motor m = new Motor();

public void hareketEt(){
    m.calis();
    System.out.println("Aile Arabası Çalıştı..");
}
public void dur(){
    m.dur();
    System.out.println("Aile Arabası Durdu..");
    
}
    public static void main(String[] args) {
        AileArabasi aa = new AileArabasi(); 
        aa.hareketEt();
        aa.dur();
    }
}
