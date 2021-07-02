public class Banco {
  public static void main(String[] args) {
    ContaEmBanco c1 = new ContaEmBanco("Matheus Vieira");
    ContaEmBanco c2 = new ContaEmBanco("Cassia Albuquerque", 20.0f);

    System.out.println(c1.extrato());
    System.out.println(c2.extrato());
    
    
  }
}
