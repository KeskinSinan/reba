package com.example.reba.repository;

import com.example.reba.entity.TableB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TableBRepository extends JpaRepository<TableB, Long> {
    @Query(value = "select score from table_b where lower_arm=:lowerArm and upper_arm=:upperArm and wrist=:wrist", nativeQuery = true)
    Integer getTableBPostureScore(Integer lowerArm,Integer upperArm, Integer wrist);
}
