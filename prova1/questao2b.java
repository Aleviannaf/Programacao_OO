package prova1;
import java.util.Scanner;


public class questao2b {

	public static void main(String[] args) {

		float a, b, c, delta, x, x1, x2;
		Scanner sc = new Scanner(System.in);

		System.out.print("\n Digite o  A : ");
		a = sc.nextFloat();
		
    
		System.out.print("\n Digite o  B : ");
		b = sc.nextFloat();

		System.out.print("\n Digite o  C : ");
		c = sc.nextFloat();

		
		delta = (b * b) - (4 * a * c);
	

		if(delta<0){
			System.out.println("Possuí raíz complexa");
		} else  if (delta > 0) {
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
		

			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			

			System.out.println("\n Valor de X' e = " + x1
					+ "\n Valor de X'' e = " + x2);

		} else {
			x = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			System.out.println("\n Valor de X' e = " + x);
		}

	}
}