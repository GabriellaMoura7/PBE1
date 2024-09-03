package projetoZoologico;

public class Aplicacao {

	public static void main(String[] args) {
		
		ClasseAnimal elefante = new ClasseAnimal();
		
		elefante.setNome("Thank u, next");
		elefante.setPeso(-100);
 	
	ClasseAnimal girafa = new ClasseAnimal("GitHub","Russa","Femea",60);
	
    SubclasseCarnivoro leao = new SubclasseCarnivoro ();
    leao.atributoNome = "Leaodro";
    leao.atributoRaca = "Australeandro";
    leao.atributoSexo = "Neutrx";
    leao.atributoPeso = 123;
	
	elefante.exibirInfo();

	elefante.metodoComer(50);
	
	elefante.exibirInfo();
	
	girafa.exibirInfo();
	
	elefante.metodoEmetirSom();
	
	girafa.metodoEmetirSom();
	
	leao.metodoEmetirSom();
	
	}

}
