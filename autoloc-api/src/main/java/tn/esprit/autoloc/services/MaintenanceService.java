package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Maintenance;
import tn.esprit.autoloc.repositories.MaintenanceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceService implements IMaintenanceService {
    MaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance AddMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance UpdateMaintenance(Maintenance maintenance) {
            return maintenanceRepository.save(maintenance);
    }

    @Override
    public void DeleteMaintenance(Long id) {
        maintenanceRepository.deleteById(id);
    }

    @Override
    public List<Maintenance> GetAllMaintenances() {
        return maintenanceRepository.findAll();
    }
}
