package JogoRPGDevs.src;

import java.util.Random;

public class Medusa extends Boss {
	private String ataques[] = { "1 - Mordida", "2 - Furia da serpente", "3 - Ataque pesonhento" };

	public Medusa() {
		this.setVidaBoss(50);
		this.setDanoBoss(10);
		this.setLevelBoss(2);
		this.setNome("Medusa");
		this.setXpBoss(15);
	}

	@Override
	public int atacar() {
		Random gerador = new Random();
		int aux = gerador.nextInt(2);
		if (aux == 0) {
			System.out.print("O Browser atacou com 1 - Mordida ");
			return 15;

		}
		if (aux == 1) {
			System.out.print("O Browser atacou com 2 - Furia da serpente ");
			return 18;
		}
		if (aux == 2) {
			System.out.print("O Browser atacou com 3 - Ataque pesonhento ");
			this.setTipoDanoDeblitante("Envenenamento");
			this.setValorDanoDebilitante(3);
			return 25;
		}

		return 0;
	}
}
