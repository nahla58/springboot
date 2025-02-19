package esprit.tn.projet1.service;

import esprit.tn.projet1.entity.chambre;
import esprit.tn.projet1.repository.chambrerepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

@RequiredArgsConstructor
public class chambreserviceImpl implements IchambreService {

@Autowired
     chambrerepository chambrerepository;

    @Override
    public List<chambre> retrieveAllChambres() {
        return chambrerepository.findAll();
    }

    @Override
    public chambre retrieveChambre(Long chambreId) {
        return chambrerepository.findById(chambreId).orElse(null);
    }

    @Override
    public chambre addChambre(chambre chambre) {
        return chambrerepository.save(chambre);
    }

    @Override
    public void removeChambre(Long chambreId) {
        chambrerepository.deleteById(chambreId);
    }

    @Override
    public chambre modifyChambre(chambre chambre) {
        return chambrerepository.save(chambre);
    }

    @Override
    public void chambre() {

    }
}
