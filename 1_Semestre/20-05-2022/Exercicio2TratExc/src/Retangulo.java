public class Retangulo implements AreaCalculavel {
	private double ladoBase;
	private double ladoAltura;

	public Retangulo(double ladoBase, double ladoAltura) {
		super();
		if (ladoBase < 1 || ladoAltura < 1 || ladoBase == ladoAltura) {
			throw new IllegalArgumentException("Valores inválidos");
			// throw new IllegalArgumentException("Modifique um dos valores a fim de
			// torná-los válidos");
		} else {
			this.ladoBase = ladoBase;
			this.ladoAltura = ladoAltura;
		}
	}

	@Override
	public double calcularArea() {
		return ladoBase * ladoAltura;
	}

}
