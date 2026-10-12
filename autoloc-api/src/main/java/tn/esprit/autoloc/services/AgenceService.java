package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.repositories.AgenceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService {
    AgenceRepository agenceRepository;

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
}
