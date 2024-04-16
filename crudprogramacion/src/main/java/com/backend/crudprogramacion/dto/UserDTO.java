package com.backend.crudprogramacion.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    @Id
    private Long idUser;
    private String name;
    private String email;
    private Date birthdate;
}
