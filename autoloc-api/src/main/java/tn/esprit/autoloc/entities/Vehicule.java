package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.autoloc.entities.enumerations.CategorieVehicule;
import tn.esprit.autoloc.entities.enumerations.StatutVehicule;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;
    private String immatriculation;
    private String marque;
    private String modele;
    private CategorieVehicule categorie;
    private BigDecimal tarifJournalier;
    private StatutVehicule statut;

    @ManyToOne
    Agence agence;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "vehicule")
    private Set<Reservation> Reservations;

    @ManyToMany(mappedBy = "vehicules", cascade = CascadeType.ALL)
    private Set<Equipement> equipements;
}
