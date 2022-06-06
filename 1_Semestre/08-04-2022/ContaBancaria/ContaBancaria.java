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
public class ContaBancaria {
    private String  cliente;
    private int numConta;
    protected double saldo;
    
    public void sacar(double saque) {
        if (saque > saldo) {
            System.out.println("Não é possível sacar essa quantia !");
        } else
            saldo -= saldo;
    }
    public void depositar (double deposito){
        saldo += deposito;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
