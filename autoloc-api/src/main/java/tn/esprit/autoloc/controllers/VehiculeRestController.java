package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Vehicule;
import tn.esprit.autoloc.services.IVehiculeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeRestController {
    IVehiculeService vehiculeService;

    @PostMapping("/add")
    public Vehicule addVehicule(@RequestBody Vehicule v) {
        return vehiculeService.AddVehicule(v);
    }

    @PostMapping("/update/{idVehicule}")
    public Vehicule updateVehicule(@PathVariable Long idVehicule, @RequestBody Vehicule v) {
        v.setIdVehicule(idVehicule);
        return vehiculeService.UpdateVehicule(v);
    }

    @DeleteMapping("/delete/{idVehicule}")
    public void deleteVehicule(@PathVariable Long idVehicule) {
        vehiculeService.DeleteVehicule(idVehicule);
    }

    @GetMapping("/getAll")
    public List<Vehicule> getAllVehicules() {
        return vehiculeService.GetAllVehicules();
    }

    @GetMapping("/get/{idVehicule}")
    public Vehicule getVehiculeById(@PathVariable Long idVehicule) {
        return vehiculeService.GetVehiculeById(idVehicule);
    }
    @PutMapping("/affecterEquipementAVehicule/{idEquipement}/{idVehicule}")
    public Vehicule affecterEquipementAVehicule(@PathVariable Long idEquipement, @PathVariable Long idVehicule) {
        return vehiculeService.affecterEquipementAVehicule(idEquipement, idVehicule);
    }
}
