package aula1;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Entre com o dia da semana: ");
		int dia = teclado.nextInt();
		
		switch (dia) {
		case 1:
		System.out.println("Segunda-Feira");
		case 2:
			System.out.println("Terça-Feira");
			break;
		case 3:
			System.out.println("Quarta-Feira");
			break;
		case 4:
			System.out.println("Quinta-Feira");	
			break;
		case 5:
			System.out.println("Sexta-Feira");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Nenhum");
		}			
	}
	
}
