
public class Circulo implements IForma, IBidimensional {

	private double raio;

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return Math.PI*raio*raio;
	}

	@Override
	public double calcPerimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI*raio;
	}

	@Override
	public double calcSeccao() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mostra() {
		System.out.println("É UM CÍRCULO");
		
	}

	@Override
	public void eBidimensional() {
		// TODO Auto-generated method stub
		
	}
	
}
