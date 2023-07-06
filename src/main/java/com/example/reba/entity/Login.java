package com.example.reba.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "login")
public class Login implements Serializable {
    @Id
    private Long id;
    @Column(name = "course_code")
    private String courseCode;
    @Column(name = "section_number")
    private Integer sectionNumber;
}
