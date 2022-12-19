package JogoRPGDevs.src;



import java.util.ArrayList;
import java.util.Random;

public class Guerreiro extends Personagem implements personagemsInt{
	public Guerreiro() {
		
		this.setVidaP(300);
		this.setDanoP(10);
		this.setLevelP(1);
		this.setXp(0);
		this.setMaxMp(25);
		this.setScolhia(2);
	}
	
	
	
	
	
	@Override
	public void habilidades() {
		String habilidades[] = {"Soco","Cabezaso","Patada Brutal","Escudo da morte"};
		for (int i = 0; i < habilidades.length; i++) {
			System.out.println("Habilidades do Guerreiro: "+habilidades[i]);
		}
	}
	
	
	public void atacar(int ataque) {
		switch(ataque) {
		case 1: //Ataque com Soco
			System.out.println("Ataco com um Soco, seu adversário sofreu 5 pontos de dano");
			
			
		case 2: //Soco
			System.out.println("Ataque com Cabezaso, seu adversário sofreu 8 pontos de dano");
			
		case 3: //Patada Brutal
			System.out.println("Ataque especial de Patada brutal seu adversário sofreu 25 puntos de dano");
			this.reduzirMP(30);
		case 4: //Escudo Da Morte
			System.out.println("Ataque especial Escudo da Morte seu adversário sofreu 25 puntos de dano");
			this.reduzirMP(30);
		case 5: //Raio
			System.out.println("Ataque especial de raio, você gastou 30mp com este ataque \n seu adversário sofreu 30 pontos de dano");
			this.reduzirMP(30);
			
		case 6: //Cura
			System.out.println("Ataque especial de cura, você gastou 30mp com este ataque \n você recuperou 30hp");
			curar();

			default:
				break;
				
		}
	}





	@Override
	public void estadisticas() {
		getVidaP();
		getDanoP();
		getLevelP();
		getXp();
		getMaxMp();
		getScolhia();
	}


	
}
