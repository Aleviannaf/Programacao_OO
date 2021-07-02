package prova1;

import java.util.Scanner;

/*2.	Escreva uma expressão lógica L para cada uma das seguintes ações: (1 ponto).
a)	A expressão lógica L é verdadeira se e somente se I for múltiplo de J (ambos inteiros).
 */

/*questão 1-a
  se ( l % j ==0)
*/
public class questao2a {
  
  public static void main(String[] args) {
    int i,j;
		Scanner sc = new Scanner(System.in);

		System.out.print("\n Digite o i: ");
		i = sc.nextInt();
		
    
		System.out.print("\n Digite o  j: ");
		j = sc.nextInt();

    if(i%j==0){
      System.out.println(i+" é multiplo de "+j);
    }else{
      System.out.println("Não é multiplo");
    }
  }
}
