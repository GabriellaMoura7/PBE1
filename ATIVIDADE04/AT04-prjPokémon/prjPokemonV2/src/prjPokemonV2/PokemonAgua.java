package prjPokemonV2;

public class PokemonAgua extends ClassePokemon{
	
	//Metodo SubClasse 
	
	@Override
	public void metodoAtacar() {
		System.out.println(this.nome + " usou o ataque Surfar!");
		System.out.println(this.nome + " usou o ataque Canhão de Água!");
  }
