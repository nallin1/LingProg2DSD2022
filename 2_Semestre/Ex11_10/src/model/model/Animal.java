package model;

public class Animal {
    private String nome;
    private String nomeDono;
    private int idade;
    private String raca;
    private float peso;


    public Animal(String nome, String nomeDono, int idade, String raca, float peso) {
        this.nome = nome;
        this.nomeDono = nomeDono;
        this.idade = idade;
        this.raca = raca;
        this.peso = peso;
    }


    public static String checkString(String message) {
        if (message.isEmpty())
            throw new IllegalArgumentException("O argumento não pode ser vazio...");

        return message;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = checkString(nome);
    }

    public String getNomeDono() {
        return this.nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public static int checkInt(int number) {
        if (number <= 0)
            throw new IllegalArgumentException("Número inválido...");

        return number;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = checkInt(idade);
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = checkString(raca);
    }

    public float getPeso() {
        return this.peso;
    }

    public static float checkFloat(float decimalNumber) {
        if (decimalNumber <= 0)
            throw new IllegalArgumentException("Número inválido...");

        return decimalNumber;
    }

    public void setPeso(float peso) {
        this.peso = checkFloat(peso);
    }
}
