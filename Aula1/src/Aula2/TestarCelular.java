package Aula2;

public class TestarCelular {

		public static void main(String[] args){
			Tela tela = new Tela(800, 600);
			Tela telaSamsung = new Tela(1024, 768);
			
			Bateria bateria = new Bateria();
			Bateria bateriaSamsung = new Bateria();
			
			Celular celular = new Celular("6", "Nokia", "1", bateria);
			Celular celularSamsung = new Celular("S7", "Samsung", "1", bateria);
			
		}
}
