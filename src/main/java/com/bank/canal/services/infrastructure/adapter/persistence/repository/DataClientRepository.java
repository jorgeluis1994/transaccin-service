package com.bank.canal.services.infrastructure.adapter.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.canal.services.infrastructure.adapter.persistence.entity.ClientEntity;

public interface DataClientRepository extends JpaRepository<ClientEntity, Long> {

}