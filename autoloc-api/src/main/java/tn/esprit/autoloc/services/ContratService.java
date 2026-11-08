package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.entities.Paiement;
import tn.esprit.autoloc.repositories.ContratRepository;
import tn.esprit.autoloc.repositories.PaiementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements IContratService {
    ContratRepository contratRepository;
    PaiementRepository paiementRepository;

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

    @Override
    public Void affecterPaiementAContrat(Long idPaiement, Long idContrat) {
        Contrat contrat = contratRepository.findById(idContrat).get();
        Paiement paiement = paiementRepository.findById(idPaiement).get();
        contrat.getPaiements().add(paiement);
        contratRepository.save(contrat);
        paiement.setContrat(contrat);
        paiementRepository.save(paiement);
        return null;
    }

    @Override
    public Void desaffecterPaiementAContrat(Long idPaiement, Long idContrat) {
        Contrat contrat = contratRepository.findById(idContrat).get();
        Paiement paiement = paiementRepository.findById(idPaiement).get();
        contrat.getPaiements().remove(paiement);
        contratRepository.save(contrat);
        paiement.setContrat(null);
        paiementRepository.save(paiement);
        return null;
    }
}
