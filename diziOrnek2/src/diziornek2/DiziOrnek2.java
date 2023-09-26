package diziornek2;


public class DiziOrnek2 {

    public static void main(String[] args) {
       //MxN lik bir dizide toplamı 14 olan sayıları ekrana yazan program
       int dizi[][] = {{1,2,9},{10,5,4},{7,6,8}};
       for(int i = 0; i <2 ;i++){
           for(int j = 0; j<2; j++){ 
              for(int k = 0; k <2;k++){
                  for (int m = 0; m<2;m++){
                      if(dizi[i][j] + dizi[i][j] == 14){
                          if(dizi[k][m] + dizi[k][m] == 14){
                              System.out.println(i +" " + j);
                              System.out.println(k+" "+m);
                          }
                      }
                  }
           }
             
           }
           
       }
    
    
}
}