package prova1;

import java.util.Scanner;


public class questao3b {
  public static void main(String[] args) {
    int x, y ,z ;
    Scanner sc = new Scanner(System.in);
    System.out.print("Dígite x: ");
    x = sc.nextInt();
    System.out.print("Dígite y: ");
    y = sc.nextInt();
    System.out.print("Dígite o z: ");
    z = sc.nextInt();

    if(x > y && y>z){
      System.out.println(" x é maior que y, o qual é maior que z");
    } else {
      System.out.println("Não atende ao requisito");
    }
  }
}
