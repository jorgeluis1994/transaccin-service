package com.bank.canal.services.infrastructure.adapter.persistence;

import java.util.Optional;
import org.springframework.stereotype.Repository;

import com.bank.canal.services.domain.model.Client;
import com.bank.canal.services.domain.port.ClientRepository;
import com.bank.canal.services.infrastructure.adapter.persistence.mapper.ClientPersistenceMapper;
import com.bank.canal.services.infrastructure.adapter.persistence.repository.DataClientRepository;

import lombok.RequiredArgsConstructor; 

@Repository
@RequiredArgsConstructor 
public class ClientRepositoryAdapter implements ClientRepository {

    private final DataClientRepository repository;
    private final ClientPersistenceMapper mapper;

    @Override
    public Client saveClient(Client client) {
   
        var entity = mapper.toEntity(client);

        // 2. Guardas en la base de datos
        var savedEntity = repository.save(entity);

        // 3. Traduces de vuelta a Dominio para responder
        return mapper.toDomain(savedEntity);
    }

    @Override
    public Optional<Client> findClientById(Long id) {
        // Buscas en la DB y si existe, lo traduces a Dominio
        return repository.findById(id)
                .map(mapper::toDomain);
    }
}
