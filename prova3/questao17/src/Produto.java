public class Produto {
  private String nome;
  private float preco;
  private int qtdEstoque;

  public Produto(String nome, float preco, int qtdEstoque){
    this.nome= nome;
    this.preco= preco;
    this.qtdEstoque = qtdEstoque;
  }


  

  public String getNome() {
    return nome;
  }
  public int getQtdEstoque() {
    return qtdEstoque;
  }
  public void setQtdEstoque(int qtdEstoque) {
    this.qtdEstoque = qtdEstoque;
  }
  public float getPreco() {
    return preco;
  }
  public void setPreco(float preco) {
    this.preco = preco;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  
}
