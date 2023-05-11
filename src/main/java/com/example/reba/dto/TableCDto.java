package com.example.reba.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TableCDto {
    private Integer tableAScore;
    private Integer tableBScore;
    private Boolean tableCOption1;
    private Boolean tableCOption2;
    private Boolean tableCOption3;
}
