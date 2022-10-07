/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.aulaWeb6.controller;

import com.example.aulaWeb6.model.Aluno;
import com.example.aulaWeb6.repository.AlunoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author taniabasso
 */
@RestController
@RequestMapping (value="/apiAluno")
public class AlunoController {
    
    @Autowired
    AlunoRepository alunoRepository;
    
    
    @GetMapping (value="/alunos")
    public List<Aluno> listarAlunos()
    {
        return alunoRepository.findAll();
    }
    
    @GetMapping (value="/alunos/{ra}")
    public Optional<Aluno> listarAlunosPorRA(@PathVariable (value="ra") int ra)
    {
        return alunoRepository.findById(ra);
    }
    
    @CrossOrigin
    @PostMapping("/inserirAluno")
    public void inserirAlunos (@RequestBody Aluno aluno)
    {
        alunoRepository.save(aluno);
    }
}
