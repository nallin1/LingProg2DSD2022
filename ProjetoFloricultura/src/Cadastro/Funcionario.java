package Cadastro;

public class Funcionario extends Pessoa implements IPessoa {
	private String nome;
	private int idade;
	private String cargo;
	private double salario;
	private int horasSemanais;

	public Funcionario() {
		this.idade = 0;
		this.salario = -1;
	}
	
	@Override
	public void exibir() {
		System.out.println("\nNome: " + this.nome + "\nIdade: " + this.idade + "\nCargo: " + this.cargo + "\nSalário: "
				+ this.salario + "\nHoras Semanais: " + this.horasSemanais + "\n");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 0) {
			throw new IllegalArgumentException("Valor inválido...");
		} else {
			this.idade = idade;
		}
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario < 0) {
			throw new IllegalArgumentException("Salário inválido...");
		} else {
			this.salario = salario;
		}
	}

	public int getHorasSemanais() {
		return horasSemanais;
	}

	public void setHorasSemanais(int horasSemanais) {
		this.horasSemanais = horasSemanais;
	}

}
