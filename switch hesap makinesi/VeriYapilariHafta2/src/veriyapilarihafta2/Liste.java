
package veriyapilarihafta2;

class Eleman{
    int icerik;
    Eleman ileri;

public Eleman(int icerik){
this.icerik = icerik;
        ileri = null;
}
}
public class Liste {
Eleman bas,son;
public Liste(){
    bas = null;
    son = null;
}
void basaEkle(Eleman yeni){
    if (son==null){
        bas = yeni;
        son = yeni;
    }
    else {
        yeni.ileri = bas;
        bas = yeni;
    }
    
}
  String Listele(){
      Eleman tmp = bas;
      String S ="";
      while (tmp!=null){
          S = S + "->"+tmp.icerik;
          tmp = tmp.ileri;
      }
      return S;
      
  }
  int ListeAra(int aranan){
      int i = 1;
      Eleman tmp =bas;
      while (tmp!=null){
          if (aranan==tmp.icerik) {
              return i;
          }
          tmp =tmp.ileri;
          i++;
      }
          return -1;
      }
  void sonaEkle(Eleman yeni){
      if(son == null ||bas == null){
          bas = yeni;
          son =yeni;
      }
      else {
          son.ileri = yeni;
          son =yeni;
      }
      
  }
  
        
    public static void main(String[] args) {
        
    }
    
}
