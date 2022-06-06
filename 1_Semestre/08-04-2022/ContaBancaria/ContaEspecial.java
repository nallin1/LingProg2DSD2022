/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

/**
 *
 * @author aluno
 */
public class ContaEspecial extends ContaBancaria {
    private float limite;
    
    public void sacar(double saque) {
        if (saque < limite){
            saldo -= saque;
        } else
            System.out.println("O valor de saque ultrapassa o limite...");
    }
}
