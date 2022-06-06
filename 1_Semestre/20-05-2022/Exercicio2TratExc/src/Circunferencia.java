public class Circunferencia implements AreaCalculavel{
	private double raio;
	@Override
	public double calcularArea() {
		return Math.PI*raio*raio;
	}

}
