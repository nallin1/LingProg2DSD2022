package Cadastro;

public class Cliente extends Pessoa implements IPessoa {
	private String nome;
	private int idade;
	private int telefone;
	private String florFavorita;
	private String email;
	
	@Override
	public void exibir() {
		System.out.println("Nome: " + this.nome + "\nIdade: " + this.idade + "\nTelefone" + this.telefone
				+ "\nFlor favorita: " + this.florFavorita + "\nEmail: " + this.email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getFlorFavorita() {
		return florFavorita;
	}

	public void setFlorFavorita(String florFavorita) {
		this.florFavorita = florFavorita;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
