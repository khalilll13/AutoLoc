package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Maintenance;
import tn.esprit.autoloc.services.IMaintenanceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceRestController {
    IMaintenanceService maintenanceService;

    @PostMapping("/add")
    public Maintenance addMaintenance(@RequestBody Maintenance m) {
        return maintenanceService.AddMaintenance(m);
    }

    @PostMapping("/update/{idMaintenance}")
    public Maintenance updateMaintenance(@PathVariable Long idMaintenance, @RequestBody Maintenance m) {
        m.setIdMaintenance(idMaintenance);
        return maintenanceService.UpdateMaintenance(m);
    }

    @DeleteMapping("/delete/{idMaintenance}")
    public void deleteMaintenance(@PathVariable Long idMaintenance) {
        maintenanceService.DeleteMaintenance(idMaintenance);
    }

    @GetMapping("/getAll")
    public List<Maintenance> getAllMaintenances() {
        return maintenanceService.GetAllMaintenances();
    }

    @GetMapping("/get/{idMaintenance}")
    public Maintenance getMaintenanceById(@PathVariable Long idMaintenance) {
        return maintenanceService.GetMaintenanceById(idMaintenance);
    }
}
