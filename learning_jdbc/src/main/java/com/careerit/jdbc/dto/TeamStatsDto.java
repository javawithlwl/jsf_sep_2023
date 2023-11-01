package com.careerit.jdbc.dto;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
@ToString
public class TeamStatsDto {
    private String teamName;
    private int playersCount;
    private double totalAmount;
    private double minAmount;
    private double maxAmount;
    private double avgAmount;
}
