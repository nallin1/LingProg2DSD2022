
public class Horista extends Empregado{
	private double horasTrabalhadas;
	private double precoHora;
	
	@Override
	public double vencimento() {
		return horasTrabalhadas*precoHora;
	}

	public Horista(String nome, String sobrenome, String cpf, double horasTrabalhadas, double precoHora) {
		super(nome, sobrenome, cpf);
		this.horasTrabalhadas = horasTrabalhadas;
		this.precoHora = precoHora;
	}
}
