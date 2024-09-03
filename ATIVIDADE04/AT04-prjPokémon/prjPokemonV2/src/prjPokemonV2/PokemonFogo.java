package prjPokemonV2;

public class PokemonFogo extends ClassePokemon{ 
	
	//Metodo da SubClasse
	
	@Override
	public void metodoAtacar() {
		System.out.println(this.nome + " usou o ataque Bola de Fogo!");
		System.out.println(this.nome + " usou o ataque Explosão de Fogo!");
		System.out.println(this.nome + " usou o ataque Lança Chamas!");
	}
	

}
