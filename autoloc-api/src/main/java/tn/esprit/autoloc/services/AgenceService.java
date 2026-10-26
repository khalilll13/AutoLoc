package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.entities.Vehicule;
import tn.esprit.autoloc.repositories.AgenceRepository;
import tn.esprit.autoloc.repositories.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService {
    AgenceRepository agenceRepository;
    VehiculeRepository vehiculeRepository;

    @Override
    public Agence AddAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence UpdateAgence(Agence agence) {
            return agenceRepository.save(agence);
    }

    @Override
    public void DeleteAgence(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public List<Agence> GetAllAgences() {
        return agenceRepository.findAll();
    }

    @Override
    public Agence GetAgenceById(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public Agence affecterVehiculeAAgence(Long idVehicule, Long idAgence){
        Agence agence = agenceRepository.findById(idAgence).get();
        Vehicule vehicule =vehiculeRepository.findById(idVehicule).get();
        vehicule.setAgence(agence);
        vehiculeRepository.save(vehicule);
        return agence;
    }
    @Override
    public void desaffecterVehiculeDAgence(Long idVehicule){
        Vehicule vehicule =vehiculeRepository.findById(idVehicule).get();
        vehicule.setAgence(null);
        vehiculeRepository.save(vehicule);
    }
}
