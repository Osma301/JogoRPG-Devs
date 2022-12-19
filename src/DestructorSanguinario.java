import java.util.Random;

public class DestructorSanguinario extends Boss {

	public DestructorSanguinario() {
		this.setVidaBoss(60);
		this.setDanoBoss(15);
		this.setLevelBoss(4);
		this.setNome("Destructor Sanguinário");
		this.setXpBoss(20);
	}

	public void receberDano(int danoRecebido) {
		setVidaBoss(getVidaBoss() - danoRecebido);
	}

	@Override
	public int atacar() {
		Random gerador = new Random();
		int aux = gerador.nextInt(2);
		if (aux == 0) {
			System.out.print("O Browser atacou com 1 - Martelada");
			return 17;

		}
		if (aux == 1) {
			System.out.print("O Browser atacou com 2 - Quebra ossos");
			return 20;
		}
		if (aux == 2) {
			System.out.print("O Browser atacou com 3 - Esmagar");
			return 22;
		}

		return 0;
	}

}
