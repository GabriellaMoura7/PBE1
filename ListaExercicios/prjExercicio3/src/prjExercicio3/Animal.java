package prjExercicio3;

public class Animal {

	//Atributos
	
	String nome;
	String raca;
	int idade;
	
	//Construtores
	
	public Animal() {
		
	}
	
	public Animal(String nome, String raca, int idade) {
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
	}
	
	//Metodos
	
	public void metodoEmetirSom() {
		System.out.println("Os animais estão emitindo som");
	}
	
	public void exebirInfo() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Raça: " + this.raca);
		System.out.println("Idade: " + this.idade);
	}
}