package com.example.reba.repository;

import com.example.reba.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DemoRepository extends JpaRepository<Demo, Long> {
}
