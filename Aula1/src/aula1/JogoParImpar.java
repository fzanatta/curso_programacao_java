package aula1;

import java.util.Scanner;

public class JogoParImpar {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do primeiro jogador: ");
		String nome1 = teclado.nextLine();
		System.out.println("Informe o nome do segundo jogador: ");
		String nome2 = teclado.nextLine();
		System.out.println("Número do jogador 1: ");
		int jogador1 = teclado.nextInt();
		System.out.println("Número do jogador 2: ");
		int jogador2 = teclado.nextInt();
		int resultado = jogador1 + jogador2;
		String nomeVencedor = resultado %2 == 0 ? nome1:nome2;
		System.out.println("Nome do vencedor: ");
		System.out.println(nomeVencedor);
	}
	
}
