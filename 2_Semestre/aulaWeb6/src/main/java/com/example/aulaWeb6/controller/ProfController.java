package com.example.aulaWeb6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aulaWeb6.repository.*;
import com.example.aulaWeb6.model.*;

import java.util.Optional;
import java.util.List;

@RestController
@RequestMapping(value = "/apiProfessor")
public class ProfController {

    @Autowired
    ProfessorRepository profRepo;

    @GetMapping(value = "/professores")
    public List<Professor> listarProfessores() {
        return profRepo.findAll();
    }

    @GetMapping(value = "/professores/{matricula}")
    public Optional<Professor> buscarProfMatricula(@PathVariable(value = "matricula") int matricula) {
        return profRepo.findById(matricula);
    }
}
