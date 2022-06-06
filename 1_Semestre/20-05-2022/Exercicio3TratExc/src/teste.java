public class teste{
	public static void main(String[] args) {
		MetodoMatematico m1 = new MetodoMatematico();
		
		try {
			
			System.out.println(m1.divisao(4, 0));
		} catch (IllegalArgumentException e){
			e.printStackTrace();
		}
	}
}
