
import java.util.ArrayList;
import java.util.Random;

public class Guerreiro extends Personagem {
	public Guerreiro() {

		this.setVidaP(160);
		this.setMaxVida(160);
		this.setDanoP(10);
		this.setLevelP(1);
		this.setXp(0);
		this.setMp(50);
		this.setMaxMp(50);
		this.setScolhia(2);
		this.setQtdPocao(0);
	}

	public void ataquesEspeciais() {
		String especiais[] = { "3 - Patada Brutal, 4 - Escudo da morte" };
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

	@Override
	public int atacar(int ataque) {
		switch (ataque) {
		case 1: // Ataque com Soco
			System.out.println("Ataco com Soco, seu adversário sofreu 20 pontos de dano \n");
			setDanoP(20);
			return getDanoP();
		case 2: // Cabeçada
			System.out.println("Ataque com Cabeçada, seu adversário sofreu 25 pontos de dano\n");
			setDanoP(25);
			return getDanoP();
		case 3: // Patada Brutal
			if(this.getMp()>=10) {
				System.out.println(
					"Ataque especial de Patada brutal seu adversário sofreu 30 pontos de dano, você perdeu 10 pontos de MP. \n");setDanoP(25);
			this.reduzirMP(10);
			return getDanoP();
			}else {
			System.out.println("Você não tem MP o suficiente (MP: "+this.getMp()+")\n");	
			}
			
		case 4: // Escudo Da Morte
			if(this.getMp()>=10) {
				System.out.println(
					"Ataque especial Escudo da Morte seu adversário sofreu 35 pontos de dano, você perdeu 10 pontos de MP.\n");
			setDanoP(35);
			this.reduzirMP(10);
			return getDanoP();
			}else {
				System.out.println("Você não tem MP o suficiente (MP: "+this.getMp()+")\n");	
			}
		default:
			return 0;

		}
	}
	
	@Override
	public void mostrarOpcoes() {
		System.out.println("\nSua vez de atacar, escolha uma das opções:");
		ataquesNormais();
		ataquesEspeciais();

	}

}
