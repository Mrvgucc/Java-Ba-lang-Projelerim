package veriyapilariders;
public class graf {
private  boolean adjMatrix[][];
private int numVertices;

public graf (int numVertices){
    this.numVertices = numVertices;
    adjMatrix = new boolean[numVertices][numVertices];
}
 //Kenar Ekle
 public void addEdge(int i ,int j){
     adjMatrix[i][j] = true;
     adjMatrix[j][i] = true;
 }
 
 //Kenar Çıkar
 public void removeEdge(int i,int j){
     adjMatrix[i][j] = false;
     adjMatrix[j][i] = false;
             }
 //Matrisi Doldur
 public String toString(){
     String s = "";
     for (int i = 0;i<numVertices; i ++){
         s=s+i+"";
         for (boolean j: adjMatrix[i]){
             if(j){
                 s=s+" " + 1;
                 
             }
             
         }
     }
     return s;
 }
 public boolean yonsuzmu(){
     boolean y = true;
     for(int i = 0;i<numVertices;i++){
         for(int j = 0;j<numVertices;j++){
             if(adjMatrix[i][j]!= adjMatrix[j][i]){
                 y = false;
                 break;
             }
             if (y == false)
                 break;
         }
              }
     return y;

     
 }
    public static void main(String[] args) {
        graf g = new graf(4);
        
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        System.out.println(g.toString());
        System.out.println("YONSUZ MU?" + g.yonsuzmu());
    }

 
}
