

public abstract class Calculadora {


  public Double soma(Double a, Double b){
    return a + b;
  }

  public Double subtracao(Double a, Double b){
    return a - b;
  }

  public Double multiplicacao(Double a, Double b){
    return a * b;
  }

  public Double divisao(Double a, Double b){
      
    if(b == 0){
      throw new IllegalArgumentException("Divisão por 0 é invalida!");
    } else return a/b;
  }
  
  
}
