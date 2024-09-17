package prjExercicio4;

public class Veiculo {
	//Atributos
	
	String marca;
	String modelo;
	int velocidade;
	
	//Construtores
	
	public Veiculo() {
		
	}
	
	public Veiculo(String marca, String modelo, int velocidade) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidade = velocidade;
	}
	
	//Metodos
	
	public void metodoAcelerar() {
		velocidade += 10;
		System.out.println("Veiculo Acelerando");
	}
	
	public void metodoFrear() {
		velocidade -= 10;
		System.out.println("Veiculo Freando");
	}

}
