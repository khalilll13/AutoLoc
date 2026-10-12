package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Client;
import tn.esprit.autoloc.repositories.ClientRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements IClientService {
    ClientRepository clientRepository;

    @Override
    public Client AddClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client UpdateClient(Client client) {
            return clientRepository.save(client);
    }

    @Override
    public void DeleteClient(Long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public List<Client> GetAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client GetClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }
}
