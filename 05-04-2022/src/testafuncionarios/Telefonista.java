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
public class Telefonista extends Funcionario {
    protected int codEst;

    public Telefonista(int codEst, String nome, double salario) {
        super(nome, salario);
        this.codEst = codEst;
    }

    public int getCodEst() {
        return codEst;
    }

    public void setCodEst(int codEst) {
        this.codEst = codEst;
    }
    
    public void mostraDados() {
        System.out.println("Dados do telefonista: " + nome + salario + codEst);
    }
}
