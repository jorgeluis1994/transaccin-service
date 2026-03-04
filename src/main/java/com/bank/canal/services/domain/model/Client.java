package com.bank.canal.services.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Esto crea Getters, Setters, toString, equals y hashCode automáticamente
@Builder // Te permite usar Client.builder()...
@AllArgsConstructor // Crea el constructor con todos los campos
@NoArgsConstructor  // ¡VITAL! Crea el constructor vacío que necesita Spring/Jackson
public class Client {
    private Long id;
    private String name;
    private String email;

    // Puedes mantener tu validación manual si quieres, 
    // pero @Data y @NoArgsConstructor deben estar ahí.
}
