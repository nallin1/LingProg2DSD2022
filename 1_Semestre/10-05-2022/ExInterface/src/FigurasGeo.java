
public class FigurasGeo {

	public static void main(String[] args) {
		Quadrado q = new Quadrado(2);
		//q.setLado(4);
		System.out.println(q.calcArea());
		q.mostra();
		
		IForma iforma = new Quadrado(2);
		IForma iforma2 = new Circulo();
		
		
		System.out.println(iforma.calcPerimetro());
	}

}
