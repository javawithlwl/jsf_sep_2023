package com.careerit.helloworld.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "player")
public class Player {

    @Id
    private long id;
    private String name;
    private String role;
    private String country;
    private double amount;
    private String team;
}
