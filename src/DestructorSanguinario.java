

public class DestructorSanguinario extends Boss {
	
	public DestructorSanguinario() {
		this.setVidaBoss(160);
		this.setDanoBoss(15);
		this.setLevelBoss(4);
	}
	
	public void receberDano(int danoRecebido) {
		setVidaBoss(getVidaBoss() - danoRecebido);
	}
}
