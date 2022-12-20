package JogoRPGDevs.src;


import java.util.Random;

public class Boss extends Personagem{
	String nome;
	private int vidaBoss;
	private int danoBoss;
	private int levelBoss;
	private int receberAtaque;
	private int xpBoss;
	private Random danor = new Random();
	
	
	public Boss() {
		super();
	}
	
	
	public Boss(String nome, int vidaBoss, int danoBoss, int levelBoss,int xpBoss) {
		super();
		this.nome = nome;
		this.vidaBoss = vidaBoss;
		this.danoBoss = danoBoss;
		this.levelBoss = levelBoss;
		this.xpBoss = xpBoss;

	}
	
	
	public int getXpBoss() {
		return xpBoss;
	}


	public void setXpBoss(int xpBoss) {
		this.xpBoss = xpBoss;
	}


	public int getReceberAtaque() {
		return receberAtaque;
	}
	

	public void setReceberAtaque(int receberAtaque) {
		this.receberAtaque = receberAtaque - getVidaBoss();
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVidaBoss() {
		return vidaBoss;
	}
	public void setVidaBoss(int vidaBoss) {
		this.vidaBoss = vidaBoss;
	}
	public int getDanoBoss() {
		return danoBoss;
	}
	public void setDanoBoss(int danoBoss) {
		this.danoBoss = danoBoss;
	}
	public int getLevelBoss() {
		return levelBoss;
	}
	public void setLevelBoss(int levelBoss) {
		this.levelBoss = levelBoss;
	}
	public Random getDanor() {
		return danor;
	}
	public void setDanor(Random danor) {
		this.danor = danor;
	}
	
	public int atacar() {
		return 0;
	}
	
	public void mostrarDados() {
		System.out.println("\nNome do chefão: "+this.getNome()+"\nHP: "+this.getVidaBoss()+"\nLevel: "+this.getLevelBoss());
	}
	
	public void sofrerDano(int dano) {
		this.setVidaBoss(this.getVidaBoss()-dano);
	}
	
}	
