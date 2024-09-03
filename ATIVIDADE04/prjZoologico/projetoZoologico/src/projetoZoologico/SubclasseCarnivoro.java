package projetoZoologico;

public class SubclasseCarnivoro extends ClasseAnimal {
    //Metodo da SubClasse
	public void metodoCacar() {
		System.out.println(this.atributoNome + " está caçando");
	}
	
	@Override
	public void metodoEmitirSom() {
		System.out.println("Roaaaarrr");
	}
	
	
	
}
