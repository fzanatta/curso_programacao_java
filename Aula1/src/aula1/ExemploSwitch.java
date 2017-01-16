package aula1;

import java.util.Scanner;

public class ExemploSwitch {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("1. Imprimr");
		System.out.println("2. Scannear");
		System.out.println("3. Sair");
		int opcao = leitor.nextInt();
		
		switch (opcao) {
		case 1:
		System.out.println("Imprimindo ...");
		break;
		case 2:
			System.out.println("scanneando ...");
			break;
		case 3:
			System.out.println("saindo ...");
			
		}
	}
}
