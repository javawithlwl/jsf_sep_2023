package com.careerit.iplstats.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
        private long id;
        private String name;
        private String role;
        private String team;
        private String country;
        private double amount;
}
