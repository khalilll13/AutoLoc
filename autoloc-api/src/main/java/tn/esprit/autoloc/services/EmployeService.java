package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Employe;
import tn.esprit.autoloc.repositories.EmployeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeService implements IEmployeService {
    EmployeRepository employeRepository;

    @Override
    public Employe AddEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe UpdateEmploye(Employe employe) {
            return employeRepository.save(employe);
    }

    @Override
    public void DeleteEmploye(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public List<Employe> GetAllEmployes() {
        return employeRepository.findAll();
    }

    @Override
    public Employe GetEmployeById(Long id) {
        return employeRepository.findById(id).orElse(null);
    }
}
