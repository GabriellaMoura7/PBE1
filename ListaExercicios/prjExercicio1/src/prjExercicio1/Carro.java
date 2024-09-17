package prjExercicio1;

public class Carro {

	//Atributos
	
	String cor;
	String marca;
	String modelo;
	int velocidade;
	
	//Construtores
	
	public Carro() {
		
	}
	
	public Carro(String marca, String modelo, String cor, int velocidade) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.velocidade = velocidade;
	}
	
	//Métodos
	
	void acelerar(int acelerar) {
		velocidade += acelerar;
	}
	
	void frear(int reduzir) {
		velocidade -= reduzir;
	}
	
	void buzinar() {
		System.out.println("fooonnnn!");
	}
}
