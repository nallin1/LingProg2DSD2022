
public class TratExcecao 
{

	public static void aumentarLetra() {
		String teste = "Rapaizzz";
		
		try {
			System.out.println(teste.toUpperCase());
		} 
		
		catch (NullPointerException e) {
			System.out.println("Desculpe! A string não pode ser null");
		}
		
		finally {
			System.out.println("Hmmm aulinha do matioli amanhã!!");
		}
	}

	public static void main(String[] args) {
		aumentarLetra();
	}
}
