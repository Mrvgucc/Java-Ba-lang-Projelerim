package equalskullanimi;

public class StringDegismez {

    public static void main(String[] args) {
        // Stringler degıstırılemez Strıng sınıf ımmutable dır
        // String referans turlu veri tipidir int double char gibi primitive veri tipi degildir 
        //ard arda charları bır arada tutan yapıdır
        
        //String isim = new String("merve"); // normalde bu ıfade String pool da degıldır ve isim degıskenı abc degıskenıne esıt degıldır cunku abc degıskenı string pool da isim degıskenı ıse yeni bir alanda bunların esıt olabılmesı ıcın isim degıskenının de strıng pool a tasınması gerekır bunun ıcın intern(): metodu kullanılır
        String isim = new String("merve").intern();
        
        String ad = new String("merve");
        
        
        System.out.println(isim == ad); // false cunku tuttukları referans adreslerı farklıdır
        System.out.println(isim.equals(ad)); // true icerikleri aynıdır
        
        String abc = "merve";
        String def = "abc";
        // abc = "merve guc"; // bu ıfade bu sekılde yazıldıgı zaman abc nın yenı degerı 'merve guc' olmus olmyo heap te String pool da (String havuzunda) 'merve' ayrı 'merve guc' ayrı tutuluyor yanı onun ıcın yenı bır yer hazırlanıyor
      
        abc.concat(" guc"); // concat(): metodu abc stringinin yanına guc strıngını ekler yanı olan bır strınge ekleme yapar ancak bu ıslemı yaparken de kendısı ıcın heap tekı strıng pool da yenı bır alan acılıyor yanı merve ayrı merve guc ayrı tutluyor 
        //ve bu ıfadeye suan ıcın ulasılamaz ulasmak ıstıyorsak bır degıskene atamamız gerekır:
        String yeni = abc.concat(" guc");
        System.out.println(abc);
        System.out.println(yeni);
        
        
         
        System.out.println(abc == def);
        System.out.println(isim == abc);
        
    }
    
}
