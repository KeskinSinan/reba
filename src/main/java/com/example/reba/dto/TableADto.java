package com.example.reba.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableADto {
    private Integer neckScore;
    private Integer trunkScore;
    private Integer legScore;
    private String tableAOption;
    private Boolean shockOrRapid;
}
