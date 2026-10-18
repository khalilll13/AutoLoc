package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Paiement;
import tn.esprit.autoloc.services.IPaiementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementRestController {
    IPaiementService paiementService;

    @PostMapping("/add")
    public Paiement addPaiement(@RequestBody Paiement p) {
        return paiementService.AddPaiement(p);
    }

    @PostMapping("/update/{idPaiement}")
    public Paiement updatePaiement(@PathVariable Long idPaiement, @RequestBody Paiement p) {
        p.setIdPaiement(idPaiement);
        return paiementService.UpdatePaiement(p);
    }

    @DeleteMapping("/delete/{idPaiement}")
    public void deletePaiement(@PathVariable Long idPaiement) {
        paiementService.DeletePaiement(idPaiement);
    }

    @GetMapping("/getAll")
    public List<Paiement> getAllPaiements() {
        return paiementService.GetAllPaiements();
    }

    @GetMapping("/get/{idPaiement}")
    public Paiement getPaiementById(@PathVariable Long idPaiement) {
        return paiementService.GetPaiementById(idPaiement);
    }
}
