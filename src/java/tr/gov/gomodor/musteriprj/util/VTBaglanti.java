package tr.gov.gomodor.musteriprj.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class VTBaglanti {
    public static Connection baglantiGetir() throws ClassNotFoundException, SQLException{
        //ojdo
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
        //jot
        Connection conn = 
        DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.102:1521:xe", 
        "gomodor", "145300");
        return conn;
    }
    
    public static void baglantiKapat(Connection p_conn) throws SQLException{
        
        //System.out.println("Veritabanı bağlantısı kapatılıyor..");
        p_conn.close();
    }
}
