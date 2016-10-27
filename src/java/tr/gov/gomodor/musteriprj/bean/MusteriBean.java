package tr.gov.gomodor.musteriprj.bean;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import tr.gov.gomodor.musteriprj.dao.MusteriDAO;
import tr.gov.gomodor.musteriprj.dto.Musteri;
import tr.gov.gomodor.musteriprj.util.JSFUtil;

@ManagedBean
@ViewScoped
public class MusteriBean {
    
    private List<Musteri> musteriListesi;
    
    @PostConstruct
    public void veriTabanindanDoldur(){
        
        try {
            musteriListesi = MusteriDAO.musteriListesiGetir();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MusteriBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MusteriBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public List<Musteri> getMusteriListesi() {
        return musteriListesi;
    }

}
