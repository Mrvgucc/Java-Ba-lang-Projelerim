package equalskullanimi;
 
import java.awt.font.TextAttribute;
import java.net.Socket;
import java.util.Scanner;

public class StringinOnemliOzellikleri {
   
    
    
 
    public static void main(String[] args) {
        //Bu metotları kullanabılmem ıcın hepsınde bır nesneye ıhtıyacım var bunkara ınstance metot denır yanı nesneye ıhtıyac duyan metotlar
        String isim = "Merve";
        
         Scanner k = new Scanner(System.in);
    int merve = k.nextInt();
       
        System.out.println(isim.length()); // bu metot isim degıskenının uzunlugunu verır ve gerıye ınt bır deger dondurur
        System.out.println(isim.charAt(2));//bu metot indisteki karakteri verir
        System.out.println(isim.concat( " Guc"));// iki ifadeyi birlestirip ekrana yazdırır //anlık olarak yazdırır ver gosterır 
        //ancak bu ıslemden sonra ısım degıskenı degısmez STRINGLER DEGISTIRILEMEZ 
        //bu degıstırılmıs ıfadeyı bı yerde tutmak ıcın yenı bır degıskene atamak gerekır
        String yeni = isim.concat(" guc");
        System.out.println(yeni.toLowerCase()); // butun harflerı kucuk harfe cevırır
        System.out.println(yeni.toUpperCase());// butun harflerı buyuk harfe cevırır
        
        String baska = "    merve   "; // bosluklar da bır karakterdır
        System.out.println(baska);
        //bu boslukları kaldırmak ıcın:
        System.out.println(baska.trim()); //bu metot da baska degıskenını degıstırmez sadece anlık olarak degıstırır bunun uzerınde de ıslem yapmak ıstıyorsak yenı bır degıskene atamamız gerekır.
        String baska2 = isim.trim();
        
        String ay = "ocak";
        String ay2 = "Nisan";
        System.out.println(ay.equals(ay2));//ay ve ay2 degiskenlerinin iceriklerinin esitligini kontrol eder ancak farklı nesnelerı gosterıyorlar
        System.out.println(ay.equalsIgnoreCase(ay2));//buyuk harf kucuk harf demeden esıtlık kontrol eder yani "MaRt" ve "mARt" degıskenlerı aynıdır
        
        System.out.println(ay.compareTo(ay2));//alfabetik olarak dıgerınden once ıse -1; digerınden sonra ise 1; her ıkısıde esit olsaydi 0 degerlerını dondurur
        System.out.println(ay.startsWith("o"));//ay degıskenındeki degerin "o" ile baslayıp baslamadıgını kontrol eder (true/false)
        System.out.println(ay.endsWith("k"));// ay degiskeninin degeri "k" ile bitiyor kontrol eder
        System.out.println(ay.contains("ca"));// ay degiskeninde "ca" ifadesi varmi
        
        System.out.println(yeni.substring(5));//yeni degıskeninde 5. indisten sonraki kismi yazdırır (yeni = merve guc -> 1.m 2.e 3.r 4.v 5.e 6. 7.g 8.u 9.c)
        System.out.println(yeni.substring(0,5));// 0. indisten basla 5. indise kadarki indisleri bana ver
        System.out.println(yeni.indexOf("e"));//"m" harfinin ilk gectigi indisin degerini verir
        System.out.println(isim.lastIndexOf("e"));//"m" harfinin son gectigi indisin degerini verir
        
        System.out.println("merve"  + 3 );//gibi string bir ifadeden sonra vaye omce farketmeksizin int bir ifade gelmis ise int ifade de string gibi davranir
        
        
        String say = "56";
        System.out.println(Integer.parseInt(say));//string ifadeyi int a cevirir.
        System.out.println(Integer.parseInt(say) +4);// 56+4 =60;
    }
}
