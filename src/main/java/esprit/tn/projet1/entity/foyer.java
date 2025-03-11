package esprit.tn.projet1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;

    private String nomFoyer;

    private Long capaciteFoyer;

    @OneToOne
    @JoinColumn(name = "idUniversite", unique = true, nullable = false)
    private universite universite;

    public Collection<Bloc> getbloc() {
        return java.util.List.of();
    }


}
