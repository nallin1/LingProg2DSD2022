package com.example.projSem2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.projSem2.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByNome(String nome);

    List<Cliente> findByEmail(String email);

    @Query(value = "SELECT c from Cliente c where c.nome like %?1%")
    Optional<Cliente> findByInicial(String inicial);

    @Query(value = "SELECT c from Cliente c where c.codigo > ?1")
    List<Cliente> findByClienteMaiorQue(int codigo);

    @Query(value = "SELECT c FROM Cliente c where c.email like %?1%")
    Optional<Cliente> findByInicialEmail(String email);

    @Query(value = "SELECT c FROM Cliente c where c.nome like %?1% and c.email like %?1%")
    List<Cliente> findByInicialNomeEmail(String nome, String email);

}
