package model;

public class Servico {
    private String nome;
    private String descricao;
    private float duracao;
    private String profissional;


    public Servico(String nome, String descricao, float duracao, String profissional) {
        this.nome = nome;
        this.descricao = descricao;
        this.duracao = duracao;
        this.profissional = profissional;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = Animal.checkString(nome);
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = Animal.checkString(descricao);
    }

    public float getDuracao() {
        return this.duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = Animal.checkFloat(duracao);
    }

    public String getProfissional() {
        return this.profissional;
    }

    public void setProfissional(String profissional) {
        this.profissional = Animal.checkString(profissional);
    }

}
