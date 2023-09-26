
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Merve
 */
public class Baglanti2 {
    
    private String kullaniciAdi= "root";//veritabani ismi
    private String parola = ""; //veritabani sifresi
    private String db_ismi = "demo"; // veritabani ismi
    private  String host = "localhost";//sunucu ismi
    private int port = 3306; // port numarası
    
//veritabanina baglanmak icin gerekli olan bilgiler
    
    private Connection con = null; //Connection classından uretılen con objesi ile veritabani ile baglanti saglanir
    
    private Statement statement = null;//sql sorgularını calıstırmak ıcın gereklı olan classımız bunun ıcındekı metotları kullanacagız
    
    private PreparedStatement preparedStatement = null;
    
    public Baglanti2 (){
        
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi + "?useUnicode=true&characterEncoding=utf8";  //"jdbc:mysql://localhost:3306/demo"
      // en son eklenen kısım turkce karaterlerı de calıstırmak ıcın kullanıldı
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //veritabanina baglanmak için gerekli olan driver 
            //driver denilen sey libraries e ekledigimiz mysql-connector-j-8.0.31.jar kutuphanesi dir eger bu eklenmemısse bıze burada hata olarak
        }
        catch(ClassNotFoundException ex){ //ClassNotFoundException cagirilir ve Driver Bulunamadi der.
            System.out.println("Driver Bulunamadi");
        }
        // eger exception çıkmazsa asagıdakı ıslemler gerceklesecek ve bu sefer baglanma ıslemnını yapacagız
         
        try{
        con = DriverManager.getConnection(url,kullaniciAdi,parola); // kullanici adi ve parola dogruysa baglanti gerceklesecek ve 
            System.out.println("Baglanti Basarili");
        }//ancak veritabanina baglanamazsak bize bir exception vercek
        catch(SQLException ex){
            System.out.println("Baglanti Basarisiz");
         //   ex.printStackTrace(); // bu komut url de bır hata olup olmadıgını buluyor
            
        }
        }
    
    public void preparedCalisanlariGetir(int id){
        
        String sorgu =  "select * from calisanlar where id > ? and ad like ?"; // 
        try { 
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id); //1. soru ısaretının yerıne id deger gecmıs olacak
            preparedStatement.setString(2, "M%");
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("Ad: " + ad +" Soyad: " + soyad + " Email: " + email);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public void calisanlariGetir(){
        String sorgu = "select*from calisanlar";
        // con degıskenınden statement degıskenı uretılecek
        
        try {
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){//resultSet üzerinde gezinmek ıcın kullnaılır bır sonrakı satıra gecıste kullanılır
            
                int id = rs.getInt("id"); //("id"): veritabanindaki sutunun adı yazılır
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("ID: " + id + " Ad: " + ad + " Soyad: " + soyad + " Email: " + email);
                
            }
        } catch (Exception e) {
        }
        
    }
    public void calisanGuncelle(){
    
        try { 
            statement = con.createStatement();
            String sorgu = "Update calisanlar set email = 'example@gmail.com' where id > 3";
            statement.executeUpdate(sorgu);
            
        } catch (SQLException ex) {// burada sql sorgusu ıle alakalı bır hata cıkarsan bunu yakalamak ıcın yapıyoruz
            Logger.getLogger(Baglanti2.class.getName()).log(Level.SEVERE, null, ex);
        }
}    
    
    public void calisanEkle(){
        try {
            statement = con.createStatement();
            String ad = "Semih";
            String soyad = "Aktas";
            String email = "semihaktas@gmail.com";
            String sorgu = "INSERT INTO calisanlar (ad,soyad,email) VALUES ("+ "'" + ad  + "','" + soyad + "','" + email + "')" ;
            
            statement.executeUpdate(sorgu);
            
        } catch (SQLException ex) {
        }
    }
    
    public void calisanSil(){
        try {
            statement = con.createStatement();
            String sorgu = "Delete from calisanlar where id > 3";
            int deger = statement.executeUpdate(sorgu);
            System.out.println(deger +  " kadar veri etkilendi");
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        Baglanti2 baglanti = new Baglanti2();
        /*System.out.println("Eklenmeden Once........");
        baglanti.calisanlariGetir();
        System.out.println("***************************************");
        //baglanti.calisanEkle();
        //baglanti.calisanlariGetir();
        System.out.println("Sildikten Sonra");
        baglanti.calisanSil();
        baglanti.calisanlariGetir();*/
        
        baglanti.preparedCalisanlariGetir(1);
    }
}
