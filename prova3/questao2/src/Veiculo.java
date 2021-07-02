public class Veiculo {
  public static void main(String[] args) {
    Motor bmw = new Motor();

    System.out.println(bmw.imprimir());
    

    bmw.leitura(2, 10);
    System.out.println(bmw.imprimir());
    
  }
}
