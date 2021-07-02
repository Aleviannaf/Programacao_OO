package prova1;
/*34. Construa um programa em Java que, dado um número inteiro k e um número real x, determine o valor de x^k (se k ≠ 0) e 1 (se k=0), não use a função predefinida para xk e mostre o valor calculado. (1,5 pontos). */

import java.util.Scanner;

public class questao34 {
  public static void main(String[] args) {
    int k,i;
    float resultado, x;
    Scanner sc = new Scanner(System.in);
   
    System.out.print("Dígite o valor de x:");
    x= sc.nextFloat();
    System.out.print("Dígite o valor de y:");
    k= sc.nextInt();

    if(k!=0){
      resultado = 1;
      for( i=1;i<=k;i++){
        resultado =(float) x * resultado;
      } 
      System.out.println("O resultado é: "+resultado);
    }else {
      System.out.println("O resultado é 1");
    }
   
  }
  
}
