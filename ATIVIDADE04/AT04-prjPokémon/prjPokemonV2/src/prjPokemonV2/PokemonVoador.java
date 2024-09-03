package prjPokemonV2;

public class PokemonVoador extends ClassePokemon{
	
	//Metodo SubClasse
	
	@Override
	public void metodoAtacar() {
		System.out.println(this.nome + " usou o ataque Ataque de Asa!");
		System.out.println(this.nome + " usou o ataque Voar!");
}
