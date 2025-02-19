package esprit.tn.projet1.repository;

import esprit.tn.projet1.entity.Bloc;
import esprit.tn.projet1.entity.universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface universiterepository  extends JpaRepository<universite, Long> {
}
