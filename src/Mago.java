package JogoRPGDevs.src;


public class Mago extends Personagem{
	public Mago() {

		this.setVidaP(150);
		this.setMaxVida(150);
		this.setDanoP(40);
		this.setLevelP(1);
		this.setXp(0);
		this.setMp(50);
		this.setMaxMp(50);
		this.setScolhia(3);
		this.setQtdPocao(0);

	}

	public void ataquesEspeciais() {
		String especiais[] = { "3 - Fogo, 4 - Gelo, 5 - Raio, 6 - Cura" };

		System.out.println("Ataques especiais: \n" + especiais[0]);

	}

	public void ataquesNormais() {
		String normais[] = { "1 - Ataque com bastão , 2- Soco" };

		System.out.println("Ataques normais: \n" + normais[0]);

	}

	@Override
	public int atacar(int ataque) {
		switch (ataque) {
		case 1: // Ataque com bastao
			System.out.println("Ataque com bastão, seu adversário sofreu 10 pontos de dano\n");
			setDanoP(10);
			return getDanoP();
			
		case 2: // Soco
			System.out.println("Ataque com soco, seu adversário sofreu 8 pontos de dano\n");
			setDanoP(8);
			return getDanoP();
			
		case 3: // Fogo
			if (this.getMp() >= 10) {
				System.out.println(
						"Ataque especial de fogo, você gastou 10mp com este ataque \n seu adversário sofreu 30 pontos de dano\n");
				setDanoP(30);
				this.reduzirMP(10);
			} else {
				System.out.println("Você não tem MP o suficiente (MP=" + this.getMp() + ")\n");
			}

			return getDanoP();
			
			
		case 4: // Gelo

			if (this.getMp() >= 10) {
				System.out.println(
						"Ataque especial de gelo, você gastou 10mp com este ataque \n seu adversário sofreu 30 pontos de dano\n");
				this.reduzirMP(10);
				setDanoP(30);
			} else {
				System.out.println("Você não tem MP o suficiente (MP=" + this.getMp() + ")\n");
			}
			return getDanoP();
			
		case 5: // Raio
			if (this.getMp() >= 10) {
				System.out.println(
						"Ataque especial de raio, você gastou 10mp com este ataque \n seu adversário sofreu 30 pontos de dano\n");
				this.reduzirMP(10);
				setDanoP(30);
			} else {
				return getDanoP();
			}
			
		case 6: // Cura
			if (getMp() >= 15) {
				System.out.println("Ataque especial de cura, você gastou 15mp com este ataque \n você recuperou 30hp\n");
				curar();
			} else {
				System.out.println("Você não tem MP suficiente.\n");
			}
			
		default:
			return 0;

		}

	}

	@Override
	public void curar() {
		this.reduzirMP(15);
		setVidaP(getVidaP() + 30);
	}

	@Override
	public void mostrarOpcoes() {
<<<<<<< HEAD
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Sua vez de atacar, escolha uma das opções:");
=======
		System.out.println("\nSua vez de atacar, escolha uma das opções:");
>>>>>>> f07655f342946a52a6e5c99ef3763d1f4a99d586
		ataquesNormais();
		System.out.println("--------------------------------------------------------------------------------");
		ataquesEspeciais();

	}

	@Override
	public int curaMax() {
		setVidaP(getVidaP()+35);
		
		if(getVidaP() > 100) {
			setVidaP(100);
		}
		System.out.println("Você recupero vida tras derrotar o inimigo");
		return getVidaP();
		
	}
	

}
