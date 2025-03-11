package esprit.tn.projet1.service;


import esprit.tn.projet1.entity.Bloc;
import esprit.tn.projet1.entity.foyer;
import esprit.tn.projet1.repository.blocrepository;
import esprit.tn.projet1.repository.foyerrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class foyerserviceImpl implements IfoyerService {
    @Autowired
    foyerrepository foyerepository;

    @Autowired
    blocrepository blocRepository;

    // 1️⃣ Créer un Bloc et son Foyer en même temps
    public foyer createFoyerWithBloc(foyer foyer, Bloc bloc) {
        bloc.setFoyer(foyer);
        foyer.getbloc().add(bloc);
        return foyerepository.save(foyer);
    }

    // 2️⃣ Affecter un Bloc à un Foyer (les deux existent déjà)
    public void assignBlocToFoyer(Long blocId, Long foyerId) {
        Bloc bloc = blocRepository.findById(blocId)
                .orElseThrow(() -> new NoSuchElementException("Bloc non trouvé"));
        foyer foyer = foyerepository.findById(foyerId)
                .orElseThrow(() -> new NoSuchElementException("Foyer non trouvé"));

        bloc.setFoyer(foyer);
        foyer.getbloc().add(bloc);
        blocRepository.save(bloc);
    }

    // 3️⃣ Désaffecter un Bloc de son Foyer
    public void removeBlocFromFoyer(Long blocId) {
        Bloc bloc = blocRepository.findById(blocId)
                .orElseThrow(() -> new NoSuchElementException("Bloc non trouvé"));

        if (bloc.getFoyer() != null) {
            bloc.setFoyer(null);
            blocRepository.save(bloc);
        }
    }
}
