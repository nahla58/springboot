package esprit.tn.projet1.service;

import esprit.tn.projet1.entity.chambre;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public interface IchambreService {

    public List<chambre> retrieveAllChambres();
    public chambre retrieveChambre(Long chambreId);
    public chambre addChambre(chambre c);
    public void removeChambre(Long idChambre);
    public chambre modifyChambre(chambre chambre);
    public void chambre() ;
}
