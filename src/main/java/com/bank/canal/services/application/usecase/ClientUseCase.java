package com.bank.canal.services.application.usecase;

import com.bank.canal.services.domain.model.Client;
import com.bank.canal.services.domain.port.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service // Esto lo hace un Bean de Spring
@RequiredArgsConstructor
public class ClientUseCase {

    private final ClientRepository clientRepository; // Inyecta la interfaz del dominio

    public Client createClient(Client client) {
        // Aquí podrías poner reglas de negocio (ej: validar si el email ya existe)
        return clientRepository.saveClient(client);
    }

    public Optional<Client> getClient(Long id) {
        return clientRepository.findClientById(id);
    }
}
