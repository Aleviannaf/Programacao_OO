public class Banco {
  public static void main(String[] args) {
    ContaEmBanco conta1 = new ContaEmBanco("Lucas Peres");
    ContaEmBanco conta2 = new ContaEmBanco("Kaike Silveira", 30.0f);

    System.out.println(conta1.extrato());
    System.out.println(conta2.extrato());
    
    conta2.sacar(15.0f);
    System.out.println(conta2.extrato());
    
  }
}
