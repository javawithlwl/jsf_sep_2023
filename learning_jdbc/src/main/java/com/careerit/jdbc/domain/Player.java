package com.careerit.jdbc.domain;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Player {
    private long id;
    private String name;
    private String role;
    private String country;
    private double amount;
    private String team;
}


