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

@RestController
@RequestMapping(value = "/apiCliente")
public class ClienteController {
    @Autowired
    ClienteRepository clienteRepo;

    @GetMapping(value = "/listarClientes")
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

    @GetMapping("/buscarClientesEmail/{email}")
    public List<Cliente> buscarClientesEmail(@PathVariable(value = "email") String email) {
        return clienteRepo.findByEmail(email);
    }

    // busca de clientes por parte inicial do nome;

    @GetMapping("/buscarClienteInicial/{inicial}")
    public Optional<Cliente> buscarClienteInicial(@PathVariable(value = "inicial") String inicial) {
        return clienteRepo.findByInicial(inicial);
    }

    // busca de clientes com código maior que algum informado

    @GetMapping("/buscarClienteCodMaiorQue/{codigo}")
    public List<Cliente> buscarClienteCodMaiorQue(@PathVariable(value = "codigo") int codigo) {
        return clienteRepo.findByClienteMaiorQue(codigo);
    }

    // busca de clientes por parte inicial do e-mail
    @GetMapping("/buscaInicialEmail/{email}")
    public Optional<Cliente> buscaInicialEmail(@PathVariable(value = "email") String email) {
        return clienteRepo.findByInicialEmail(email);
    }

    // busca de clientes com parte inicial do nome e parte inicial do e-mail
    // informados


    // - busca de clientes com parte inicial do nome e parte inicial do e-mail informados
    @GetMapping("/buscaInicialNomeEmail/{nome}/{email}")
    public List<Cliente> buscaInicialNomeEmail(@PathVariable("nome") String nome, @PathVariable("email") String email) {
        return clienteRepo.findByInicialNomeEmail(nome, email);
    }
}
