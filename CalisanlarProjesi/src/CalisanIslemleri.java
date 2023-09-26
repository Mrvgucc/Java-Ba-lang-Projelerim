
import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.NamingManager;
//import java.sql.*;
import java.sql.ResultSet;
import java.util.ArrayList;

/*
 * @author Merve
 */
public class CalisanIslemleri {
    
 private Connection con = null; //Connection classından uretılen con objesi ile veritabani ile baglanti saglanir
    
    private Statement statement = null;//sql sorgularını calıstırmak ıcın gereklı olan classımız bunun ıcındekı metotları kullanacagız
    
    private PreparedStatement preparedStatement = null;    
    
    public ArrayList<Calisan> calisanlariGetir(){
        
        ArrayList<Calisan> cikti = new ArrayList<Calisan>();
     try {
         statement = con.createStatement();
         String sorgu = "select *from calisanlar"; 
         ResultSet rs = statement.executeQuery(sorgu);
         
         while(rs.next()){
             int id = rs.getInt("id");
             String ad = rs.getString("ad");
             String soyad = rs.getString("soyad");
             String dept = rs.getString("departman");
             String maas = rs.getString("maas");
             
             cikti.add(new Calisan(id, ad, soyad, dept, maas));
         }
         
         return cikti;
         
     } catch (SQLException ex) {
         Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
         return null;
     }
    }
    
    public void calisanGuncelle(int id,String yeniAd,String yeniSoyad, String yeniDepartman, String yeniMaas){
        
        String sorgu = "Update calisanlar set ad = ? , soyad = ? , departman = ? , maas = ? where id = ?";
        
     try {
         preparedStatement = con.prepareStatement(sorgu);
         
         preparedStatement.setString(1, yeniAd);
         preparedStatement.setString(2, yeniSoyad);
         preparedStatement.setString(3, yeniDepartman);
         preparedStatement.setString(4, yeniMaas);
         
         preparedStatement.setInt(5, id);
         
         preparedStatement.executeUpdate();
     } catch (SQLException ex) {
         Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
     }
        
    }
    
    public void calisanSil(int id){
        String sorgu = "delete from calisanlar where id = ?";
     try {
         preparedStatement=con.prepareStatement(sorgu);
         preparedStatement.setInt(1, id);
         
         preparedStatement.executeUpdate();
     } catch (SQLException ex) {
         Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
     }
        
    }
    
    public void calisanEkle(String ad, String soyad, String departman,String maas){
        
        String sorgu = "insert into calisanlar (ad,soyad,departman,maas) values  (?,?,?,?)";
     try {
         preparedStatement = con.prepareStatement(sorgu);
         preparedStatement.setString(1,ad);
         preparedStatement.setString(2, soyad);
         preparedStatement.setString(3, departman);
         preparedStatement.setString(4, maas);
         
         preparedStatement.executeUpdate();
     } catch (SQLException ex) {
         Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
     }
        
    }
    
    public boolean girisYap(String kullaniciAdi,String parola){
        String sorgu = "select * from adminler where username = ? and password = ? ";
     try {
         preparedStatement = con.prepareStatement(sorgu);
         preparedStatement.setString(1, kullaniciAdi);
         preparedStatement.setString(2, parola);
         
         ResultSet rs = preparedStatement.executeQuery();
         
         if (rs.next() == false){
             return false;
         }
         else
             return true;
     } catch (SQLException ex) {
         Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
         return false;
     }
     
    }
    
    public CalisanIslemleri(){
        
        String url = "jdbc:mysql://" + DataBase.host + ":" + DataBase.port + "/" + DataBase.db_ismi + "?useUnicode=true&characterEncoding=utf8";  //"jdbc:mysql://localhost:3306/demo"
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı...");
        }
        
        try{
            con = DriverManager.getConnection(url,DataBase.kullaniciAdi,DataBase.parola); // kullanici adi ve parola dogruysa baglanti gerceklesecek 
            System.out.println("Baglanti Basarili");
        }//ancak veritabanina baglanamazsak bize bir exception vercek
        catch(SQLException ex){
            System.out.println("Baglanti Basarisiz");
         //   ex.printStackTrace(); // bu komut url de bır hata olup olmadıgını buluyor
        }
    }
    public static void main(String[] args) {
        CalisanIslemleri islemler = new CalisanIslemleri();
    }
    
}
