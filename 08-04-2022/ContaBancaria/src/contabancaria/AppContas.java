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
public class AppContas {
        public static void main(String[] args) {
            ContaBancaria contaBancaria1 = new ContaBancaria();
            ContaPoupanca contaPoupanca1 = new ContaPoupanca();
            // ContaEspecial contaEspecial1 = new ContaEspecial();
            
            contaBancaria1.setSaldo(1000);
            contaBancaria1.setNumConta(213);
            contaBancaria1.setCliente("Joaozinho");
            
            contaPoupanca1.setCliente("maria");
            contaPoupanca1.setNumConta(456);
            contaPoupanca1.setSaldo(1200);
            
            // contaPoupanca1.
            
            
    }
}
