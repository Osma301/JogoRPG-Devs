package JogoRPGDevs.src;

public class Mortis extends Boss{
	public Mortis() {
		this.setVidaBoss(200);
		this.setDanoBoss(10);
		this.setLevelBoss(5);
		
		
	}
	
	public int receberDano(int danoRecebido) {
		setVidaBoss(getVidaBoss() - danoRecebido);
		return getVidaBoss();
	}
	
	
}
