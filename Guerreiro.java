package JogoRPGDevs;


import java.util.ArrayList;

public class Guerreiro extends Personagem implements RPG{
	
	@Override
	public void habilidades() {
		String habilidades[] = {"Soco","Cabezaso","Patada Brutal","Escudo da morte"};
		for (int i = 0; i < habilidades.length; i++) {
			System.out.println("Habilidades do Guerreiro: "+habilidades[i]);
		}
	}
	
	public void ataque(){
		System.out.println("Escolha o ataque que que fazer: 1- Soco 2- Cabezaso 3- Patada Brutal 4- Escudo da Morte[Especial]");
	}

	@Override
	public void ataquesEspeciais() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ataquesNormais() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atacar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receberDano() {
		// TODO Auto-generated method stub
		
	}
	
}
