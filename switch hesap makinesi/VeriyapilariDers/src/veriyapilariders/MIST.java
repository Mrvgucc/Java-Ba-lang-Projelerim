package veriyapilariders;
class MST{
    //Graftaki dugum sayisi
    private static final int k=9;
    //MST ye henuz eklenmemıs bir dugumu bulma
    int minKey(int key[],Boolean mstSet[]){
    
        //MİNİMUM DEGERİ BASLAT
        int min = Integer.MAX_VALUE,min_index = -1;
        
        for (int v = 0; v<k;v++ )
            if (mstSet[v] == false && key[v] < min){
                min = key[v];
                min_index = v;
            }
        return min_index;
    }
    
    //parent[] dizisinde tutulan MST 'yi cizdiren metot
    void printMST(int parent[],int graph[][]){
        System.out.println("Kenar \t Agirlik");
        for(int i = 1;i<k;i++){
            System.out.println(parent[i] + " - " + i + "\t"+ graph[i][parent[i]]);
        }
       
            
    }      
     // komsuluk matrısı ıle tutulan grafta  MST bulma
        void primMST(int graph[][]){{
            //OLUSTURULACAK MST YI TUTAN DIZI
            int parent[] = new int[k];
            
            //minimum agırlıklı dugumu tutma
            int key[] = new int[k];
            
            //MST ye dahil edilen dugumleri gosterme
            Boolean mstSet[] = new Boolean[k];
            
            //butun anahtarları sonsuz olarak baslat
            for(int i = 0;i<k;i++){
                key[i] = Integer.MAX_VALUE;
                mstSet[i] = false;
            }
            
            //Daima ilk dugumu icerir
            key[0] = 0; // ilk dugumun anahatarını 0 yap
            parent[0] = -1;//ilk dugum kok oldugundan atasi
            
            //MST k dugumune sahıp olacak
            for(int count =0; count< k-1; count++){
                //henuz MST ye dahıl olmamıs dugumler kumesı
                //dugumu secin
                int u = minKey(key, mstSet);
                // MST kumesine dugumu ekle
                mstSet[u] = true;
                
                for (int v = 0; v<k;v++) 
                    if(graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[v]){
                        parent[v] = u;
                        key[v] = graph[u][v];
                    }
               
            }
            //print the constructed MST
            printMST(parent, graph);
            
                       
        }
            }
        public class PrimAlgoritmasi{
            public static void main(String[] args) {
                MST t = new MST();
                int graph[][] = new int[][]{
                    {0,4,0,0,0,0,0,8,0},
                    {4,0,8,0,0,0,0,11,0},
                    {0,8,0,7,0,4,0,0,2},
                    {0,0,7,0,9,14,0,0,0},
                        {0,0,0,9,0,10,0,0,0},
                        {0,0,4,14,10,0,2,0,0},
                        {0,0,0,0,0,2,0,1,6},
                        {8,11,0,0,0,0,1,0,7},
                        {0,0,2,0,0,0,6,7,0}
                };
                
                //print the solution
                t.primMST(graph);
                }
            }
        }
