package esprit.tn.projet1.repository;

import esprit.tn.projet1.entity.Bloc;
import esprit.tn.projet1.entity.chambre;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository

public interface chambrerepository  extends JpaRepository<chambre, Long>{
}
