package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Paiement;
import tn.esprit.autoloc.repositories.PaiementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementService implements IPaiementService {
    PaiementRepository paiementRepository;

    @Override
    public Paiement AddPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement UpdatePaiement(Paiement paiement) {
            return paiementRepository.save(paiement);
    }

    @Override
    public void DeletePaiement(Long id) {
        paiementRepository.deleteById(id);
    }

    @Override
    public List<Paiement> GetAllPaiements() {
        return paiementRepository.findAll();
    }

    @Override
    public Paiement GetPaiementById(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }
}
