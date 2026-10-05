package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement AddPaiement(Paiement paiement);

    Paiement UpdatePaiement(Paiement paiement);

    void DeletePaiement(Long id);

    List<Paiement> GetAllPaiements();
}
