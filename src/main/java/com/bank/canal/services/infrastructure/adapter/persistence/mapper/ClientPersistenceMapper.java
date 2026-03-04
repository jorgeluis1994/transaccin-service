package com.bank.canal.services.infrastructure.adapter.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import com.bank.canal.services.domain.model.Client;
import com.bank.canal.services.infrastructure.adapter.persistence.entity.ClientEntity;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ClientPersistenceMapper {

    // Convierte el modelo de negocio (Domain) a lo que entiende la DB (Entity)
    ClientEntity toEntity(Client domain);

    // Convierte lo que viene de la DB (Entity) al modelo de negocio (Domain)
    Client toDomain(ClientEntity entity);

}
