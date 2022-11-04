package com.example.exApi2110.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.exApi2110.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

  public List<Cliente> findByNome(String nome);
  
  @Query( value="select c from Cliente c where c.idade > ?1")
  public List<Cliente> findByMaiorIdade(int idade);

  @Query (value = "SELECT c from Cliente c where c.nome like %?1%") // INSERIR QUERY AQUI !
  public List<Cliente> findByTrechoContido(String trecho);

  @Query (value = "SELECT c from Cliente c where c.idade > 18 and c.nome like %?1%")
  public List<String> findByIdadeMaiorAndNomeTrecho(int idade, String trecho);
}
