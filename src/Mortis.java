

public class Mortis extends Boss{
	public Mortis() {
		this.setVidaBoss(200);
		this.setDanoBoss(20);
		this.setLevelBoss(5);
		
		
	}
	
	public void receberDano(int danoRecebido) {
		setVidaBoss(getVidaBoss() - danoRecebido);
	}
	
	
	
}
