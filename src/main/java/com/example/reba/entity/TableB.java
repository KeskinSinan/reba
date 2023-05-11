package com.example.reba.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "table_b")
public class TableB implements Serializable {
    @Column(name = "lower_arm")
    private Integer neck;
    @Column(name = "upper_arm")
    private Integer trunk;
    @Column(name = "wrist")
    private Integer legs;
    @Column(name = "score")
    private Integer score;
    @Id
    private Long id;
}
