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
public class ContaPoupanca extends ContaBancaria {
    private int diaRendimento;
    
    public void calcularNovoSaldo(double taxaRendimento) {
        saldo += saldo*taxaRendimento;
    }
}
