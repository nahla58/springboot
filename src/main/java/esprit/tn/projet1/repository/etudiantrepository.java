package esprit.tn.projet1.repository;

import esprit.tn.projet1.entity.Bloc;
import esprit.tn.projet1.entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface etudiantrepository  extends JpaRepository<Etudiant, Long> {
}
