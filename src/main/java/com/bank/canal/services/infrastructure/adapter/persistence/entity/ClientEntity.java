package com.bank.canal.services.infrastructure.adapter.persistence.entity;

import jakarta.persistence.*;
import lombok.*; // Importa todo lo de Lombok

@Entity
@Table(name = "clients")
@Getter                 // Genera los get...()
@Setter                 // Genera los set...()
@NoArgsConstructor      // Constructor vacío para Hibernate (Obligatorio)
@AllArgsConstructor     // Constructor con todos los campos
@Builder                // Permite crear objetos con ClientEntity.builder()...
public class ClientEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;
}
