public class Prototipo {
  public static void main(String[] args) {
    Bicicleta veiculo1 = new Bicicleta();
    Automovel veiculo2 = new Automovel();

    System.out.println("------Bicicleta---------");
    System.out.println(veiculo1.acelerar(10));

    System.out.println(veiculo1.acelerar(15));
    System.out.println("-------------------------");

    System.out.println("------Autumovel---------");
    System.out.println(veiculo2.verificar());
    veiculo2.mudarOleo(10);
    veiculo2.acelerar(65);
    System.out.println(veiculo2.verificar());
    veiculo2.parar();
    System.out.println(veiculo2.verificar());
    System.out.println("-------------------------");

    
    
  }
}
