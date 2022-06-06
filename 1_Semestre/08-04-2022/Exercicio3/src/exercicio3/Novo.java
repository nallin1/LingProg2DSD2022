package exercicio3;

public class Novo extends Imovel {
	private double precoAdicional;
	
	public Novo(int codigo, String endereco, double preco, double precoAdicional) {
		super(codigo, endereco, preco);
		this.precoAdicional = precoAdicional;
	}

	public double getPrecoAdicional() {
		return precoAdicional;
	}

	public void setPrecoAdicional(double precoAdicional) {
		this.precoAdicional = precoAdicional;
	}
}
