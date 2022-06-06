
public class Aluno extends Pessoa {
	private int ra;
	
	public void mostraDados() {
		System.out.println("� UM ALUNO");
	}
	
	public double calcularMedia(double nota1, double nota2) {
		return (nota1+nota2)/2;
	}
	
	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}
}
