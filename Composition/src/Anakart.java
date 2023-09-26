
public class Anakart {

    private String model;
    private String uretici;
    private int yuvaSayısı;
    private String isletimSistemi;

    public Anakart(String model, String uretici, int yuvaSayısı, String isletimSistemi) {
        this.model = model;
        this.uretici = uretici;
        this.yuvaSayısı = yuvaSayısı;
        this.isletimSistemi = isletimSistemi;
    }
    public void isletimSistemiYukle(String isletimSistemi){
        this.isletimSistemi = isletimSistemi;
        System.out.println("İşletim Sistemi Yüklendi: " + isletimSistemi);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuvaSayısı() {
        return yuvaSayısı;
    }

    public void setYuvaSayısı(int yuvaSayısı) {
        this.yuvaSayısı = yuvaSayısı;
    }

    public String getIsletimSistemi() {
        return isletimSistemi;
    }

    public void setIsletimSistemi(String isletimSistemi) {
        this.isletimSistemi = isletimSistemi;
    }

}
