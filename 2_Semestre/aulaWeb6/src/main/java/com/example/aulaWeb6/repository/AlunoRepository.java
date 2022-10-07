/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.aulaWeb6.repository;

import com.example.aulaWeb6.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author taniabasso
 */
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
    
}
