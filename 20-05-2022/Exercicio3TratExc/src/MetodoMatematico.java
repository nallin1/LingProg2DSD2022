public class MetodoMatematico {
	public double divisao(int valor1, int valor2) {
		try {
			return valor1/valor2;
		} catch (Exception e){
			System.out.println("Opera��o Inv�lida...");
			return 0;
		}
	}
}
