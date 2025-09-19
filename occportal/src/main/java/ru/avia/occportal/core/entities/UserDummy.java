package ru.avia.occportal.core.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Egor
 * @name UserDammy
 * @date 19.09.2025
 */
@Entity
@Data
//@Table(name = "users")
public class UserDummy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column
    private LocalDateTime updatedAt = LocalDateTime.now();
}
