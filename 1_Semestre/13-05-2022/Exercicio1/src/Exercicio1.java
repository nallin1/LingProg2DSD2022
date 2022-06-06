import java.util.ArrayList;

public class Exercicio1 {

	public static void main(String[] args) {
		
		
		Assalariado a1 = new Assalariado("a1", "aaa", "4832974a", 200.4);
		Assalariado a2 = new Assalariado("a2", "bbb", "21732aa", 153.33);
		
		Horista h1 = new Horista("h1", "ccc", "897123bb", 5, 20);
		Horista h2 = new Horista("h2", "ddd", "21313cc", 9, 16+1);
		
		
		Comissionado c1 = new Comissionado("c1", "dasd", "21313a", 123, 6.3);
		Comissionado c2 = new Comissionado("c2", "dasd", "312313a", 389, 8.4);
		
		ArrayList<Empregado> listEmpregados = new ArrayList<Empregado>();
		listEmpregados.add(a1);
		listEmpregados.add(a2);
		
		listEmpregados.add(h1);
		listEmpregados.add(h2);
		
		listEmpregados.add(c1);
		listEmpregados.add(c2);
		
		
		for (Empregado emp: listEmpregados) {
			double totalVencimento=0;
			if(emp instanceof Assalariado) {
				Assalariado ass = (Assalariado) emp;
				totalVencimento += ass.vencimento();
			}
			if (emp instanceof Comissionado) {
				Comissionado com = (Comissionado) emp;
				totalVencimento += com.vencimento();
			}
			if (emp instanceof Horista) {
				Horista hor = (Horista) emp;
				totalVencimento += hor.vencimento();
			}
		}
	}
	//System.out.
}
