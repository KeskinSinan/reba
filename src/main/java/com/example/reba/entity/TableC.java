package com.example.reba.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "table_c")
public class TableC implements Serializable {
    @Id
    private Long id;
    @Column(name = "score_a")
    private Integer scoreA;
    @Column(name = "score_b")
    private Integer scoreB;
    @Column(name = "score_c")
    private Integer scoreC;
}
