package com.example.exApi2110.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exApi2110.model.Flor;
import com.example.exApi2110.repository.FlorRepository;
import java.util.List;

@RestController
@RequestMapping(value = "/apiFlorFloricultura")
public class FlorController {

    @Autowired
    FlorRepository florRep;

    @GetMapping(value = "/buscarFlor")
    public List<Flor> buscarFlores() {
        return florRep.findAll();
    }

    @PostMapping("/cadastrarFlor")
    public void cadastrarFlor(@RequestBody Flor flor) {
        florRep.save(flor);
    }
}