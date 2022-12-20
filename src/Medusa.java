package JogoRPGDevs.src;

import java.util.Random;

public class Medusa extends Boss {
	private String ataques[] = { "1 - Mordida", "2 - Furia da serpente", "3 - Ataque pesonhento" };

	public Medusa() {
		this.setVidaBoss(60);
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
			System.out.println("O Browser atacou com 1 - Mordida");
			return 20;

		}
		if (aux == 1) {
			System.out.println("O Browser atacou com 2 - Furia da serpente");
			return 25;
		}
		if (aux == 2) {
			System.out.println("O Browser atacou com 3 - Ataque pesonhento");
			return 30;
		}

		return 0;
	}
}
