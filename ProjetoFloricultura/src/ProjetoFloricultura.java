import java.util.ArrayList;
import java.util.Scanner;

import Cadastro.*;

public class ProjetoFloricultura {
	private static ArrayList<Cliente> cadastroClientes = new ArrayList<Cliente>();
	private static ArrayList<Funcionario> cadastroFuncionarios = new ArrayList<Funcionario>();

	public static Cliente criarCliente() {
		Scanner scanUsuario = new Scanner(System.in);

		// cria cliente
		Cliente novoCliente = new Cliente();
		System.out.println("Digite o nome do Cliente: ");
		novoCliente.setNome(scanUsuario.nextLine());
		
		while (novoCliente.getIdade() < 1) {
			try {
				System.out.println("Digite a idade do cliente: ");
				novoCliente.setIdade(scanUsuario.nextInt());
			} catch (IllegalArgumentException e) {
				System.out.println("Idade de cliente inválida...");
			}
		}
		
		System.out.print("Digite o telefone do Cliente: \n");
		novoCliente.setTelefone(scanUsuario.nextInt());

		System.out.print("Digite a flor favorita do Cliente: \n");
		novoCliente.setFlorFavorita(scanUsuario.next());

		System.out.println("Digite o email do Cliente: ");
		novoCliente.setEmail(scanUsuario.next());

		// retorna array
		return novoCliente;
	}

	public static void interfaceUsuario() {
		int opcaoUsuario = 1;

		Scanner scanUsuario = new Scanner(System.in);

		while (opcaoUsuario != 0) {
			System.out.println(
					"Selecione uma das op��es abaixo de acordo com a numeracao: \n[0] - Fechar programa \n\n[1] - Cadastrar Cliente\n[2] - Apagar Cliente\n"
							+ "[3] - Exibir clientes \n\n[4] - Cadastrar Funcionario \n[5] - Excluir Funcionario \n[6] - Exibir Funcionarios\n\n");

			opcaoUsuario = scanUsuario.nextInt();

			switch (opcaoUsuario) {
			case 0:
				System.exit(opcaoUsuario);
				break;
			case 1:
				cadastroClientes.add(criarCliente());
				break;
			case 2:
				apagarCliente();
				break;
			case 3:
				exibirListaClientes();
				break;
			case 4:
				cadastroFuncionarios.add(criarFuncionario());
				break;
			case 5:
				// excluir func
				break;
			case 6:
				exibirListaFuncionarios();
				break;
			case 7:
				exibirListaFuncionarios();
				break;
			default:
				throw new IllegalArgumentException("Valor inv�lido !!");
			}
		}
	}

	private static void exibirListaFuncionarios() {
		for (Funcionario f: cadastroFuncionarios) {
			f.exibir();
			System.out.print("Número do funcionario: " + cadastroFuncionarios.indexOf(f) + "\n");			
		}
		
	}

	private static Funcionario criarFuncionario() {
		Scanner scanUsuario = new Scanner(System.in);

		Funcionario novoFuncionario = new Funcionario();

		System.out.println("Digite o nome do funcionario: ");
		novoFuncionario.setNome(scanUsuario.next());

		while (novoFuncionario.getIdade() < 1) {
			try {
				System.out.println("Digite a idade do funcionario: ");
				novoFuncionario.setIdade(scanUsuario.nextInt());
			} catch (IllegalArgumentException e) {
				System.out.println("Idade Inválida...");
			}
		}

		System.out.println("Digite o cargo do funcionário: ");
		novoFuncionario.setCargo(scanUsuario.next());
		
		while (novoFuncionario.getSalario() < 0) {
			try {
				System.out.println("Digite o salario do funcionario: ");
				novoFuncionario.setSalario(scanUsuario.nextDouble());
			} catch (IllegalArgumentException e) {
				System.out.println("Salario de funcionario invalido...");
			}
		}
		
		System.out.println("Digite a quantidade de horas semanais do funcionario: ");
		novoFuncionario.setHorasSemanais(scanUsuario.nextInt());

		return novoFuncionario;
	}

	private static void apagarCliente() {
		Scanner scanUsuario = new Scanner(System.in);
		System.out.println("Digite o índice do cliente a ser apagado: ");

		int indexClienteApagar = scanUsuario.nextInt();

		if (indexClienteApagar > cadastroClientes.size()) {
			throw new IllegalArgumentException("Índice de cliente inválido :(");
		} else {
			cadastroClientes.remove(indexClienteApagar);
		}

	}

	private static void exibirListaClientes() {
		for (Cliente c : cadastroClientes) {
			c.exibir();
			System.out.print("Número do Cliente: " + cadastroClientes.indexOf(c) + "\n");
		}

	}

	public static void main(String[] args) {
		interfaceUsuario();
	}

}
