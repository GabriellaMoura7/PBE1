package prjPokemonV2;

public class Aplicacao {

	public static void main(String[] args) {
		
		ClassePokemon  growlithe = new ClassePokemon();
		
		growlithe.setNome("Tigrinho");
		growlithe.setTipo("Fogo");
		growlithe.setNivel(12);
		growlithe.setHp(10);
		growlithe.setDefesa(15);
		
		ClassePokemon fennekin = new ClassePokemon();
		
		fennekin.setNome("Raposito");
		fennekin.setTipo("Fogo");
		fennekin.setNivel(16);
		fennekin.setHp(14);
		fennekin.setDefesa(20);
		
		ClassePokemon fletchling = new ClassePokemon();
		
		fletchling.setNome("Periquito Arrogante");
		fletchling.setTipo("Voador");
		fletchling.setNivel(12);
		fletchling.setHp(10);
		fletchling.setDefesa(15);
		
		ClassePokemon altaria = new ClassePokemon();
		
		altaria.setNome("Google");
		altaria.setTipo("Voador");
		altaria.setNivel(13);
		altaria.setHp(8);
		altaria.setDefesa(18);
		
        ClassePokemon popplio = new ClassePokemon();
		
		popplio.setNome("Bolhas");
		popplio.setTipo("Água");
		popplio.setNivel(18);
		popplio.setHp(16);
		popplio.setDefesa(27);
		
        ClassePokemon psyduck = new ClassePokemon();
		
		psyduck.setNome("Dorflex");
		psyduck.setTipo("Água");
		psyduck.setNivel(15);
		psyduck.setHp(12);
		psyduck.setDefesa(19);
		
		growlithe.metodoAtacar();
		fennekin.metodoAtacar();
		fletchling.metodoAtacar();
		altaria.metodoAtacar();
		popplio.metodoAtacar();
		psyduck.metodoAtacar();
		
		growlithe.metodoEvoluir();
		fennekin.metodoEvoluir();
		fletchling.metodoEvoluir();
		altaria.metodoEvoluir();
		popplio.metodoEvoluir();
		psyduck.metodoEvoluir();
		
		
		
		
		

	}

}
