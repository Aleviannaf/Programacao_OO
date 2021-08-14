public class Veiculo {
  public static void main(String[] args) {
    Motor ferrari = new Motor();

    System.out.println(ferrari.imprimir());
    ferrari.leitura(5, 15);
    System.out.println(ferrari.imprimir());
    
  }
}
