package com.example.reba.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableBDto {
    private Integer upperArmScore;
    private Integer lowerArmScore;
    private Integer wristScore;
    private String tableBOption;
}
