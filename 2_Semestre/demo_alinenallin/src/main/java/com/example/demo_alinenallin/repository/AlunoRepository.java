package com.example.demo_alinenallin.repository;

import com.example.demo_alinenallin.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
}
