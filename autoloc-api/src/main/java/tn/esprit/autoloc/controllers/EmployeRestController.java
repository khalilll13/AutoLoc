package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Employe;
import tn.esprit.autoloc.services.IEmployeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employe")
public class EmployeRestController {
    IEmployeService employeService;

    @PostMapping("/add")
    public Employe addEmploye(@RequestBody Employe e) {
        return employeService.AddEmploye(e);
    }

    @PostMapping("/update/{idEmploye}")
    public Employe updateEmploye(@PathVariable Long idEmploye, @RequestBody Employe e) {
        e.setIdEmploye(idEmploye);
        return employeService.UpdateEmploye(e);
    }

    @DeleteMapping("/delete/{idEmploye}")
    public void deleteEmploye(@PathVariable Long idEmploye) {
        employeService.DeleteEmploye(idEmploye);
    }

    @GetMapping("/getAll")
    public List<Employe> getAllEmployes() {
        return employeService.GetAllEmployes();
    }

    @GetMapping("/get/{idEmploye}")
    public Employe getEmployeById(@PathVariable Long idEmploye) {
        return employeService.GetEmployeById(idEmploye);
    }
}
