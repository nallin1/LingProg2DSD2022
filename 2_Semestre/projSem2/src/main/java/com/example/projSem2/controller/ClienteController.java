package com.example.projSem2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projSem2.model.Cliente;
import com.example.projSem2.repository.ClienteRepository;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping(value = "/apiCliente")
public class ClienteController {
    @Autowired
    ClienteRepository clienteRepo;

    @GetMapping("/listarClientes")
    public List<Cliente> listarClientes() {
        return clienteRepo.findAll();
    }

    @PostMapping("/cadastrarClientes")
    public void cadastrarClientes(@RequestBody Cliente cliente) {
        clienteRepo.save(cliente);
    }

    // busca de clientes por código, por nome e por e-mail;

    @GetMapping("/buscarClienteCodigo/{codigo}")
    public Optional<Cliente> buscarClienteCodigo(@PathVariable(value = "codigo") int codigo) {
        return clienteRepo.findById(codigo);
    }

    @GetMapping("/buscarClientesNome/{nome}")
    public List<Cliente> buscarClientesNome(@PathVariable(value = "nome") String nome) {
        return clienteRepo.findByNome(nome);
    }

    @GetMapping("/buscarClientesEmail")
    public List<Cliente> buscarClientesEmail(@PathVariable(value = "email") String email) {
        return clienteRepo.findByEmail(email);
    }

}
