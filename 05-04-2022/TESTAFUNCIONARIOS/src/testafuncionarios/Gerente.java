/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testafuncionarios;

/**
 *
 * @author aluno
 */
public class Gerente extends Funcionario {
    protected String nomeDeUsuario;
    protected int senhaGerente;

    public Gerente(String nomeDeUsuario, int senhaGerente, String nome, double salario) {
        super(nome, salario);
        this.nomeDeUsuario = nomeDeUsuario;
        this.senhaGerente = senhaGerente;
    }

    public String getNomeDeUsuario() {
        return nomeDeUsuario;
    }

    public void setNomeDeUsuario(String nomeDeUsuario) {
        this.nomeDeUsuario = nomeDeUsuario;
    }

    public int getSenhaGerente() {
        return senhaGerente;
    }

    public void setSenhaGerente(int senhaGerente) {
        this.senhaGerente = senhaGerente;
    }
    
    public double calculaBonificacao() {
        return salario + 0.4*salario;
    }
    
    public void mostraDados() {
        System.out.println("Dados do gerente: " + nome + salario + nomeDeUsuario + senhaGerente);
    }
}
