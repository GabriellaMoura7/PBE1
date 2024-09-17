package prjExercicio2;

public class Aplicacao {

	public static void main(String[] args) {
		
		Livro livro1 = new Livro();
		
		livro1.setTitulo("Asas de Fogo");
		livro1.setPreco(61.00);
		
		Livro livro2 = new Livro();
		
		livro2.setTitulo("Gatos Guerreiros");
		livro2.setPreco(45.00);
		
		Livro livro3 = new Livro();
		
		livro3.setTitulo("Hooky");
		livro3.setPreco(60.00);
		
		livro1.exebirInfo();
		
		livro2.exebirInfo();
		
		livro3.exebirInfo();

	}

}
