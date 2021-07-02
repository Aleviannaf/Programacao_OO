public class Teste {
  public static void main(String[] args) {
    Estoque mercadinho = new Estoque();
    Produto arroz = new Produto("macarrao", 20.0f,3);
    mercadinho.addProduto("calabreza", 7.25f, 4);
    mercadinho.addProduto("tomate", 7.25f, 4);

    System.out.println(mercadinho.verificar());

  }

  
  
}
