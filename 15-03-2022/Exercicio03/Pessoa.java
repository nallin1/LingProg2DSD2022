package Exercicio03;

public class Pessoa {
    private int idade, dia, mes, anoNascimento;
    private String nome;

    public Pessoa(int idade, int dia, int mes, int anoNascimento, String nome) {
        this.idade = idade;
        this.dia = dia;
        this.mes = mes;
        this.anoNascimento = anoNascimento;
        this.nome = nome;
    }

    public Pessoa(int dia, int mes, int anoNascimento, String nome) {
        idade = anoNascimento-2022;
        this.dia = dia;
        this.mes = mes;
        this.anoNascimento = anoNascimento;
        this.nome = nome;
    }

    public int calculaIdade() {
        return 2022-anoNascimento;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        if (dia>=1 && dia<=31)
            this.dia = dia;
        else
            this.dia = 1;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        if (mes>=1 && mes<=12)
            this.mes = mes;
        else
            this.mes = 1;
    }

    public int getAnoNascimento() {
        return this.anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        if (anoNascimento <1000) {
            this.anoNascimento = 1;
            
        } else {
            this.anoNascimento = anoNascimento;
        }

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
