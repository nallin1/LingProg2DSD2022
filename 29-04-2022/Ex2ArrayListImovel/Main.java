import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Imovel im1 = new Imovel();

    // im1.imprimeImovel();

    Novo n1 = new Novo("Esquina da padoca", 200, 50);

    //n1.imprimeImovel();

    Antigo a1 = new Antigo();
    a1.setPreco(10);
    a1.setDesconto(21);
    a1.setEndereco("Casa do Jão");

    Novo n2 = new Novo("Casa da mãe Joana", 14, 123);

    ArrayList<Imovel> arrayImovel = new ArrayList<>();

    arrayImovel.add(n1);
    arrayImovel.add(n2);
    arrayImovel.add(a1);

    for (Imovel im: arrayImovel) {
      if (im instanceof Novo) {
        Novo n = (Novo) im;
        n.imprimeImovel();
      }
    }
  }
}