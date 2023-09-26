
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.sql.Statement;
//import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.*;
import com.mysql.cj.jdbc.result.ResultSetFactory;


public class Baglanti {

private String kullanici_adi = "root";
private String parola = "";
private String db_ismi = "vtysproje";
private  String host = "localhost";

private int Baglanti = 3306;

private Connection con = null; // veritabani ile baglantiyi saglar
Statement statement = null; //istenilen sorgunun çalışmasını sağlar
ResultSet resultSet = null; // sorgudan alınan sonucun bir sonuç kümesine yazdırılması

//private Statement statement = null;// sql sorguları calıstırmak ıcın gereklı sorgularımız

public void kullaniciEklee(String ad,String soyad,String email,String sifre){
    try {  
        statement = con.createStatement();
        String sorgu =  "Insert into kullanici (ad,soyad,email,sifre) VALUES ("+" ' "+ ad + "'," + "'" + soyad + "'," + "'"  + email +"'," + "'" +sifre+"')";
        
        statement.executeUpdate(sorgu);
    } catch (SQLException ex) {
        Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
    }
}
public void kullanicilariGetir(){
    
    String sorgu = "SELECT * FROM kullanici"; // kullanici: tablo adi
    
   try {
       statement = con.createStatement();
        
        
        
       resultSet = statement.executeQuery(sorgu);
       
       
       while(resultSet.next()){
           int id = resultSet.getInt("id");
           String ad = resultSet.getString("ad");
           String soyad = resultSet.getString("soyad");
           String email = resultSet.getString("email");
           String sifre = resultSet.getString("sifre");
           
           System.out.println("id"  + id + " ad:" + ad + " soyad:" + soyad + " email:" + email + "sifre" +sifre);
       }
        
    } catch (SQLException ex) {
        System.out.println(ex.getStackTrace());
    }
}

public boolean sifreSorgula(String mail,String parola){
    
    String sifreSorgu = "SELECT * FROM kullanici WHERE email='"+mail+"' AND sifre='"+parola+"';";
    
    try {
       statement = con.createStatement();
        
       resultSet = statement.executeQuery(sifreSorgu);
       
        if (resultSet.next()==true) {
            return true;
        }else{
            return false;
        }
       
        
    } catch (SQLException ex) {
        System.out.println(ex.getStackTrace());
    }
    return true;
    
}
public boolean mailSorgula(String mail){
    
    String sifreSorgu = "SELECT * FROM kullanici WHERE email='"+mail+"';";
    
    try {
       statement = con.createStatement();
        
        
        
       resultSet = statement.executeQuery(sifreSorgu);
       
        if (resultSet.next()==true) {
            return true;
        }else{
            return false;
        }
       
        
    } catch (SQLException ex) {
        System.out.println(ex.getStackTrace());
    }
    return true;
    
}

public int kullaniciIdGetir(String mail){
    
    String mailSorgu = "SELECT id FROM kullanici WHERE email='"+mail+"';";
    int id;
    
    try {
        statement = con.createStatement();
        
        
       resultSet = statement.executeQuery(mailSorgu);
       resultSet.next();
       
       id = resultSet.getInt("id");
       return id;
       
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    
    return 0;
}

public String kullaniciAdiGetir(String mail){
    
    String mailSorgu = "SELECT ad FROM kullanici WHERE email='"+mail+"';";
    String ad;
    
    try {
        statement = con.createStatement();
        
        
        
       resultSet = statement.executeQuery(mailSorgu);
       resultSet.next();
       
       ad = resultSet.getString("ad");
       return ad;
       
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    
    return "Test";
}

public void sikayetEkle(int sykid,String starih,String sikayet){
    
    try {  
        statement = con.createStatement();
        String sorgu =  "Insert into sikayet (sykid,starih,sikayet,begeni) VALUES ("+" ' "+ sykid + "'," +  "'"  + starih +"'," + "'" +sikayet+"','0')";
        
        statement.executeUpdate(sorgu);
        
    } catch (SQLException ex) {
        Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
    }

    
}

public String[][] begeniSirasi(){
    String [][]begeni=new String[100][5];
    
    
    try {  
        statement = con.createStatement();
        
        String begeniSorgu="SELECT ad,soyad,sikayet,starih,begeni FROM kullanici INNER JOIN sikayet ON kullanici.id = sikayet.sykid ORDER BY begeni DESC;";
        
        resultSet = statement.executeQuery(begeniSorgu);
        
        
        int i=0;
        
        while (resultSet.next()) {            
            begeni[i][0]=resultSet.getString("ad");
            begeni[i][1]=resultSet.getString("soyad");
            begeni[i][2]=resultSet.getString("sikayet");
            begeni[i][3]=resultSet.getString("starih");
            begeni[i][4]=String.valueOf(resultSet.getInt("begeni"));
            i++;
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    return begeni;
}
/*public String[][] tarihSirasi(){
    String [][]begeni=new String[100][5];
    
    
    try {  
        statement = con.createStatement();
        
        String begeniSorgu="SELECT ad,soyad,sikayet,starih,begeni FROM kullanici INNER JOIN sikayet ON kullanici.id = sikayet.sykid ORDER BY starih  DESC;";
        
        resultSet = statement.executeQuery(begeniSorgu);
        
        
        int i=0;
        
        while (resultSet.next()) {            
            begeni[i][0]=resultSet.getString("ad");
            begeni[i][1]=resultSet.getString("soyad");
            begeni[i][2]=resultSet.getString("sikayet");
            begeni[i][3]=resultSet.getString("starih");
            begeni[i][4]=String.valueOf(resultSet.getInt("begeni"));
            i++;
        }
        
        
    } catch (SQLException ex) {
        Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    return begeni;
}*/
    
        

public Baglanti(){
    String url = "jdbc:mysql://"+ host+ ":" + Baglanti + "/" + db_ismi + "?useUnicode=true&characterEncoding=utf8";
    System.out.println(url);
   try{
        Class.forName("com.mysql.cj.jdbc.Driver");
    }
    catch (ClassNotFoundException ex){
        //Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE , null , ex);
        //System.out.println("Driver Bulunamadi...");
    }
   try {
        con = DriverManager.getConnection(url,kullanici_adi,parola);
        //System.out.println("Baglanti Basarili...");
   }
   catch(SQLException ex){
      // System.out.println("Baglanti Basarisiz...");
      
   }
  
}

public int begeniIdBul(int sid,int kid){
    int bid;
    try {
        String sorgu="SELECT bid FROM begeniTablosu WHERE bkid='"+kid+"' AND bsid='"+sid+"';";
        
        statement = con.createStatement();
        
       resultSet = statement.executeQuery(sorgu);
       resultSet.next();
       bid=resultSet.getInt("bid");
       return bid;
        
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    
    return 0;
}

public void begeniTablosundanKaldır(int sid,int kid){
    
    int bid=begeniIdBul(sid,kid);
    
    try {
        
        statement = con.createStatement();
        
        String sorgu="DELETE FROM begenitablosu WHERE  bid='"+bid+"';";
        
        statement.executeUpdate(sorgu);
        
        
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    
}


public boolean begeniKontrol(int kid,int sid){
    String sorgu="SELECT * FROM begeniTablosu WHERE bkid='"+kid+"' AND bsid='"+sid+"';";
    
    try {
       statement = con.createStatement();
        
       resultSet = statement.executeQuery(sorgu);
       
        if (resultSet.next()==true) {
            return true;
        }else{
            return false;
        }
       
        
    } catch (SQLException ex) {
        System.out.println(ex.getStackTrace());
    }
    return true;
}



public int sikayetIdBul(String sikayet){
    
    String sikayetSorgu = "SELECT sid FROM sikayet WHERE sikayet='"+sikayet+"';";
    int id;
    
    try {
       statement = con.createStatement();
        
       resultSet = statement.executeQuery(sikayetSorgu);
       resultSet.next();
       id=resultSet.getInt("sid");
       return id;
       
    } catch (SQLException ex) {
        System.out.println(ex.getStackTrace());
    }
    return 0;
}

public void begeniArttır(int sid){
    String sorgu1="SELECT * FROM sikayet WHERE sid='"+sid+"';";
    String sorgu2;
    int begeniSayisi;
     try {  
        statement = con.createStatement();
        
        resultSet = statement.executeQuery(sorgu1);
        resultSet.next();
        begeniSayisi=resultSet.getInt("begeni");
        begeniSayisi++;
        sorgu2="UPDATE sikayet SET begeni ='"+begeniSayisi+"' WHERE sid = '"+sid+"';";
        statement.executeUpdate(sorgu2);
        
    } catch (SQLException ex) {
         System.out.println(ex.getMessage()+"aaaaaaaaaaaaaaaaaa");
    }
}

public String sikayetDonder(int sid){
    String sorgu="SELECT sikayet FROM sikayet WHERE sid='"+sid+"';";
    String sikayet;
    try {
       statement = con.createStatement();
        
       resultSet = statement.executeQuery(sorgu);
       resultSet.next();
       sikayet=resultSet.getString("sikayet");
       return sikayet;
       
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return "Test";
    
    
}

public String adDonder(int sid){
    String sorgu1="SELECT sykid FROM sikayet WHERE sid='"+sid+"';";
    
    int sykid;
    String name;
    
    try {
       statement = con.createStatement();
        
       resultSet = statement.executeQuery(sorgu1);
       resultSet.next();
       sykid=resultSet.getInt("sykid");
       
       String sorgu2="SELECT ad FROM kullanici WHERE id='"+sykid+"';";
       resultSet=statement.executeQuery(sorgu2);
       resultSet.next();
       name=resultSet.getString("ad");
       return name;
       
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return "Test";
}


public int[] tumIdler(){
    String adetSorgu = "SELECT * FROM sikayet WHERE sid;";
    
    int idList[]=new int[adet()];
    int i=0;
    
    try {
       statement = con.createStatement();
        
       resultSet = statement.executeQuery(adetSorgu);
        while (resultSet.next()) {            
            idList[i]=resultSet.getInt("sid");
            i++;
        }
        return idList;
        
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return idList;
}


public void begeniAazalt(int sid,String mail){
    String sorgu1="SELECT * FROM sikayet WHERE sid='"+sid+"';";
    String sorgu2;
    int begeniSayisi;
    begeniTablosundanKaldır(sid,kullaniciIdGetir(mail));
     try {  
         
        
         
        statement = con.createStatement();
        
        resultSet = statement.executeQuery(sorgu1);
        resultSet.next();
        begeniSayisi=resultSet.getInt("begeni");
        begeniSayisi--;
        sorgu2="UPDATE sikayet SET begeni ='"+begeniSayisi+"' WHERE sid = '"+sid+"';";
        statement.executeUpdate(sorgu2);
        
    } catch (SQLException ex) {
        Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
    }
}

public void begeniTablosunaEkle(String sikayet,String mail){
    int kid=kullaniciIdGetir(mail);
    int sid=sikayetIdBul(sikayet);
    
    try {  
        statement = con.createStatement();
        String sorgu =  "Insert into begeniTablosu (bkid,bsid) VALUES ("+" ' "+ kid + "'," + "'" + sid + "')";
        
        statement.executeUpdate(sorgu);
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    
}


public int begeniAdet(int sid){
    int adet=0;
    
    String adetSorgu = "SELECT * FROM begeniTablosu WHERE bsid='"+sid+"';";
    
    try {
       statement = con.createStatement();
        
       resultSet = statement.executeQuery(adetSorgu);
       
        while (resultSet.next()) { 
            adet++;
        }
        return adet;
        
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return adet;
}


public int adet(){
    int adet=0;
    
    String adetSorgu = "SELECT * FROM sikayet;";
    
    try {
       statement = con.createStatement();
        
       resultSet = statement.executeQuery(adetSorgu);
       
        while (resultSet.next()) { 
            adet++;
        }
        return adet;
        
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    }
    return 0;
}


    public static void main(String[] args) {
        Baglanti baglanti = new Baglanti();
        
        System.out.println("Eklenmeden once");
        baglanti.kullanicilariGetir();
        System.out.println("*********************");
       
       
    }

    

    }

 

