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
		scanUsuario.nextLine();

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
		scanUsuario.nextLine();

		System.out.println("Digite o email do Cliente: ");
		novoCliente.setEmail(scanUsuario.next());

		// retorna array
		return novoCliente;
	}

	public static void interfaceUsuario() {
		int opcaoUsuario = 1;

		while (opcaoUsuario != 0) {
			System.out.println(
					"Selecione uma das opcoes abaixo de acordo com a numeracao: \n[0] - Fechar programa \n\n[1] - Cadastrar Cliente\n[2] - Apagar Cliente\n"
							+ "[3] - Exibir clientes \n\n[4] - Cadastrar Funcionario \n[5] - Excluir Funcionario "
							+ "\n[6] - Exibir Funcionarios\n\n[7] - Cadastrar Produto \n[8] - Apagar produto \n[9] - Exibir produtos \n\n"
							+ "[10] - Buscar Cliente\n[11] - Buscar Produto por Descricao\n[12] - Bucar Produto por preco\n[13] - Buscar"
							+ "produto por altura\n\n[14] - Buscar Produto mais caro\n[15] - Buscar produto mais barato\n[16] - Imprimir media"
							+ " de preco dos produtos\n[17] - Exibir produtos acima da media\n[18] - Exibir Cliente mais velho"
							+ "\n[19] - Exibir Cliente mais novo\n[20] - Exibir quantidade de clientes maiores de 60 anos\n[21] -"
							+ " Exibir quantidade de clientes maiores de 18 anos\n[22] - Exibir media de idade dos clientes ");

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
				apagarProduto();
				break;
			case 9:
				exibirListaProdutos();
				break;
			case 10:
				buscarCliente();
				break;
			case 11:
				buscarProdutoDesc();
				break;
			case 12:
				buscarProdutoPreco();
				break;
			case 13:
				buscarProdutoAltura();
				break;
			case 14:
				imprimeProdutoCaro();
				break;
			case 15:
				imprimeProdutoBarato();
				break;
			case 16:
				System.out.println("A media de precos das plantas e: " + retornaMediaPrecos());
				break;
			case 17:
				exibirPrdtsAcimaMediaPreco();
				break;
			case 18:
				exibirClienteMaisVelho();
				break;
			case 19:
				exibirClienteMaisNovo();
				break;
			case 20:
				System.out
						.println("A quantidade de clientes maiores de 60 anos e: " + retornaQtdClientesMaisSessenta());
				break;
			case 21:
				System.out.println("A quantidade de clientes maiores de 18 anos e: " + retornaQtdClientesMaisDezoito());
				break;
			case 22:
				System.out.println("A idade media dos clientes e: " + retornaMediaIdade());
				break;
			default:
				System.out.println("Opcao invalida...");
			}
		}
	}

	private static int retornaMediaIdade() {
		int mediaIdade = 0;

		for (Cliente c : cadastroClientes) {
			mediaIdade += c.getIdade();
		}
		mediaIdade = mediaIdade / cadastroClientes.size();
		return mediaIdade;
	}

	private static int retornaQtdClientesMaisDezoito() {
		int qtdClientesMaisDezoito = 0;

		for (Cliente c : cadastroClientes) {
			if (c.getIdade() > 18) {
				qtdClientesMaisDezoito++;
			}
		}

		return qtdClientesMaisDezoito;
	}

	private static int retornaQtdClientesMaisSessenta() {
		int qtdClientesMaisSessenta = 0;

		for (Cliente c : cadastroClientes) {
			if (c.getIdade() > 60) {
				qtdClientesMaisSessenta++;
			}
		}
		return qtdClientesMaisSessenta;
	}

	private static void exibirClienteMaisNovo() {
		Cliente clienteMaisNovo = cadastroClientes.get(0);
		for (Cliente c : cadastroClientes) {
			if (clienteMaisNovo.getIdade() > c.getIdade()) {
				clienteMaisNovo = c;
			}
		}
		clienteMaisNovo.exibir();
	}

	private static void exibirClienteMaisVelho() {
		Cliente clienteMaisVelho = cadastroClientes.get(0);
		for (Cliente c : cadastroClientes) {
			if (clienteMaisVelho.getIdade() < c.getIdade()) {
				clienteMaisVelho = c;
			}
		}
		clienteMaisVelho.exibir();
	}

	private static void exibirPrdtsAcimaMediaPreco() {
		for (Produto p : cadastroProdutos) {
			if (p.getPreco() > retornaMediaPrecos()) {
				p.exibir();
			}
		}

	}

	private static double retornaMediaPrecos() {
		double mediaPrecos = 0;

		for (Produto p : cadastroProdutos) {
			mediaPrecos += p.getPreco();
		}

		mediaPrecos = mediaPrecos / cadastroClientes.size();
		return mediaPrecos;
	}

	private static void imprimeProdutoBarato() {
		Produto prodMaisBarato = cadastroProdutos.get(0);
		for (Produto p : cadastroProdutos) {
			if (prodMaisBarato.getPreco() > p.getPreco()) {
				prodMaisBarato = p;
			}
		}
		prodMaisBarato.exibir();
	}

	private static void imprimeProdutoCaro() {
		Produto prodMaisCaro = new Produto();
		for (Produto p : cadastroProdutos) {
			if (prodMaisCaro.getPreco() < p.getPreco()) {
				prodMaisCaro = p;
			}
		}
		prodMaisCaro.exibir();
	}

	private static void buscarProdutoAltura() {
		System.out.println("Para realizar a busca digite a altura da planta: ");
		double produtoAltura = scanUsuario.nextDouble();

		for (Produto p : cadastroProdutos) {
			if (p.getAltura() == produtoAltura) {
				p.exibir();
			}
		}
	}

	private static void buscarProdutoPreco() {
		System.out.println("Para realizar a busca digite o preco da planta: ");
		double produtoPreco = scanUsuario.nextDouble();

		for (Produto p : cadastroProdutos) {
			if (p.getPreco() == produtoPreco) {
				p.exibir();
			}
		}
	}

	private static void buscarProdutoDesc() {
		System.out.println("Para realizar a busca, digite, no minimo, parte da descricao da planta: ");
		String produtoIniciais = scanUsuario.next();
		scanUsuario.nextLine();

		for (Produto p : cadastroProdutos) {
			if (p.getDescricao().startsWith(produtoIniciais)) {
				p.exibir();
			}
		}
	}

	private static void buscarCliente() {
		System.out.println("Para realizar a busca, digite, no minimo parte do nome do cliente: ");
		String clienteIniciais = scanUsuario.next();

		for (Cliente c : cadastroClientes) {
			if (c.getNome().startsWith(clienteIniciais)) {
				c.exibir();
			}
		}
	}

	private static void apagarProduto() {
		System.out.println("Digite o índice do produto a ser apagado: ");

		int indexProdutoApagar = scanUsuario.nextInt();

		while (indexProdutoApagar > cadastroProdutos.size() || indexProdutoApagar < 0) {
			System.out.println("Numero de funcionario invalido...");

			System.out.println("\nDigite novamente o numero do funcionario: ");
			indexProdutoApagar = scanUsuario.nextInt();
		}
		cadastroFuncionarios.remove(indexProdutoApagar);

	}

	private static void exibirListaProdutos() {
		for (Produto p : cadastroProdutos) {
			p.exibir();
			System.out.println("Numero do produto: " + cadastroProdutos.indexOf(p) + "\n");
		}
	}

	private static Produto criarProduto() {
		Produto novoProduto = new Produto();

		System.out.println("Digite a descricao da planta: ");
		novoProduto.setDescricao(scanUsuario.next());

		scanUsuario.nextLine();

		while (novoProduto.getPreco() < 1) {
			try {
				System.out.println("Digite o preco da planta: ");
				novoProduto.setPreco(scanUsuario.nextDouble());
			} catch (IllegalArgumentException e) {
				System.out.println("Preco invalido... ");
			} catch (InputMismatchException e) {
				System.out.println("Tipo de preço inválido... ");
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

		scanUsuario.nextLine();

		return novoProduto;
	}

	private static void exibirListaFuncionarios() {
		for (Funcionario f : cadastroFuncionarios) {
			f.exibir();
			System.out.print("NÃºmero do funcionario: " + cadastroFuncionarios.indexOf(f) + "\n");
		}

	}

	private static Funcionario criarFuncionario() {
		Funcionario novoFuncionario = new Funcionario();

		System.out.println("Digite o nome do funcionario: ");
		novoFuncionario.setNome(scanUsuario.next());
		scanUsuario.nextLine();

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
		scanUsuario.nextLine();

		while (novoFuncionario.getSalario() < 0) {
			try {
				System.out.println("Digite o salario do funcionario: ");
				novoFuncionario.setSalario(scanUsuario.nextDouble());
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