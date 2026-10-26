package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Equipement;
import tn.esprit.autoloc.entities.Vehicule;
import tn.esprit.autoloc.repositories.EquipementRepository;
import tn.esprit.autoloc.repositories.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeService implements IVehiculeService {
    VehiculeRepository vehiculeRepository;
    EquipementRepository equipementRepository;

    @Override
    public Vehicule AddVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule UpdateVehicule(Vehicule vehicule) {
            return vehiculeRepository.save(vehicule);
    }

    @Override
    public void DeleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public List<Vehicule> GetAllVehicules() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule GetVehiculeById(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public Vehicule affecterEquipementAVehicule(Long idEquipement, Long idVehicule) {
        Vehicule vehicule = vehiculeRepository.findById(idVehicule).get();
        Equipement equipement = equipementRepository.findById(idEquipement).get();
        // Equipement est le côté propriétaire (Vehicule a mappedBy) : c'est lui qui écrit la table de jointure
        equipement.getVehicules().add(vehicule);
        vehicule.getEquipements().add(equipement);
        equipementRepository.save(equipement);
        return vehicule;
    }
}
