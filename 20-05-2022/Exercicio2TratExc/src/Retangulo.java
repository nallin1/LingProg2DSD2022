public class Retangulo implements AreaCalculavel {
	private double ladoBase;
	private double ladoAltura;

	public Retangulo(double ladoBase, double ladoAltura) {
		super();
		if (ladoBase < 1 || ladoAltura < 1 || ladoBase == ladoAltura) {
			throw new IllegalArgumentException("Valores inv�lidos");
			// throw new IllegalArgumentException("Modifique um dos valores a fim de
			// torn�-los v�lidos");
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
