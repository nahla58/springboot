package esprit.tn.projet1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;

    private String nomUniversite;

    private String adresse;
    @OneToOne(mappedBy = "universite", cascade = CascadeType.ALL, orphanRemoval = true)
    private foyer foyer;
}

