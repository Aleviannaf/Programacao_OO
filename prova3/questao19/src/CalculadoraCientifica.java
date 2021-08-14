import java.lang.Math;


public class CalculadoraCientifica extends Calculadora{

  public double potencia(Double a, Double b){
    
    return  Math.pow(a, b);
  }

  public Double raiz(Double a){
    return Math.sqrt(a);
  }
  
}
