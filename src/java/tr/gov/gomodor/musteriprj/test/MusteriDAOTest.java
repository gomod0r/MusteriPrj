package tr.gov.gomodor.musteriprj.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import tr.gov.gomodor.musteriprj.dao.MusteriDAO;
import tr.gov.gomodor.musteriprj.dto.Musteri;

public class MusteriDAOTest {
    
    public static void testMusteriListesiGetir(){
        
        try {
            
            List<Musteri> liste = MusteriDAO.musteriListesiGetir();
            for (Musteri musteri : liste) {
                System.out.println(musteri.getNo()+" "+musteri.getAd());
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        
        testMusteriListesiGetir();
        
    }
    
}
