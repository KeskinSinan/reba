package com.example.reba.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculationDto {
    private String option;
    private Boolean additionScore1;
    private Boolean additionScore2;
}
