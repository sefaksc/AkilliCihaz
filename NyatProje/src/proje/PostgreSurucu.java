package proje;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgreSurucu implements IVeritabaniArayuz
{
    private  Connection baglan()
    {
        Connection conn = null ;
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/AkilliCihazDB",
                    "postgres", "12345");

            System.out.println("(PostgreSql) Veritabanına bağlantı başarıyla gerçekleşti!");

        } catch (Exception e) {
            System.out.println("Veritabanına bağlanılamadı !");
            e.printStackTrace();
        }
        return conn;
    }
    public boolean dogrulama(String username , String password)
    {
       try
       {
           Connection conn = this.baglan();
           if(conn != null){
               String sorgu = "SELECT \"username\",\"password\" FROM \"Kayit\" WHERE \"username\"='"+username+"'";
               Statement stmt = conn.createStatement();
               ResultSet result = stmt.executeQuery(sorgu);
               conn.close();
               boolean kontrol = false;
               while(result.next()){
                   if(result.getString("username").equals(username) && result.getString("password").equals(password))
                       kontrol = true;
               }
               if(kontrol){
                   System.out.println("Giriş Başarılı !");
                   return true;
               }
               else{
                   System.out.println("Kullanıcı adı veya şifre yanlış !");
                   return false;
               }
           }
           else{
               System.out.println("Veritabanına bağlantı gerçekleştirilemedi !");
               return false;
           }
       }
       catch (Exception e)
       {
           return false ;
       }
    }
}
