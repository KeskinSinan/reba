package com.example.reba.repository;

import com.example.reba.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
    @Query(value = "select id from login where course_code=:courseCode and section_number=:sectionNumber", nativeQuery = true)
    Long loginCheck(String courseCode, Integer sectionNumber);
}
