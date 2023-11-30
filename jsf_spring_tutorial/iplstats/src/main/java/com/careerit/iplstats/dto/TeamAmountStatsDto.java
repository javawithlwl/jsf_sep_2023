package com.careerit.iplstats.dto;

import lombok.*;

import java.math.BigDecimal;


@Data
public class TeamAmountStatsDto {
    private String teamName;
    private BigDecimal totalAmount;
}