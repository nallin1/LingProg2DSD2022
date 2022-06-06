
public class Assalariado extends Empregado{
	private double salario;

	@Override
	public double vencimento() {
		return salario;
	}

	public Assalariado(String nome, String sobrenome, String cpf, double salario) {
		super(nome, sobrenome, cpf);
		this.salario = salario;
	}
}
