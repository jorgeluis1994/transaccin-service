package com.bank.canal.services.domain.port;

import java.util.Optional;

import com.bank.canal.services.domain.model.Client;

public interface ClientRepository {

    Client saveClient(Client client);

    Optional<Client> findClientById(Long id);

}
