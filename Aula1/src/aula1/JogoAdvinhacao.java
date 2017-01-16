package aula1;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
	public static void main(String[] args) {
		int numero = new Random().nextInt(10) + 1;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Chute um número: ");
		int chute = teclado.nextInt();
		while (chute != numero)
			;
		{
			System.out.println("Chute outro número");
			chute = teclado.nextInt();
		}
		;
		System.out.println("Voce acertou");
	}
}
