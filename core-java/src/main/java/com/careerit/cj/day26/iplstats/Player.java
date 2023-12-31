package com.careerit.cj.day26.iplstats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private String name;
    private String role;
    @JsonProperty("team_name")
    private String teamName;
    private double amount;
}
