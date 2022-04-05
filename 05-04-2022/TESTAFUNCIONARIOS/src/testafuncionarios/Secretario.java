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
public class Secretario extends Funcionario {
    protected int numRamal;
    
    public Secretario(int numRamal, String nome, double salario) {
        super(nome, salario);
        this.numRamal = numRamal;
    }

    public int getNumRamal() {
        return numRamal;
    }

    public void setNumRamal(int numRamal) {
        this.numRamal = numRamal;
    }
    
    public void mostraDados() {
        System.out.println("Dados do secretario: " + nome + salario + numRamal);
    }
}
