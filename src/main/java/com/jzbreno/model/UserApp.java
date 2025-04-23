package com.jzbreno.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Data
public class UserApp {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String nome;
    @Column(unique = true)
    private String email;

    public Long getId() {
        return id;
    }
}
