package aula1;

import java.util.Scanner;

public class JogosTimes {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do primeiro time: ");
		String nome1 = teclado.nextLine();
		System.out.println("Informe o nome do segundo time: ");
		String nome2 = teclado.nextLine();
		System.out.println("Informe a quantidade de jogos: ");
		int quantidadeJogos = teclado.nextInt();
		int vitoriasPrimeiroTime = 0;
		int vitoriasSegundoTime = 0;
		int saldoGolsPrimeiroTime = 0;
		int saldoGolsSegundoTime = 0;
		int vitoriasPrimeiroTime = 0;
		int vitoriasSegundoTime = 0;
				
		for (int i = 0; i < quantidadeJogos; i++) {
			System.out.println("Gols do primeiro time: ");
			int golsPrimeiroTime = teclado.nextInt();
			System.out.println("Gols do segundo time: ");
			int golsSegundoTime = teclado.nextInt();
			saldoGolsPrimeiroTime = golsPrimeiroTime - golsSegundoTime;
			saldoGolsSegundoTime = golsSegundoTime - golsPrimeiroTime;
		}
		System.out.println("Saldo de gols do primeiro time: " + saldoGolsPrimeiroTime);
		System.out.println("Saldo de gols do segungo time: " + saldoGolsSegundoTime);
		if (golsPrimeiroTime > golsSegundoTime) {
			vitoriasPrimeiroTime++;
			
		}
			System.out.println(golsPrimeiroTime + "eh o vencedor!");
		} else {
			vitoriasSegundoTime++;
			System.out.println(golsSegundoTime + "eh o vencedor");
	}
}
