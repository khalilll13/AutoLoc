package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.services.IAgenceService;
import tn.esprit.autoloc.services.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientRestController {
    IClientService clientService;

    @PostMapping("/add")
    public Client addClient(@RequestBody Client c) {
        return clientService.AddClient(c);
    }

    @PostMapping("/update/{idClient}")
    public Client updateClient(@PathVariable Long idClient, @RequestBody Client c) {
        c.setIdClient(idClient);
        return clientService.UpdateClient(c);
    }

    @DeleteMapping("/delete/{idClient}")
    public void deleteClient(@PathVariable Long idClient) {
        clientService.DeleteClient(idClient);
    }

    @GetMapping("/getAll")
    public List<Client> getAllClients() {
        return clientService.GetAllClients();
    }

    @GetMapping("/get/{idClient}")
    public Client getClientById(@PathVariable Long idClient) {
        return clientService.GetClientById(idClient);
    }
}
