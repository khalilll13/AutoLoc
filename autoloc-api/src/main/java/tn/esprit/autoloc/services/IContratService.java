package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Contrat;

import java.util.List;

public interface IContratService {
    Contrat AddContrat(Contrat contrat);

    Contrat UpdateContrat(Contrat contrat);

    void DeleteContrat(Long id);

    List<Contrat> GetAllContrats();

    Contrat GetContratById(Long id);
}
