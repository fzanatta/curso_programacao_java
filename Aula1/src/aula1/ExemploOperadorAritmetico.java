package aula1;

import java.util.Scanner;

public class ExemploOperadorAritmetico {
	
		Scanner teclado = new Scanner(System.in);
		   System.out.println("Número 1: ");
		   int Numero1 = teclado.nextInt();
		   System.out.println("Número 2: ");
		   int Numero2 = teclado.nextInt();
		   int Resultado = Numero1 + Numero2;
		   System.out.println("Resultado:" + Resultado);
		   teclado.close();
		   
	}
}
