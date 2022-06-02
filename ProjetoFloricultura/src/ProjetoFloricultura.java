import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Cadastro.*;

public class ProjetoFloricultura {
	private static ArrayList<Cliente> cadastroClientes = new ArrayList<Cliente>();
	private static ArrayList<Funcionario> cadastroFuncionarios = new ArrayList<Funcionario>();
	private static ArrayList<Produto> cadastroProdutos = new ArrayList<Produto>();

	private static Scanner scanUsuario = new Scanner(System.in);
	
	public static Cliente criarCliente() {
		// cria cliente
		Cliente novoCliente = new Cliente();
		
		System.out.println("Digite o nome do Cliente: ");
		novoCliente.setNome(scanUsuario.next());
		
		while (novoCliente.getIdade() < 1) {
			try {
				System.out.println("Digite a idade do cliente: ");
				novoCliente.setIdade(scanUsuario.nextInt());
			} catch (IllegalArgumentException e) {
				System.out.println("Idade de cliente invÃ¡lida...");
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

		while (opcaoUsuario != 0) {
			System.out.println(
					"Selecione uma das opï¿½ï¿½es abaixo de acordo com a numeracao: \n[0] - Fechar programa \n\n[1] - Cadastrar Cliente\n[2] - Apagar Cliente\n"
							+ "[3] - Exibir clientes \n\n[4] - Cadastrar Funcionario \n[5] - Excluir Funcionario "
							+ "\n[6] - Exibir Funcionarios\n\n[7] - Cadastrar Produto \n[8] - Apagar produto \n[9] - Exibir produtos \n");

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
				apagarFuncionario();
				break;
			case 6:
				exibirListaFuncionarios();
				break;
			case 7:
				cadastroProdutos.add(criarProduto());
				break;
			case 8:
				//
				break;
			case 9:
				exibirListaProdutos();
				break;
			default:
				throw new IllegalArgumentException("Valor invï¿½lido !!");
			}
		}
	}

	private static void exibirListaProdutos() {
		for (Produto p: cadastroProdutos) {
			p.exibir();
			System.out.println("Numero do produto: " + cadastroProdutos.indexOf(p) + "\n");
		}
	}

	private static Produto criarProduto() {
		Produto novoProduto = new Produto();
		
		System.out.println("Digite a descricao da planta: ");
		novoProduto.setDescricao(scanUsuario.next());
		
		while (novoProduto.getPreco() < 1) {
			try {
				System.out.println("Digite o preco da planta: ");
				novoProduto.setPreco(scanUsuario.nextDouble());
			} catch (IllegalArgumentException e) {
				System.out.println("Preco invalido... ");
			} catch (InputMismatchException e) {
				System.out.println("Preco invalido...");
			}
		}
		
		while (novoProduto.getPeso() < 1) {
			try {
				System.out.println("Digite o peso da planta: ");
				novoProduto.setPeso(scanUsuario.nextDouble());			
			} catch (IllegalArgumentException e) {
				System.out.println("Preco invalido... ");
			}
		}
		
		while (novoProduto.getAltura() < 1) {
			try {
				System.out.println("Digite a altura da planta: ");
				novoProduto.setAltura(scanUsuario.nextDouble());
			} catch (IllegalArgumentException e) {
				System.out.println("Altura invalida... ");
			}
		}
		
		System.out.println("Digite a especie da planta... ");
		novoProduto.setEspecie(scanUsuario.next());
		
		return novoProduto;
	}

	private static void exibirListaFuncionarios() {
		for (Funcionario f: cadastroFuncionarios) {
			f.exibir();
			System.out.print("NÃºmero do funcionario: " + cadastroFuncionarios.indexOf(f) + "\n");			
		}
		
	}

	private static Funcionario criarFuncionario() {
		Funcionario novoFuncionario = new Funcionario();

		System.out.println("Digite o nome do funcionario: ");
		novoFuncionario.setNome(scanUsuario.next());

		while (novoFuncionario.getIdade() < 1) {
			try {
				System.out.println("Digite a idade do funcionario: ");
				novoFuncionario.setIdade(scanUsuario.nextInt());
			} catch (IllegalArgumentException e) {
				System.out.println("Idade InvÃ¡lida...");
			}
		}

		System.out.println("Digite o cargo do funcionÃ¡rio: ");
		novoFuncionario.setCargo(scanUsuario.next());
		
		while (novoFuncionario.getSalario() < 0) {
			try {
				System.out.println("Digite o salario do funcionario: ");
				novoFuncionario.setSalario((double) scanUsuario.nextDouble());
			} catch (IllegalArgumentException e) {
				System.out.println("Salario de funcionario invalido...");
			} catch (InputMismatchException e) {
				System.out.println("Tipo de salario invalido... ");
			}
		}
		
		System.out.println("Digite a quantidade de horas semanais do funcionario: ");
		novoFuncionario.setHorasSemanais(scanUsuario.nextInt());

		return novoFuncionario;
	}

	private static void apagarFuncionario() {
		System.out.println("Digite o índice do funcionário a ser apagado: ");
		
		int indexFuncionarioApagar = scanUsuario.nextInt();
		
		while (indexFuncionarioApagar > cadastroFuncionarios.size() || indexFuncionarioApagar < 0) {
			System.out.println("Numero de funcionario invalido...");
			
			System.out.println("\nDigite novamente o numero do funcionario: ");
			indexFuncionarioApagar = scanUsuario.nextInt();
		}
		cadastroFuncionarios.remove(indexFuncionarioApagar);
	}
	
	private static void apagarCliente() {
		System.out.println("Digite o Ã­ndice do cliente a ser apagado: ");

		int indexClienteApagar = scanUsuario.nextInt();
		while (indexClienteApagar > cadastroClientes.size() || indexClienteApagar < 0) {
			System.out.println("Numero de cliente invalido...");
			
			System.out.println("\nDigite novamente o numero do cliente: ");
			indexClienteApagar = scanUsuario.nextInt();
		}
		cadastroClientes.remove(indexClienteApagar);
	}

	private static void exibirListaClientes() {
		for (Cliente c : cadastroClientes) {
			c.exibir();
			System.out.print("NÃºmero do Cliente: " + cadastroClientes.indexOf(c) + "\n");
		}
	}

	public static void main(String[] args) {
		interfaceUsuario();
	}

}