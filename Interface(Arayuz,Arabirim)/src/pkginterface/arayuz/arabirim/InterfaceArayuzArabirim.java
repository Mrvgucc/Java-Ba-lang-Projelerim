package pkginterface.arayuz.arabirim;

import java.util.ArrayList;

public class InterfaceArayuzArabirim {
//java coklu kalıtıma ızın vermez
    public static void main(String[] args) {
     
        Elma a = new Elma();
        Yenilebilir aa = new Elma();
        Yenilebilir bb = new Inek();
        
        ArrayList<Yenilebilir> yenilebilirSeyler = new ArrayList<>();
    }
    
}
interface Yenilebilir{
    void yenmeSekli();
            
    
}
class Elma implements Yenilebilir{
    
    @Override
    public void yenmeSekli() {
        
    }
}
class Inek implements Yenilebilir{

    @Override
    public void yenmeSekli() {
    
    }
    
}

