
public class Quadrado extends FormaGeometrica implements IForma {
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcArea() {
		setArea(lado*lado);
		return getArea();
	} 

	@Override
	public double calcPerimetro() {
		
		return 4*lado;
	}

	@Override
	public double calcSeccao() {
		
		return 0;
	}

	@Override
	public void mostra() {
		System.out.println("É UM QUADRADO :)");
		
	}
	
}
