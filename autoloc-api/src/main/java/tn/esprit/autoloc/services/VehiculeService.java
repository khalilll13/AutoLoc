package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Vehicule;
import tn.esprit.autoloc.repositories.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeService implements IVehiculeService {
    VehiculeRepository vehiculeRepository;

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
}
