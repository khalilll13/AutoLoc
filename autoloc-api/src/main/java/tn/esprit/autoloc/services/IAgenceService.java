package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Agence;

import java.util.List;

public interface IAgenceService {
    Agence AddAgence (Agence agence);

    Agence UpdateAgence (Agence agence);

    void DeleteAgence (Long id);

    List<Agence> GetAllAgences ();

    Agence GetAgenceById(Long id);
}
