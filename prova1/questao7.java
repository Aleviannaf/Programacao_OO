package prova1;
/*Construa um programa em Java que introduza dois números inteiros, associados às notas de duas disciplinas de um aluno, calcule a média aritmética destas notas e depois a mostre. (1 ponto).*/

import java.util.Scanner;

public class questao7 {
  public static void main(String[] args) {
    int nota1, nota2;
    float media;
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a nota da disciplina 1: ");
    nota1= sc.nextInt();

    System.out.print("Digite a nota da disciplina 2: ");
    nota2= sc.nextInt();

    media =(float) (nota1 + nota2)/2;
    System.out.println("A média é: "+media);
  }
}
