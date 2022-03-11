package Exercicio01;

public class Funcionario {
        private String nome;
        private String sobrenome;
        private double salarioMens;
    
        public Funcionario() {
            nome = "";
            sobrenome = "";
            salarioMens = 0;
        }
    
        public String getNome() {
            return this.nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String getSobrenome() {
            return this.sobrenome;
        }
    
        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }
    
        public double getSalarioMens() {
            return this.salarioMens;
        }
    
        public void setSalarioMens(double salarioMens) {
            this.salarioMens = salarioMens;
        }
}
