package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule AddVehicule(Vehicule vehicule);

    Vehicule UpdateVehicule(Vehicule vehicule);

    void DeleteVehicule(Long id);

    List<Vehicule> GetAllVehicules();

    Vehicule GetVehiculeById(Long id);

    Vehicule affecterEquipementAVehicule(Long idEquipement, Long idVehicule);
}
