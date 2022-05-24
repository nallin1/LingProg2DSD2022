public class Quadrado implements AreaCalculavel{
	private double lado;
	
	public Quadrado(double lado) {
		super();
		if (lado < 1) {
			throw new IllegalArgumentException("Valor inv�lido");
		} else {
			this.lado = lado;
		}
	}

	@Override
	public double calcularArea() {
		return lado*lado;
	}

}
