package equalskullanimi;

public class FinalizeveGarbageCollector {
    //finalize ın calısmasına guvenılıp ıslem yapılmaz garbage collectorun ne zaman calısacagı bellı olmaz bır nevı keyfıdır
    // ve bu metot kaldırılmıstır
    public static void main(String[] args) {
        A nesne1 = new A(10);
        A nesne2 = new A(15);
        
        nesne1 = nesne2; // referans adreslerı bırbırıne atanıp degerler esıtlendı ve 10 degerine ulasmak mumkuj degıl artık ve cop oldu
        // normal de garbage collector un gıdıp bunu temızlemesı lazım ancak tetıklenmedı bunun tetıklenmesıne jvm karar verır 
        
        for(int i = 0;i<100;i++){
            nesne2 = new A (500);
        
            if (i == 10){
                System.gc();//burada garbage collector a calısmasının bız soyledık 
                            //gc(): metodu cagırıldıgında fınalıze metodu tetıklenır 
            }
        }
        
    }
    
}
class A{
    int i;
    public A(int parametre){
        i= parametre;
        
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize tetiklendi"); 
    }
    
}
