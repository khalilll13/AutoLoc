package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.services.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratRestController {
    IContratService contratService;

    @PostMapping("/add")
    public Contrat addContrat(@RequestBody Contrat c) {
        return contratService.AddContrat(c);
    }

    @PostMapping("/update/{idContrat}")
    public Contrat updateContrat(@PathVariable Long idContrat, @RequestBody Contrat c) {
        c.setIdContrat(idContrat);
        return contratService.UpdateContrat(c);
    }

    @DeleteMapping("/delete/{idContrat}")
    public void deleteContrat(@PathVariable Long idContrat) {
        contratService.DeleteContrat(idContrat);
    }

    @GetMapping("/getAll")
    public List<Contrat> getAllContrats() {
        return contratService.GetAllContrats();
    }

    @GetMapping("/get/{idContrat}")
    public Contrat getContratById(@PathVariable Long idContrat) {
        return contratService.GetContratById(idContrat);
    }

    @PutMapping("/affecterPaiement/{idPaiement}/{idContrat}")
    public void affecterPaiementAContrat(@PathVariable Long idPaiement, @PathVariable Long idContrat) {
        contratService.affecterPaiementAContrat(idPaiement, idContrat);
    }

    @PutMapping("/desaffecterPaiement/{idPaiement}/{idContrat}")
    public void desaffecterPaiementAContrat(@PathVariable Long idPaiement, @PathVariable Long idContrat) {
        contratService.desaffecterPaiementAContrat(idPaiement, idContrat);
    }
}
