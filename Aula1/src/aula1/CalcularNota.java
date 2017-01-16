package aula1;

import java.util.Scanner;

public class CalcularNota {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o nome do aluno: ");
		String nome1 = teclado.nextLine();
		System.out.println("Informe a primeira nota: ");
		double nota1 = teclado.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double nota2 = teclado.nextDouble();
		System.out.println("Informe a terceira nota: ");
		double nota3 = teclado.nextDouble();
		double resultado = ((nota1 + nota2 + nota3))/3;
		System.out.println("Informe a terceira nota: ");
		//String resultado1 = resultado >= 7 ? "Aluno Aprovado" : "Aluno Reprovado";
		//System.out.println(resultado1);
		if (resultado >= 7) {
			System.out.println("Aprovado");
		} else if (resultado >= 4) {
			System.out.println("Exame");
		} else {
			System.out.println("Reprovado");
		}
		
		
		teclado.close();
	}
}
