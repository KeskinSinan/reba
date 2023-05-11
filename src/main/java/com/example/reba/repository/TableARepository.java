package com.example.reba.repository;

import com.example.reba.entity.TableA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TableARepository extends JpaRepository<TableA,Long> {
    @Query(value = "select score from public.table_a ta where ta.neck=:neck and ta.trunk=:trunk and ta.legs=:legs", nativeQuery = true)
    Integer getTableAPostureScore(Integer neck, Integer trunk, Integer legs);
}
