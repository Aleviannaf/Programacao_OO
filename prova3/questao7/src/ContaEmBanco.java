public class ContaEmBanco {
  public String nomeCliente;
  private float saldo;
  

  public ContaEmBanco(String nome){
    this.setNomeCliente(nome);
    this.setSaldo(0);
    
  }

  public ContaEmBanco(String nome, float saldo){
    this.setNomeCliente(nome);
    if(saldo>=0){
      this.setSaldo(saldo);
    } else {
      this.setSaldo(0);
    }
  }

  

  
  public String extrato() {
    return "Conta em Banco \n[nome do cliente= " + nomeCliente + ",\n saldo= " + saldo + "]\n";
  }

  public void sacar(float valor){
    if(this.getSaldo()>0 && this.getSaldo()>valor){
      this.setSaldo(this.getSaldo() - valor);
    }
  }

  public void depositar(float valor){
    if(valor>0){
    this.setSaldo(this.getSaldo()+valor);
    }
  }
  
  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
    this.setSaldo(0);
  }

  public void setSaldo(float saldo) {
    this.saldo = saldo;
  }

  public String getNomeCliente() {
    return nomeCliente;
  }

  public float getSaldo() {
    return saldo;
  }
  
}
