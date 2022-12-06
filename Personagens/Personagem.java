package JogoRPGDevs;

public class Personagem {
	private int xp = 0;
	private int levelP;
	private int vidaP;
	private int danoP;
	private String nomeP;
	public String scolhia;
	
	
	
	
	public Personagem() {
		super();
	}
	
	
	public Personagem(int xp, int levelP, int vidaP, int danoP, String nomeP, String scolhia) {
		super();
		this.xp = xp;
		this.levelP = levelP;
		this.vidaP = vidaP;
		this.danoP = danoP;
		this.nomeP = nomeP;
		this.scolhia = scolhia;
	}

	public void habilidades() {
		String[] habilidades = new String[4];
		for (int i = 0; i < habilidades.length; i++) {
			System.out.println("Habilidades do personagem: "+habilidades[i]);
		}
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


	public int getVidaP() {
		return vidaP;
	}


	public void setVidaP(int vidaP) {
		this.vidaP = vidaP;
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
	
	
	
	
}
