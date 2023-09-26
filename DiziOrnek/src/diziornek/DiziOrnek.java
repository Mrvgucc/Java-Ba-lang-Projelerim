
package diziornek;

import java.util.Scanner;

public class DiziOrnek {

    public static void main(String[] args) {
        
        //2*3 luk bır matrıs ıcın
      /*  int[][] sayilar = new int[2][3];
        sayilar[0][0] = 1;
        sayilar[0][1] = 2;
        sayilar[0][2] = 3;
        sayilar[1][0] = 4;
        sayilar[1][1] = 5;
        sayilar[1][2] = 6;
        
            int[][] sayilar2 = {{1,2,3} , {4,5,6} , {7,8,9} };
            for(int satir = 0 ;satir<sayilar.length; satir++){
                for ( int sutun = 0;sutun<sayilar[satir].length; sutun++ ){
                    System.out.println(satir + ".satırın" + sutun + ".sutunundakı deger: " +sayilar[satir][sutun]);
                }
            }*/
      
      //5*5 lik bır karakter dızısınde 'A','l','i' karakterlerının soldan saga veya yukarıdan asagıya yan yana gelıp gelmedıgını bulan uyg.
        /*    int sayac = 0;
      String dizi[][] ={ {"A","A","l","i","l"} , {"l","l","i","A","l"}, {"i","A","A","l","l"} ,{"i","i","A","l","A"} ,{"i","i","A","i","l"}};// 5*5 lik dizi olusturuldu
      for(int satir = 0;satir<dizi.length;satir++){
          for(int sutun = 0; sutun<dizi.length -3; sutun++){
             if(dizi[satir][sutun] == "A" && dizi[satir][sutun+1] == "l" && dizi[satir][sutun+2]== "i"){
                 sayac++;
             }if (dizi[satir][sutun] == "A" && dizi[satir+1][sutun] == "l" && dizi[satir+2][sutun]== "i"){
                 sayac++;
              }          }
      }
        System.out.println(sayac);
        
        
        //M*N lik ve K*N lik iki diziyi alt alta birlestirecek sekılde yenı bır ıkı boyutlu diziyi kopyalayan uygulamayı yazınız.
     
     int[][] dizi1 = {{2,3},{4,5},{6,7}}; //3*3
     int dizi2[][] = {{8,9},{10,11}};//2*3
     int[][] dizi3 = new int[5][3];
     dizi3[0][0] = 2;
     
    */
        
      /*  Scanner k = new Scanner(System.in);//prizma hacmi= taban alani*yükseklik
        System.out.println("********");
        System.out.println("Hangi prizma icin islem yaypmak istiyorsunuz?");
        System.out.println("1.Kare Prizma\n"+
                "2.Ucgen Prizma\n"+
                "3.Dikdortgen Prizma\n");
        int islem = k.nextInt();
        switch(islem){
            case '1':
                System.out.print("Kare prizmanin tabaninin kenarini giriniz:");
                int kareKenar = k.nextInt();
                System.out.print("Prizmanin yuksekligini giriniz:");
                int hKare = k.nextInt();
                int kPrizmaninHacmi = ((kareKenar*kareKenar) * hKare);
                int kYanalYuzeyAlani = ((kareKenar*hKare)*4);
                System.out.println("Hacmi: " + kPrizmaninHacmi);
                System.out.println("Yuzey Alani:" + kYanalYuzeyAlani);
                
            case '2':
                System.out.print("Ucgen prizmanin tabaninin birinci kenar uzunlugunu giriniz:");
                int ucgenKenar1 = k.nextInt();
                System.out.print("Ucgen prizmanin tabaninin ikinci kenar uzunlugunu giriniz:");
                int ucgenKenar2 = k.nextInt();
                System.out.print("Ucgen prizmanin tabaninin ucuncu kenar uzunlugunu giriniz:");
                int ucgenKenar3 = k.nextInt();
                System.out.print("Prizmanin yuksekligini giriniz:");
                int hUcgen = k.nextInt();
                int uPrizmaninHacmi = ((((ucgenKenar1*ucgenKenar2))/2)*hUcgen);
                int uYanalYuzeyAlani = (ucgenKenar1*hUcgen)+(ucgenKenar2*hUcgen)+(ucgenKenar3*hUcgen);
                System.out.println("Hacmi: " + uPrizmaninHacmi);
                System.out.println("Yuzey Alani:" + uYanalYuzeyAlani);
                
            case '3':
                System.out.print("Dikdortgen prizmanin tabaninin uzun kenar uzunlugunu giriniz:");
                int dikdortgenKenar1 = k.nextInt();
                System.out.print("Dikdortgen prizmanin tabaninin kisa kenar uzunlugunu giriniz:");
                int dikdortgenKenar2 = k.nextInt();
                System.out.print("Prizmanin yuksekligini giriniz:");
                int hDikdortgen = k.nextInt();
                int dPrizmaninHacmi = ((dikdortgenKenar1*dikdortgenKenar2) * hDikdortgen);
                int dYanalYuzeyAlani = ((dikdortgenKenar1*hDikdortgen)*2) + ((dikdortgenKenar2*hDikdortgen)*2);
                System.out.println("Hacmi: " + dPrizmaninHacmi);
                System.out.println("Yuzey Alani:" + dYanalYuzeyAlani);
        }*/
      
      //M*N lik bir dizide en kucuk iki elemanin arasındaki farkin mutlak degerini veren uygulamayi yaziniz
      
      int dizi [][] = { {1,2,3}, {4,5,6} ,{7,8,9} };
for (int i = 0; i<dizi.length; i++){
    for(int j = 0; j<dizi.length;j++){
        if((dizi[0][j])>dizi[0][j+1]){
            int enKucuk0 = dizi[0][j];
            System.out.println(enKucuk0);
        }
        else if(dizi[1][j]>dizi[1][j+1]){
           
        }
        
    }
}


    }
    
}
