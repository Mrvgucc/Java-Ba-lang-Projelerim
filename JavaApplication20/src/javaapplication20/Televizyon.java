package javaapplication20;

public class Televizyon {
    
   private int kanal;
   private int sesSeviyesi;
   private boolean acik;
    
    public void ac(){
        if(acik == false){
        System.out.println("Televizyon açılıyor");
        acik = true;
    }else System.out.println("Televizyon zaten acik");
    }
    public void kapat(){
        if(acik == true){
        System.out.println("Televizyon kapatılıyor");
        acik = false;
    }else System.out.println("Televizyon zaten kapalı");
    }
    
    public void setKanal(int yeniKanal){
    if(acik && yeniKanal > 0 && yeniKanal <500){
        kanal = yeniKanal;
    }else 
            System.out.println("tv kapalı veya yanlıs bır kanal yazdınız");
        
    }
    
    public int getKanal(){
        return kanal;
    }

    public int getSesSeviyesi() {
        return sesSeviyesi;
    }

    public void setSesSeviyesi(int sesSeviyesi) {
        this.sesSeviyesi = sesSeviyesi;
    }

    public boolean isAcik() {
        return acik;
    }

    public void setAcik(boolean acik) {
        this.acik = acik;
    }
    
    public void goster(){
        System.out.println("Tv açık: " + acik +"Kanal No: " + kanal + "ses seviyesi: " + sesSeviyesi);
    }
}
