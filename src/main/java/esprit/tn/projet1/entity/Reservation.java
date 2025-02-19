package esprit.tn.projet1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {
    @Id
    private String idReservation;

    @Temporal(TemporalType.DATE)
    private Date anneeUniversitaire;

    private Boolean estValide;

    @ManyToOne
    @JoinColumn(name = "etudiant_id") // Associe un étudiant à chaque réservation
    private Etudiant etudiant;

    // Relation ManyToMany avec Chambre
    @ManyToMany
    @JoinTable(
            name = "reservation_chambre", // Nom de la table de jonction
            joinColumns = @JoinColumn(name = "idReservation"), // Clé étrangère vers Reservation
            inverseJoinColumns = @JoinColumn(name = "idChambre") // Clé étrangère vers Chambre
    )
    private List<chambre> chambres = new ArrayList<>(); // Liste de chambres associées à cette réservation

    // Si vous avez également une relation ManyToMany avec les étudiants (optionnel)
    @ManyToMany
    @JoinTable(
            name = "reservation_etudiant",
            joinColumns = @JoinColumn(name = "idReservation"),
            inverseJoinColumns = @JoinColumn(name = "idEtudiant")
    )
    private List<Etudiant> etudiants = new ArrayList<>(); // Optionnel pour la relation many-to-many avec Etudiant
}
