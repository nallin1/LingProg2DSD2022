package com.example.exApi2110.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exApi2110.model.Cliente;
import com.example.exApi2110.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/apiClienteFloricultura")
public class ClienteController {
    @Autowired
    ClienteRepository clienteRep;

    @GetMapping(value = "/buscarClientes")
    public List<Cliente> buscarClientes() {
        return clienteRep.findAll();
    }

    @PostMapping("/cadastrarCliente")
    public void cadastrarCliente(@RequestBody Cliente cliente) {
        clienteRep.save(cliente);
    }

    @GetMapping(value = "/buscarClientesId/{id}")
    public Optional<Cliente> buscarClienteId(@PathVariable(value = "id") int id) {
        return clienteRep.findById(id);
    }

    @PostMapping("/inserir")
    public void inserirCliente(@RequestBody Cliente cliente) {
        clienteRep.save(cliente);
    }

    @GetMapping("/buscarClienteNome/{nome}")
    public List<Cliente> listarPorNome(@PathVariable(value = "nome") String nome) {
        return clienteRep.findByNome(nome);
    }

    @GetMapping ("/buscarClienteIdadeMaior/{idade}")
    public List<Cliente> listarPorIdadeMaior(@PathVariable(value = "idade") int idade) {
        return clienteRep.findByMaiorIdade(idade);
    }

    @GetMapping("/buscarClienteTrechoContido/{trecho}")
    public List<Cliente> listarPorTrechoContidoNome(@PathVariable(value = "trecho") String trecho) {
        return clienteRep.findByTrechoContido(trecho);
    }

    @GetMapping ("/buscarClienteIdadeMaiorAndNomeTrecho/{trecho}")
    public List<String> buscarClienteIdadeMaiorAndNomeTrecho(@PathVariable (value="trecho") String trecho, int idade) {
        return clienteRep.findByIdadeMaiorAndNomeTrecho(idade, trecho);
    }
}
