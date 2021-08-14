import java.util.Scanner;

public class Prototipo {
  public static void main(String[] args) {
    CalculadoraCientifica c = new CalculadoraCientifica();
    Scanner sc = new Scanner(System.in);
    Double a,b;
    

    System.out.println("1- soma");
    System.out.println("2- subtração");
    System.out.println("3- divisão");
    System.out.println("4- multiplicação");
    System.out.println("5- potencia");
    System.out.println("6- raiz quadrada");
    System.out.print("Qual operação:");
    

    switch(sc.nextInt()){
      case 1: 
        System.out.print("Primeiro Número:");
        a = sc.nextDouble();
        System.out.print("Segundo Número:");
        b = sc.nextDouble();
        System.out.println("Reseultado: "+c.soma(a, b));
        break;
      case 2: 
        System.out.print("Primeiro Número:");
        a = sc.nextDouble();
        System.out.print("Segundo Número:");
        b = sc.nextDouble();
        System.out.println("Reseultado: "+c.subtracao(a, b));
        break;
      case 3: 
        System.out.print("Primeiro Número:");
        a = sc.nextDouble();
        System.out.print("Segundo Número:");
        b = sc.nextDouble();
        System.out.println("Reseultado: "+c.divisao(a, b));
        break;
      case 4: 
        System.out.print("Primeiro Número:");
        a = sc.nextDouble();
        System.out.print("Segundo Número:");
        b = sc.nextDouble();
        System.out.println("Reseultado: "+c.multiplicacao(a, b));
        break;
      case 5: 
        System.out.print("Primeiro Número:");
        a = sc.nextDouble();
        System.out.print("Segundo Número:");
        b = sc.nextDouble();
        System.out.println("Reseultado: "+c.potencia(a, b));
        break;
      case 6: 
        System.out.print("Primeiro Número:");
        a = sc.nextDouble();
        System.out.print("Segundo Número:");
        b = sc.nextDouble();
        System.out.println("Reseultado: "+c.soma(a, b));
        break;
      case 7:
        System.out.print("Digite o número:");
        a= sc.nextDouble();
        System.out.println("Reseultado: "+c.raiz(a));
        break;
      default: System.out.println("Opção Invalida!");
    }
    
  }
}
