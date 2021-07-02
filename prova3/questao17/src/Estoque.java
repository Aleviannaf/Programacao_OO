public class Estoque extends Produto {
  private Produto [] produtos;

  public Estoque(String nome, float preco, int qtdEstoque) {
    super(nome, preco, qtdEstoque);
  }

  public Estoque() {
    super(null, 0, 0);
  }

 public String verificar(){
   return this.getNome()+"";
 }

  


  public void addProduto(String nome, float preco, int qtd){
      this.setNome(nome);
      this.setPreco(preco);
      this.setQtdEstoque(getQtdEstoque()+qtd);
  }

  public Produto [] getProdutos() {
    return produtos;
  }

  public void setProdutos(Produto [] produtos) {
    this.produtos = produtos;
  }
  
}
