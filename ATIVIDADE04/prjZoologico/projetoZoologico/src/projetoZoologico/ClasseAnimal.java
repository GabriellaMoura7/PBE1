package projetoZoologico;

public class ClasseAnimal {

	//Atributos
	
	private String atributoNome;
	private String atributoRaca;
	private double atributoPeso;
	private String atributoSexo;
	
	//Contrutores
	
	public ClasseAnimal() {
		
	}
	
	public ClasseAnimal(String parametroNome, String parametroRaca, String parametroSexo, double parametroPeso) {
		this.atributoNome = parametroNome;
		this.atributoRaca = parametroRaca;
	    this.atributoSexo = parametroSexo;
	    this.atributoPeso = parametroPeso;
	}
	
	//Metedos Setters
	
	public void setNome (String parametroRacao) {
		this.atributoNome = parametroNome;
	}
	
	public void setPeso (double parametroPeso) {
		
		if (parametroPeso > 0) {
			this.atributoPeso = parametroPeso;
		}
		
		else {
			this.atributoPeso = 10;
		}
		
		
		this.atributoPeso = parametroPeso;
	}
	
	//Metodos
	
	public void metodoComer() {
		if(this.atributoPeso >= 170) {
			System.out.println(this.atributoNome + " esta obeso, precisa se exercitar!");
		}
		else {
		    this.atributoPeso += 10;
		}
	}
	
	public void metodoExercitar() {
		if(this.atributoPeso <= 50) {
			System.out.println(this.atributoNome + " está magro, precisa se alimentar!");
		}
		else {
		    this.atributoPeso -=10;
		}
	}
	
	public void metodoComer(int parametroRacao) {
		if(this.atributoPeso >= 170) {
			System.out.println(this.atributoNome + " esta obeso, precisa se exercitar!");
		}
		else {
		    this.atributoPeso += parametroRacao;
		}
	}
	
	public void exibirInfo() {
		System.out.println("Nome: " + this.atributoNome);
		System.out.println("Peso: " + this.atributoPeso);
	}
	
	public void metodoEmetirSom() {
		System.out.println("Barulho do bichinho");
	}
	
	//Metodo Getter Setters
	

	public String getAtributoNome() {
		return atributoNome;
	}

	public void setAtributoNome(String atributoNome) {
		this.atributoNome = atributoNome;
	}

	public String getAtributoRaca() {
		return atributoRaca;
	}

	public void setAtributoRaca(String atributoRaca) {
		this.atributoRaca = atributoRaca;
	}

	public double getAtributoPeso() {
		return atributoPeso;
	}

	public void setAtributoPeso(double atributoPeso) {
		this.atributoPeso = atributoPeso;
	}

	public String getAtributoSexo() {
		return atributoSexo;
	}

	public void setAtributoSexo(String atributoSexo) {
		this.atributoSexo = atributoSexo;
	}
	
	
	
	
	
	
	
	
}
