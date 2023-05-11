package com.example.reba.repository;

import com.example.reba.entity.TableC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TableCRepository extends JpaRepository<TableC, Long> {
    @Query(value = "select score_c from table_c where score_a=:scoreA and score_b=:scoreB", nativeQuery = true)
    Integer getTableCScore(Integer scoreA, Integer scoreB);
}
