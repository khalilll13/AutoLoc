package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Client;

import java.util.List;

public interface IClientService {
    Client AddClient (Client client);

    Client UpdateClient (Client client);

    void DeleteClient (Long id);

    List<Client> GetAllClients ();

    Client GetClientById(Long id);
}
