package com.example.exApi2110.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exApi2110.model.Cliente;
import com.example.exApi2110.repository.ClienteRepository;
import java.util.List;

@RestController
@RequestMapping(value = "/apiClienteFloricultura")
public class ClienteController {
    @Autowired
    ClienteRepository clienteRep;

    @GetMapping(value = "/buscarClientes")
    public List<Cliente> buscarClientes() {
        return clienteRep.findAll();
    }
}
