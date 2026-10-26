package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.services.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceRestController {
    IAgenceService agenceService;

    @PostMapping("/add")
    public Agence addAgence(@RequestBody Agence a) {
        return agenceService.AddAgence(a);
    }

    @PostMapping("/update/{idAgence}")
    public Agence updateAgence(@PathVariable Long idAgence, @RequestBody Agence a) {
        a.setIdAgence(idAgence);
        return agenceService.UpdateAgence(a);
    }

    @DeleteMapping("/delete/{idAgence}")
    public void deleteAgence(@PathVariable Long idAgence) {
        agenceService.DeleteAgence(idAgence);
    }

    @GetMapping("/getAll")
    public List<Agence> getAllAgences() {
        return agenceService.GetAllAgences();
    }

    @GetMapping("/get/{idAgence}")
    public Agence getAgenceById(@PathVariable Long idAgence) {
        return agenceService.GetAgenceById(idAgence);
    }

    @PutMapping("/affecterVehicule/{idVehicule}/{idAgence}")
    public Agence affecterVehiculeAAgence(@PathVariable Long idVehicule, @PathVariable Long idAgence) {
        return agenceService.affecterVehiculeAAgence(idVehicule, idAgence);
    }

    @PutMapping("/desaffecterVehicule/{idVehicule}")
    public void desaffecterVehiculeDAgence(@PathVariable Long idVehicule) {
        agenceService.desaffecterVehiculeDAgence(idVehicule);
    }
}
