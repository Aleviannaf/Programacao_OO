package prova1;
import java.util.Scanner;


public class questao1b {

	public static void main(String[] args) {

		float a, b, c, delta, x1, x2;

		System.out.println("\n Digite o Valor de A ");
		Scanner v1 = new Scanner(System.in);
		a = v1.nextFloat();
		// digitando valor 2
    
		System.out.println("\n Digite o Valor de B ");
		Scanner v2 = new Scanner(System.in);
		b = v2.nextFloat();
		// sigitando valor3
		System.out.println("\n Digite o Valor de C ");
		Scanner v3 = new Scanner(System.in);
		c = v3.nextFloat();

		// calculo de delta, baskara
		delta = b * b - 4 * a * c;// poderia estar usando Math.pow(b,2)ao inves de b*b,
		// delta recebe meu valor de (b*b),que e B ao
		// quadrado - 4* valor de A * valor de C
		if (delta > 0) {// se condicao for verdadeira executa
			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));// x'calculo
			// de
			// x= -b +/-
			// Raiz de delta
			// (div/) por 2 * a

			x2 = (float) ((-b + Math.sqrt(delta)) / (2 * a));// x"
			// Math.sqrt
			// calcula a
			// raiz, raiz do
			// reaultado de
			// delta

			System.out.println("\n Valor de X' e = " + x1
					+ "\n Valor de X'' e = " + x2);

		} else {
			System.out
					.println("Não e possivel calcular esta Raiz, não e um numero real ");
		}

	}