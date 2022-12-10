package Personagens;



public class Personagem {
	private int xp = 0;
	private int levelP;
	private int mp;
	private int vidaP;
	private int maxVida;
	private int maxMp;
	private int danoP;
	private String nomeP;
	public String scolhia;

	public Personagem() {
		super();
	}

	public Personagem(int xp, int levelP, int mp, int vidaP, int maxVida, int maxMp, int danoP, String nomeP,
			String scolhia) {
		super();
		this.xp = xp;
		this.levelP = levelP;
		this.mp = mp;
		this.vidaP = vidaP;
		this.maxVida = maxVida;
		this.maxMp = maxMp;
		this.danoP = danoP;
		this.nomeP = nomeP;
		this.scolhia = scolhia;
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}

	public int getLevelP() {
		return levelP;
	}

	public void setLevelP(int levelP) {
		this.levelP = levelP;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getVidaP() {
		return vidaP;
	}

	public void setVidaP(int vidaP) {
		this.vidaP = vidaP;
	}

	public int getMaxVida() {
		return maxVida;
	}

	public void setMaxVida(int maxVida) {
		this.maxVida = maxVida;
	}

	public int getMaxMp() {
		return maxMp;
	}

	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
	}

	public int getDanoP() {
		return danoP;
	}

	public void setDanoP(int danoP) {
		this.danoP = danoP;
	}

	public String getNomeP() {
		return nomeP;
	}

	public void setNomeP(String nomeP) {
		this.nomeP = nomeP;
	}

	public String getScolhia() {
		return scolhia;
	}

	public void setScolhia(String scolhia) {
		this.scolhia = scolhia;
	}

	public void habilidades() {
		String[] habilidades = new String[4];
		for (int i = 0; i < habilidades.length; i++) {
			System.out.println("Habilidades do personagem: " + habilidades[i]);
		}
	}

	public void recebeDano(int dano) {
		this.vidaP = vidaP - dano;
	}

	public void reduzirMP(int mp) {
		this.mp = this.mp-mp;
	}
}
