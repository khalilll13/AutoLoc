package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Equipement;
import tn.esprit.autoloc.services.IEquipementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementRestController {
    IEquipementService equipementService;

    @PostMapping("/add")
    public Equipement addEquipement(@RequestBody Equipement e) {
        return equipementService.AddEquipement(e);
    }

    @PostMapping("/update/{idEquipement}")
    public Equipement updateEquipement(@PathVariable Long idEquipement, @RequestBody Equipement e) {
        e.setIdEquipement(idEquipement);
        return equipementService.UpdateEquipement(e);
    }

    @DeleteMapping("/delete/{idEquipement}")
    public void deleteEquipement(@PathVariable Long idEquipement) {
        equipementService.DeleteEquipement(idEquipement);
    }

    @GetMapping("/getAll")
    public List<Equipement> getAllEquipements() {
        return equipementService.GetAllEquipements();
    }

    @GetMapping("/get/{idEquipement}")
    public Equipement getEquipementById(@PathVariable Long idEquipement) {
        return equipementService.GetEquipementById(idEquipement);
    }
}
