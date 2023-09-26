package javaapplication20;

public class Encapsulation {
    
    public static void main(String[] args) {
         //   Ogrenci merve = new Ogrenci(50,"emre");
           
         Televizyon tv = new Televizyon();
         tv.ac();
         tv.setSesSeviyesi(25);
         tv.setKanal(20); 
         tv.kapat();
         
         tv.goster();
    }
    
}
