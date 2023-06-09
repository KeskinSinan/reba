package com.example.reba.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "table_a")
public class TableA implements Serializable {
    @Column(name = "neck")
    private Integer neck;
    @Column(name = "trunk")
    private Integer trunk;
    @Column(name = "legs")
    private Integer legs;
    @Column(name = "score")
    private Integer score;
    @Id
    private Long id;
}
