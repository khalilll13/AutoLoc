package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Employe;

import java.util.List;

public interface IEmployeService {
    Employe AddEmploye(Employe employe);

    Employe UpdateEmploye(Employe employe);

    void DeleteEmploye(Long id);

    List<Employe> GetAllEmployes();

    Employe GetEmployeById(Long id);
}
