package exercicio3;

public class Usado extends Imovel {
	private double desconto;

	public Usado(int codigo, String endereco, double preco, double desconto) {
		super(codigo, endereco, preco);
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
}
