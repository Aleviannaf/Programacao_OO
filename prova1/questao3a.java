package prova1;


import java.util.Scanner;

public class questao3a {
  public static void main(String[] args) {
    int x;
    Scanner sc = new Scanner(System.in);
    System.out.print("Dígite o número: ");
    x = sc.nextInt();

    if(x>0 && x<10){
      System.out.println(x+" esta incluso.");
    } else {
      System.out.println(x+"não esta incluso.");
    }
    
  }
  
}
