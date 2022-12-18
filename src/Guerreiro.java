

import java.util.ArrayList;
import java.util.Random;

public class Guerreiro extends Personagem implements personagemsInt{
	public Guerreiro() {
		
		this.setVidaP(140);
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
	public void ataquesEspeciais() {
		String especiais[] = { "1 - Patada Brutal", "2 - Escudo da morte" };
		for (int i = 0; i < especiais.length; i++) {
			System.out.println("Ataques especiais: " + especiais[i]);
		}
	}

	public void ataquesNormais() {
		String normais[] = { "1 - Soco , 2- Cabeçada" };
		for (int i = 0; i < normais.length; i++) {
			System.out.println("Ataques normais: " + normais[i]);
		}
	}
	
	public void atacar(int ataque) {
		switch(ataque) {
		case 1: //Ataque com Soco
			System.out.println("Ataco com Soco, seu adversário sofreu 5 pontos de dano");
			break;
		case 2: //Cabeçada
			System.out.println("Ataque com Cabeçada, seu adversário sofreu 8 pontos de dano");
			break;
		case 3: //Patada Brutal
			System.out.println("Ataque especial de Patada brutal seu adversário sofreu 25 pontos de dano, você perdeu 10 pontos de MP.");
			this.reduzirMP(10);
			break;
		case 4: //Escudo Da Morte
			System.out.println("Ataque especial Escudo da Morte seu adversário sofreu 25 pontos de dano, você perdeu 10 pontos de MP.");
			this.reduzirMP(10);	
			break;
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
