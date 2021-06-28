package prova1;
/*Construa um programa em Java que peça ao usuário e introduza um número natural com três dígitos e mostre os dígitos que o formam. Por exemplo, 937 é composto pelos dígitos 9 (centenas), 3 (dezenas) e 7 (unidades). O dígito 9 é obtido a partir da divisão de 937 por 100; os dígitos 3 e 7 são obtidos a partir, respectivamente, da divisão inteira e do resto da divisão inteira de 37 por 10, em que 37 foi obtido através do resto da divisão inteira de 937 por 100. (1 ponto).*/

import java.util.Scanner;

public class questao16 {
  public static void main(String[] args) {
    int natural, d1, d2, d3;
    Scanner sc= new Scanner(System.in);
    System.out.print("Digite um número com 3 dígitos: ");
    natural = sc.nextInt();

    d1 = natural/ 100;
   // System.out.println(d1);
    d2 = natural / 10;
    System.out.println(d2);
  }
  
}
