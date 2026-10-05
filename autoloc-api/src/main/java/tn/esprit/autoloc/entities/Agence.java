package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;
    private String nom;
    private String ville;
    private String adresse;
    private String telephone;
    @OneToMany (cascade = CascadeType.ALL, mappedBy = "agence")
    private Set<Employe> Employes;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "agence")
    private Set<Vehicule> Vehicules;

}
