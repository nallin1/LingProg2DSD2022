package com.example.demo_alinenallin.controller;

import com.example.demo_alinenallin.model.Aluno;
import com.example.demo_alinenallin.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value="/apiAluno")
public class AlunoController {

    @Autowired
    AlunoRepository alunorep;

    @GetMapping (value="/buscarAlunos")
    public List<Aluno> buscarTodos(){
        return alunorep.findAll();
    }
    /*
    @PostMapping ("/postAluno")
    public ResponseEntity<Aluno> inserirAluno(@RequestBody Aluno aluno) {
        return alunorep.save(aluno);
    }
    */
}
