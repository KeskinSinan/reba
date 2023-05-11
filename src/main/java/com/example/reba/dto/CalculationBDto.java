package com.example.reba.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculationBDto {
    private String option;
    private Boolean additionScore1;
    private Boolean additionScore2;
    private Boolean additionScore3;
}
