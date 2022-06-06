
public abstract class Empregado {
	private String nome;
	private String sobrenome;
	private String cpf;
	
	private double totalVencimento;
	
	public double getTotalVencimento() {
		return totalVencimento;
	}

	public void setTotalVencimento(double totalVendas) {
		this.totalVencimento = totalVendas;
	}

	public abstract double vencimento();

	public Empregado(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
}
