package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.repositories.ContratRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContratService {
    ContratRepository contratRepository;

    @Override
    public Contrat AddContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat UpdateContrat(Contrat contrat) {
            return contratRepository.save(contrat);
    }

    @Override
    public void DeleteContrat(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public List<Contrat> GetAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat GetContratById(Long id) {
        return contratRepository.findById(id).orElse(null);
    }
}
