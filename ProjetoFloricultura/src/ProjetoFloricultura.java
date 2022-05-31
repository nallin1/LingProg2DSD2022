import java.util.ArrayList;
import java.util.Scanner;

import Cadastro.*;

public class ProjetoFloricultura {
	private static ArrayList<Cliente> cadastroClientes = new ArrayList<Cliente>();
	
	public static Cliente criarCliente() {
		Scanner scanUsuario = new Scanner(System.in);
		
		// cria cliente
		Cliente novoCliente = new Cliente();
		System.out.println("Digite o nome do Cliente: ");
		novoCliente.setNome(scanUsuario.nextLine());
		if (novoCliente.getIdade() < 1) {
			throw new IllegalArgumentException("Idade Inválida...");
		} else {
			System.out.println("Digite a idade do Cliente: ");
			novoCliente.setIdade(scanUsuario.nextInt());
		}
		System.out.println("Digite o telefone do Cliente: ");
		novoCliente.setTelefone(scanUsuario.nextInt());
		System.out.println("Digite a flor favorita do Cliente: ");
		novoCliente.setFlorFavorita(scanUsuario.nextLine());
		System.out.println("Digite o email do Cliente: ");
		novoCliente.setEmail(scanUsuario.nextLine());

		// retorna array
		return novoCliente;
	}
	
	public static void interfaceUsuario() {
		int opcaoUsuario;
		
		System.out.println(
				"Selecione uma das opções abaixo de acordo com a numeração: \n[0] - Fechar programa \n[1] - Cadastrar Cliente\n [2] - Apagar Cliente");

		Scanner scanUsuario = new Scanner(System.in);
		opcaoUsuario = scanUsuario.nextInt();
		
		while (opcaoUsuario != 0) {
			switch (opcaoUsuario) {
			case 0:
				break;
			case 1:
				cadastroClientes.add(criarCliente());
				break;
			default:
				throw new IllegalArgumentException("Valor inválido !!");
			}
		}
	}

	public static void main(String[] args) {

		interfaceUsuario();
	}

}
