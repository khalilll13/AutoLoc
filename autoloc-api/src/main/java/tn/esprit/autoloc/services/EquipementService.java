package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Equipement;
import tn.esprit.autoloc.repositories.EquipementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementService implements IEquipementService {
    EquipementRepository equipementRepository;

    @Override
    public Equipement AddEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement UpdateEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public void DeleteEquipement(Long id) {
        equipementRepository.deleteById(id);
    }

    @Override
    public List<Equipement> GetAllEquipements() {
        return equipementRepository.findAll();
    }

    @Override
    public Equipement GetEquipementById(Long id) {
        return equipementRepository.findById(id).orElse(null);
    }
}
