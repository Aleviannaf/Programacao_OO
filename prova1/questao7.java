package prova1;

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
