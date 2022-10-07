package com.example.aulaWeb6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.aulaWeb6.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

}