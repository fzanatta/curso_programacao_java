package Aula2;

public class Celular {
	String modelo;
	String numeroSerie;
	String marca;
	
	Tela tela;
	Bateria bateria;
	
	public void ligar() {
		if (bateria.carga < 10);
	}
	public void desligar() {
		
	}
	public void carregar() {
		while (bateria.carga < bateria.capacidade);
		bateria.carga++;
		
		pausar();
		System.out.println("Carregado!");
		
	}
	private void pausa() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}

