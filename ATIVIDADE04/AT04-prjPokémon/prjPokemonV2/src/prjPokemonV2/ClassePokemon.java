package prjPokemonV2;

public class ClassePokemon {
	
	//Atributos
	private String nome;
	private String tipo;
	private int nivel;
	private int hp;
	private int defesa;
	
	//Construtores
	
	public ClassePokemon() {
		
	}
	
	public ClassePokemon(String parametroNome, String parametroTipo, int parametroNivel, int parametroHP, int parametroDefesa) {
		this.nome = parametroNome;
		this.tipo = parametroTipo;
		this.nivel = parametroNivel;
		this.hp = parametroHP;
		this.defesa = parametroDefesa;
		
	}
	
	//Metodos
	
	public void metodoAtacar() {
		System.out.println(this.nome + " atacou o seu inimigo");
	}
	
	public void metodoEvoluir() {
		System.out.println(this.nome + " evoluiu");
	}
	
	
	//Metodo Getters e Setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}

}



