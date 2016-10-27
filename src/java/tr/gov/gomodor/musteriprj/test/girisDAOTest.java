package tr.gov.gomodor.musteriprj.test;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import tr.gov.gomodor.musteriprj.dao.GirisDAO;
import tr.gov.gomodor.musteriprj.dto.Giris;

public class girisDAOTest {
    
    public static void testGiriseYetkilimi(){
        
        try {
            
            Giris giris = new Giris();
            
            giris.setKullanici("hakan");
            giris.setSifre("1234");
            
            
            boolean sonuc = GirisDAO.giriseYetkilimi(giris);
            
            if (sonuc) {
                System.out.println("Giriş başarılı!");
            } else {
                System.out.println("Kullanıcı adı ya da şifre yanlış!");
            }
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        
        testGiriseYetkilimi();
        
    }
    
}
