
public class TratExcecao 
{

	public static void aumentarLetra() {
		String teste = "Rapaizzz";
		
		try {
			System.out.println(teste.toUpperCase());
		} 
		
		catch (NullPointerException e) {
			System.out.println("Desculpe! A string n�o pode ser null");
		}
		
		finally {
			System.out.println("Hmmm aulinha do matioli amanh�!!");
		}
	}

	public static void main(String[] args) {
		aumentarLetra();
	}
}
