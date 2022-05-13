
public class Comissionado extends Empregado {
	private double totalVenda;
	private double taxaComissao;
	
	public double vencimento() {
		return totalVenda*taxaComissao;
	}

	public Comissionado(String nome, String sobrenome, String cpf, double totalVenda, double taxaComissao) {
		super(nome, sobrenome, cpf);
		this.totalVenda = totalVenda;
		this.taxaComissao = taxaComissao;
	}
}
