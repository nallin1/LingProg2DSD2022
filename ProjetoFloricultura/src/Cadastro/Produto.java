package Cadastro;

public class Produto {
	private String descricao;
	private double preco;
	private double peso;
	private String especie;
	private double altura;

	public Produto() {
		this.preco = 0;
		this.peso = 1;
		this.altura = 0;
	}
	
	public void exibir() {
		System.out.println("Descricao: " + this.descricao + "\nPreco: " + this.preco + "\nPeso: " + this.peso 
				+ "\nEspecie: " + this.especie + "\nAltura: " + this.altura);
	}
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			throw new IllegalArgumentException("peso invalido...");
		} else {
			this.preco = preco;
		}
	}

	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		if (peso < 1) {
			throw new IllegalArgumentException("peso invalido...");
		} else {
			this.peso = peso;
		}
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura < 0) {
			throw new IllegalArgumentException("altura invalida...\n");
		} else {
			this.altura = altura;
		}
	}

}
