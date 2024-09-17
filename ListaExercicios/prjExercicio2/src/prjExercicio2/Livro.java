package prjExercicio2;

public class Livro {

	//Atributos
	
	String titulo;
	String autor;
	int numPaginas;
	double preco;
	
	//Construtores
	
	public Livro() {
		
	}
	
	public Livro(String titulo, String autor, int numPaginas, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPaginas = numPaginas;
		this.preco = preco;
	}
	
	//Métodos
	
	public void aplicarDesconto() {
		System.out.println(this.preco -= 15.00);
	}
	
	public void exebirInfo() {
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Autor: " + this.autor);
	}

	//Getters e Setters
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
