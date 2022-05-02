public class Novo extends Imovel {
  private double valorAdicional;

  public Novo() {
    super();
    this.valorAdicional = 10;
  }

  public Novo(String endereco, double preco, double valorAdicional) {
    super(endereco, preco);
    this.valorAdicional = valorAdicional;
  }

  @Override
  public void imprimeImovel() { 
    System.out.println("\nOs dados do imovel são: \n Endereco: " + this.getEndereco() + "\n Preço: " + this.getPreco() + "\n Valor Adicional: " + valorAdicional);
  }
}