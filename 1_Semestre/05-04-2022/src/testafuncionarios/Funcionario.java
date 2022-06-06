package testafuncionarios;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calculaBonificacao() {
        double salarioBonificado;
        
        salarioBonificado = salario + 0.1*salario;
        
        return salarioBonificado;
    }
    
    public void mostraDados() {
        System.out.println("Dados do funcionario: " + nome + salario);
    }
}
