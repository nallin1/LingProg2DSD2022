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
public class TESTAFUNCIONARIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Guilherme", 123);
        
        Gerente ger1 = new Gerente("vxpresto", 1231, "Guilherme", 123.23);
        
        Telefonista telf1 = new Telefonista(2131, "Aline", 132313.3);
        
        Secretario sec1 = new Secretario(4567, "Aline", 456.6);
        
        System.out.println("As informações do gerente são: " + ger1.getNome() + ger1.getNomeDeUsuario() + ger1.getSenhaGerente() + ger1.getSalario());
    
        System.out.println("A bonificacao do telefonista é: " + telf1.calculaBonificacao());
        System.out.println("A bonificação do gerente é: " + ger1.calculaBonificacao());
        
        
        sec1.mostraDados();
    }
    
}
