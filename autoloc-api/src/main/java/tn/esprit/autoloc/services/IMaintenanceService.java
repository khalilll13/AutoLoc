package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance AddMaintenance(Maintenance maintenance);

    Maintenance UpdateMaintenance(Maintenance maintenance);

    void DeleteMaintenance(Long id);

    List<Maintenance> GetAllMaintenances();
}
