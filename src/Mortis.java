import java.util.Random;

public class Mortis extends Boss{
	public Mortis() {
		this.setVidaBoss(80);
		this.setDanoBoss(20);
		this.setLevelBoss(5);
		this.setNome("Mortis");
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
			System.out.print("O Browser atacou com 1 - Assombrar");
			return 20;
		}
		if (aux == 1) {
			System.out.print("O Browser atacou com 2 - Ataque fantasma");
			return 25;
		}
		if (aux == 2) {
			System.out.print("O Browser atacou com 3 - Envenenar a alma");
			this.setTipoDanoDeblitante("Envenenamento");
			this.setValorDanoDebilitante(2);
			return 30;				
		}

		return 0;
	}
	
}
