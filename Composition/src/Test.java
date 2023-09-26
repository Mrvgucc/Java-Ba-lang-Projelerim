
public class Test {

    public static void main(String[] args) {
        Resolution resolutionTest = new Resolution(1920, 1080); 
        Monitor monitorTest = new Monitor("VS197DE", "ASUS", "18,5", resolutionTest); // Monitor objesinin içinde resolution kullanıldı.
        Kasa kasaTest = new Kasa("Shadow Blade", "Shadow", "Temperli Cam");
        Anakart anakartTest = new Anakart("B250-PRO", "ASUS", 10, "Windows 10");
        
        Bilgisayar pc = new Bilgisayar(monitorTest, kasaTest, anakartTest);
        
        pc.getKasa().bilgisayariAc();
        pc.getMonitor().monitoruKapat();
        pc.getAnakart().isletimSistemiYukle("Ubuntu 16,04");
    }
    
}
