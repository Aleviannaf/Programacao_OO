package prova1;
/*22. Construa um programa em Java que simule um classificador de produtos de forma a identificar um produto num conjunto de 3 possíveis, medindo a concentração de 3 elementos constituintes, A, B e C, de acordo com as concentrações dadas na seguinte tabela:

      Produto 1	Produto 2	Produto 3 	Produto 4	  Produto 5
  A   	0.1	    0.1	       0.2	       0.2        	0.2
  B	    0.5	    0.3	       0.5         0.3	        0.5
  C	    0.6	    0.7	       0.7	       0.1	        0.6
  Se as concentrações fornecidas pelo usuário não corresponderem a nenhum produto da tabela, o classificador deverá escrever: "Produto desconhecido"; caso contrário, deverá escrever o número do produto identificado. 
*/

import java.util.Scanner;

public class questao22 {
  public static void main(String[] args) {
    int i;
   float a, b ,c;
   Scanner sc = new Scanner(System.in);
   float composicao[][] = {{	0.1f	 ,   0.1f	 ,   0.2f,  0.2f   ,0.2f },{0.5f , 0.3f	  ,0.5f,    0.3f	,   0.5f}, {0.6f	,  0.7f,  0.7f	  ,   0.1f	,  0.6f}
   };
   System.out.print("Informe a composiçãao A:");
   a = sc.nextFloat();
   System.out.print("Informe a composiçãao B:");
   b = sc.nextFloat();
   System.out.print("Informe a composiçãao C:");
   c = sc.nextFloat();

   for(i=0; i<5; i++){
    if(a == composicao[0][i] && b==composicao[1][i] && c== composicao[2][i]){
      System.out.println("Classificação do produto: " +(++i));
      break;
    } else if(!(a == composicao[0][i] && b==composicao[1][i] && c== composicao[2][i]) && i==4){
      System.out.println("Produto desconhecido");
    }
   }
    
  }
}
