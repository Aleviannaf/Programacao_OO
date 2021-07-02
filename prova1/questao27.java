package prova1;
/*  Construa um programa em Java para calcular a soma e o produto dos números naturais ímpares e dos números naturais pares até 1000. (1,5 pontos). */

public class questao27 {
  public static void main(String[] args) {
    int i;
    long s_par, p_par,s_impar, p_impar;
    s_impar =0;
    p_impar=1;
    s_par=0;
    p_par=1;
    
   
    for(i =1; i<=1000; i++){
     
      if((i%2)==0){
        p_par = p_par * i;
        s_par = s_par + i;
      } else if((i%2)!=0){
        p_impar = p_impar * i;
        s_impar = s_impar + i;
      }
      
    }
    System.out.println("Soma dos números impares: "+s_impar);
    System.out.println("Produto dos números impares: "+p_impar);
    System.out.println("Soma dos números pares: "+s_par);
    System.out.println("Produto dos números pares: "+p_par);
    System.out.println("Produto dos números pares até 1000 deu 0 porque é muito grande para o cálculo ");
  }
}
