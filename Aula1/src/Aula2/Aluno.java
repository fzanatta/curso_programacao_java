package Aula2;

public class Aluno {
	
	String nome;
	String ra;
	String cpf;
	
	double nota1;
	double nota2;
	double nota3;
	
	double calcularMedia() {
		double media = (nota1 + nota2 + nota3) / 3;
		return media;
	}
	public void metodoQualquer() { 
		return; 
		// metodo nao retorna nada mas para no return
	}
}
