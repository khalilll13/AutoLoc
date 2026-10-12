package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Equipement;

import java.util.List;

public interface IEquipementService {
    Equipement AddEquipement(Equipement equipement);

    Equipement UpdateEquipement(Equipement equipement);

    void DeleteEquipement(Long id);

    List<Equipement> GetAllEquipements();

    Equipement GetEquipementById(Long id);
}
