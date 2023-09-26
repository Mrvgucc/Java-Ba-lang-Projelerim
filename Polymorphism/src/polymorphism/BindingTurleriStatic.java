package polymorphism;

public class BindingTurleriStatic {
    //STATIC VEYA EARLY BINDING VEYA ERKEN BAGLAMA
    //-Bu metotlar override edilemezler
    //-Bundan dolayı daha kodu yazarken hangisinin çalıstırılıcagı  bellidir
    public static void main(String[] args) {
        UstSinif.adiniSoyleStatic();
        /*ustSinif a = new ustSinif();//static meototları kullanırken nesne uzerınden degıl de metot uzerınden erısmek daha dogru olur       
        a.adiniSoyleStatic();//bu kullanım da yanlıs degıldır  */
        AltSinif.adiniSoyleStatic();
        UstSinif ustSinifNesnesi = new UstSinif();
        ustSinifNesnesi.adiniSoyleStatic();
        
        AltSinif altSiniNesnesi = new AltSinif();
        altSiniNesnesi.adiniSoyleStatic();
        
        UstSinif b = new AltSinif(); // HER ALT SINIF UST SINIFTIR  
        b.adiniSoyleStatic();// burada ust sınıf class ının ıcerıgı cagırılır cunku b nesnesının turu UstSinif  
     
    
    }
    
}

class UstSinif{
    public static void adiniSoyleStatic(){ //static olarak tanımlanmıs metotları kalıtım kullansak bıle override edemıyoruz bu sadece bu sınıfa ozgu bır metottur
        System.out.println("Ust sinifin static adini soyle metotu cagirildi"); // sinifin nesnelerıyle veya sınıfın adıyla dırekt erısılebılen metottur
    }
}
class AltSinif extends UstSinif{
    public static void adiniSoyleStatic(){ //ustSinif class ındakı adiniSoyleStatic() metodundan farklıdır o oraya aıt bu buraya aıttır
        System.out.println("Alt sinifin static adini soyle metotu cagirildi");
        
    }
}
