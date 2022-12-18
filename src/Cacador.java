

import java.util.Scanner;

public class Cacador extends Personagem{
	public Cacador() {
		
		this.setVidaP(120);
		this.setDanoP(44);
		this.setLevelP(1);
		this.setXp(0);
		this.setMaxMp(20);
		this.setScolhia(1);
		
	}
	
	Scanner scan = new Scanner(System.in);
	
	public void ataquesEspeciais() {
		String especiais[] = { "1 - Flecha de fogo" ,"2 - Invocação de lobos" };
		for (int i = 0; i < especiais.length; i++) {
			System.out.println("Ataques especiais: " + especiais[i]);
		}
	}
	
	public void ataquesNormais() {
		String normais[] = { "1 - Estocada Mortal" , "2 - Rede de caça" };
		for (int i = 0; i < normais.length; i++) {
			System.out.println("Ataques normais: " + normais[i]);
		}
	}
	
	public void atacar(int ataque) {
		switch(ataque) {
		case 1: //Estocada Mortal
			System.out.println("Estocada Mortal, seu adversário sofreu 17 pontos de dano");
			break;
		case 2: //Rede de caça
			System.out.println("Rede de caça, seu adversário sofreu 8 pontos de dano");
			break;
		case 3: //Flecha de fogo
			System.out.println("Flecha de fogo, você gastou 10mp com este ataque \n seu adversário sofreu 30 pontos de dano");
			this.reduzirMP(10);
			break;
		case 4: //Invocação de lobos
			System.out.println("Invocação de lobos, você gastou 15mp com este ataque \n seu adversário sofreu 35 pontos de dano");
			this.reduzirMP(15);
			break;
			default:
				break;
				
		}
		
	}
	
}
