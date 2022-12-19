

public class Mortis extends Boss{
	public Mortis() {
		this.setVidaBoss(90);
		this.setDanoBoss(20);
		this.setLevelBoss(5);
		this.setNome("Mortis");
		this.setXpBoss(20);
	}
	public void receberDano(int danoRecebido) {
		setVidaBoss(getVidaBoss() - danoRecebido);
	}
	
	
	
}
