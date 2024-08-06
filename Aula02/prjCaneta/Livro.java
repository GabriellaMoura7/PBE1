package prjCaneta;

public class Livro {
	
	String nome;
	String autor;
	boolean alugado;
	
	public Livro (String nome, String autor) {
		this.nome = nome;
		this.autor = autor;
		this.alugado = false;
	}
		
	void alugado() {
		this.alugado = true;
	}
	
	void naoAlugado() {
		this.alugado = false;
	}
	
	void status() {
		System.out.println("Nome do livro: " + this.nome + ": " + (this.alugado ? "Alugado":"Disponivel"));
	}

}
