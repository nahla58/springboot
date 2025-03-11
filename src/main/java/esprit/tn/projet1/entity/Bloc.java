package esprit.tn.projet1.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.List;

@Entity

@AllArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;

    private String nomBloc;

    private Long capaciteBloc;

    @ManyToOne
    private foyer foyer;

    @OneToMany(mappedBy = "bloc", cascade = CascadeType.ALL)
    private List<chambre> chambres;

    public Bloc() {
    }

    // Getters
    public Long getIdBloc() {
        return idBloc;
    }

    public String getNomBloc() {
        return nomBloc;
    }

    public Long getCapaciteBloc() {
        return capaciteBloc;
    }

    public foyer getFoyer() {
        return foyer;
    }

    public List<chambre> getChambres() {
        return chambres;
    }

    // Setters
    public void setIdBloc(Long idBloc) {
        this.idBloc = idBloc;
    }

    public void setNomBloc(String nomBloc) {
        this.nomBloc = nomBloc;
    }

    public void setCapaciteBloc(Long capaciteBloc) {
        this.capaciteBloc = capaciteBloc;
    }

    public void setFoyer(foyer foyer) {
        this.foyer = foyer;
    }

    public void setChambres(List<chambre> chambres) {
        this.chambres = chambres;
    }

}
