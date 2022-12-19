

import java.util.Scanner;

import javax.swing.SwingConstants;

public class Personagem {
	private int xp = 0;
	private int levelP;
	private int mp;
	private int vidaP;
	private int maxVida;
	private int maxMp;
	private int danoP;
	private String nomeP;
	public int scolhia;
	public Object personagemEscolhido;
	public int qtdPocao;
	
	Scanner scan = new Scanner(System.in);
	
	

	public Personagem() {
		super();
	}

	public Personagem(int xp, int levelP, int mp, int vidaP, int maxVida, int maxMp, int danoP, String nomeP,
			int scolhia) {
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

	public int getQtdPocao() {
		return qtdPocao;
	}

	public void setQtdPocao(int qtdPocao) {
		this.qtdPocao = qtdPocao;
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

	public int getScolhia() {
		return scolhia;
	}

	public void setScolhia(int scolhia) {
		this.scolhia = scolhia;
	}

	public void recebeDano(int dano) {
		this.vidaP = vidaP - dano;
	}
	
	public int reduzirMP(int mp) {
		setMp(this.mp - mp);
		return getMp();
	}
	public void curar() {
		// TODO Auto-generated method stub
		this.reduzirMP(30);
		setVidaP(getVidaP()+30);
	}
	
	public void mostrarAtributos() {
		String tipoPersonagem = "";
		if(this.getScolhia()==1) {
			tipoPersonagem = "Caçador";
		}
		if(this.getScolhia()==2) {
			tipoPersonagem = "Guerreiro";
		}
		if(this.getScolhia()==3) {
			tipoPersonagem = "Mago";
		}
		System.out.println(tipoPersonagem
				+"\nHP: " + this.getVidaP() + "\nMP: " + this.getMp()
				+ "\nLevel: " + this.getLevelP()+"\nXP: "+this.getXp());
	}
	
	public void tomarPocao() {
		if(this.qtdPocao>0) {
			this.qtdPocao--;
			if((getMaxVida()-getVidaP())<=50) {
				setVidaP(getMaxVida());
			}else {
				setVidaP(getVidaP()+50);
			}
		}
	}

	public void verificaLevel() {
		
		if (this.getXp() >= (this.getLevelP() * 2) + 8 ) {
			this.setMaxVida(this.getMaxVida() + (int) (this.getMaxMp() * 0.1));
			this.setMaxMp(this.getMaxMp() + (int) (this.getMaxMp() * 0.1));
			this.setVidaP(this.getVidaP() + (int)(this.getVidaP() * 0.2));
			this.setMp(this.getMaxMp());
			this.setXp(0);
			this.setLevelP(this.getLevelP() + 1);
			System.out.println("Parabéns seu personagem evoluiu para o level " + this.getLevelP());
		}
	}
	public void mostrarOpcoes() {
		
	}
	
	public int atacar(int ataque) {
		return 0;
	}
		
}
