package prova1;
/*Construa um programa em Java que peça ao usuário três números inteiros, determine o maior deles e o mostre. (1 ponto).*/

import java.util.Scanner;

public class questao18 {
  public static void main(String[] args) {
    int n1, n2, n3;
    Scanner sc= new Scanner(System.in);
    System.out.print("Digite o primeiro número: ");
    n1 = sc.nextInt();
    System.out.print("Digite o segundo número: ");
    n2 = sc.nextInt();
    System.out.print("Digite o terceiro número: ");
    n3 = sc.nextInt();

    if(n1>n2 && n1>n2){
      System.out.println(n1+" é o maior!");
    } if(n2>n1 && n2> n3){
      System.out.println(n2+" é o maior!");
    } else {
      System.out.println(n3+" é o maior!");
    }

  }
}
