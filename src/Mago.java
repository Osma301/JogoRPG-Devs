
public class Mago extends Personagem {
	public Mago() {

		this.setVidaP(100);
		this.setMaxVida(100);
		this.setDanoP(40);
		this.setLevelP(1);
		this.setXp(0);
		this.setMp(30);
		this.setMaxMp(30);
		this.setScolhia(3);

	}

	public void ataquesEspeciais() {
		String especiais[] = { "3 - Fogo, 4 - Gelo, 5 - Raio, 6 - Cura" };

		System.out.println("Ataques especiais: " + especiais[0]);

	}

	public void ataquesNormais() {
		String normais[] = { "1 - Ataque com bastão , 2- Soco" };

		System.out.println("Ataques normais: " + normais[0]);

	}

	@Override
	public int atacar(int ataque) {
		switch (ataque) {
		case 1: // Ataque com bastao
			System.out.println("Ataque com bastão, seu adversário sofreu 10 pontos de dano");
			setDanoP(10);
			return getDanoP();
		case 2: // Soco
			System.out.println("Ataque com soco, seu adversário sofreu 8 pontos de dano");
			setDanoP(8);
			return getDanoP();
		case 3: // Fogo

			if (this.getMp() >= 10) {
				System.out.println(
						"Ataque especial de fogo, você gastou 10mp com este ataque \n seu adversário sofreu 30 pontos de dano");
				setDanoP(30);
				this.reduzirMP(10);
			} else {
				System.out.println("Você não tem MP o suficiente (MP=" + this.getMp() + ")");
			}

			return getDanoP();
		case 4: // Gelo

			if (this.getMp() >= 10) {
				System.out.println(
						"Ataque especial de gelo, você gastou 10mp com este ataque \n seu adversário sofreu 30 pontos de dano");
				this.reduzirMP(10);
				setDanoP(30);
			} else {
				System.out.println("Você não tem MP o suficiente (MP=" + this.getMp() + ")");
			}
			return getDanoP();
		case 5: // Raio
			if (this.getMp() >= 10) {
				System.out.println(
						"Ataque especial de raio, você gastou 10mp com este ataque \n seu adversário sofreu 30 pontos de dano");
				this.reduzirMP(10);
				setDanoP(30);
			} else {
				return getDanoP();
			}
		case 6: // Cura
			if (getMp() >= 15) {
				System.out.println("Ataque especial de cura, você gastou 15mp com este ataque \n você recuperou 30hp");
				curar();
			} else {
				System.out.println("Você não tem MP suficiente.");
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
		System.out.println("\nSua vez de atacar, escolha uma das opções:");
		ataquesNormais();
		ataquesEspeciais();

	}

}
