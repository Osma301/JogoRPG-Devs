

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

	public void habilidades() {
		String[] habilidades = new String[4];
		for (int i = 0; i < habilidades.length; i++) {
			System.out.println("Habilidades do personagem: " + habilidades[i]);
		}
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
				+ "\nLevel: " + this.getLevelP());
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
		switch (this.getLevelP()) {
		case 1:
			if (this.getXp() >= 10) {
				this.setMaxVida(this.getMaxVida() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setMaxMp(this.getMaxMp() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setVidaP(this.getVidaP() + Integer.parseInt("" + this.getVidaP() * 0.2));
				this.setMp(this.getMaxMp());
				this.setXp(0);
				System.out.println("Parabéns seu personagem evoluiu para o level 2!");
				mostrarAtributos();
			}
			break;
		case 2:
			if (this.getXp() >= 12) {
				this.setMaxVida(this.getMaxVida() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setMaxMp(this.getMaxMp() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setVidaP(this.getVidaP() + Integer.parseInt("" + this.getVidaP() * 0.2));
				this.setMp(this.getMaxMp());
				this.setXp(0);
				System.out.println("Parabéns seu personagem evoluiu para o level 3!");
				mostrarAtributos();
			}
			break;
		case 3:
			if (this.getXp() >= 14) {
				this.setMaxVida(this.getMaxVida() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setMaxMp(this.getMaxMp() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setVidaP(this.getVidaP() + Integer.parseInt("" + this.getVidaP() * 0.2));
				this.setMp(this.getMaxMp());
				this.setXp(0);
				System.out.println("Parabéns seu personagem evoluiu para o level 4!");
				mostrarAtributos();
			}
			break;
		case 4:
			if (this.getXp() >= 16) {
				this.setMaxVida(this.getMaxVida() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setMaxMp(this.getMaxMp() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setVidaP(this.getVidaP() + Integer.parseInt("" + this.getVidaP() * 0.2));
				this.setMp(this.getMaxMp());
				this.setXp(0);
				System.out.println("Parabéns seu personagem evoluiu para o level 5!");
				mostrarAtributos();
			}
			break;
		case 5:
			if (this.getXp() >= 18) {
				this.setMaxVida(this.getMaxVida() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setMaxMp(this.getMaxMp() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setVidaP(this.getVidaP() + Integer.parseInt("" + this.getVidaP() * 0.2));
				this.setMp(this.getMaxMp());
				this.setXp(0);
				System.out.println("Parabéns seu personagem evoluiu para o level 6!");
				mostrarAtributos();
			}
			break;
		case 6:
			if (this.getXp() >= 20) {
				this.setMaxVida(this.getMaxVida() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setMaxMp(this.getMaxMp() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setVidaP(this.getVidaP() + Integer.parseInt("" + this.getVidaP() * 0.2));
				this.setMp(this.getMaxMp());
				this.setXp(0);
				System.out.println("Parabéns seu personagem evoluiu para o level 7!");
				mostrarAtributos();
			}
			break;
		case 7:
			if (this.getXp() >= 22) {
				this.setMaxVida(this.getMaxVida() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setMaxMp(this.getMaxMp() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setVidaP(this.getVidaP() + Integer.parseInt("" + this.getVidaP() * 0.2));
				this.setMp(this.getMaxMp());
				this.setXp(0);
				System.out.println("Parabéns seu personagem evoluiu para o level 8!");
				mostrarAtributos();
			}
			break;
		case 8:
			if (this.getXp() >= 24) {
				this.setMaxVida(this.getMaxVida() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setMaxMp(this.getMaxMp() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setVidaP(this.getVidaP() + Integer.parseInt("" + this.getVidaP() * 0.2));
				this.setMp(this.getMaxMp());
				this.setXp(0);
				System.out.println("Parabéns seu personagem evoluiu para o level 9!");
				mostrarAtributos();
			}
			break;
		case 9:
			if (this.getXp() >= 26) {
				this.setMaxVida(this.getMaxVida() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setMaxMp(this.getMaxMp() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setVidaP(this.getVidaP() + Integer.parseInt("" + this.getVidaP() * 0.2));
				this.setMp(this.getMaxMp());
				this.setXp(0);
				System.out.println("Parabéns seu personagem evoluiu para o level 10!");
				mostrarAtributos();
			}
			break;
		case 10:
			if (this.getXp() >= 28) {
				this.setMaxVida(this.getMaxVida() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setMaxMp(this.getMaxMp() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setVidaP(this.getVidaP() + Integer.parseInt("" + this.getVidaP() * 0.2));
				this.setMp(this.getMaxMp());
				this.setXp(0);
				System.out.println("Parabéns seu personagem evoluiu para o level 11!");
				mostrarAtributos();
			}
			break;
		case 11:
			if (this.getXp() >= 30) {
				this.setMaxVida(this.getMaxVida() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setMaxMp(this.getMaxMp() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setVidaP(this.getVidaP() + Integer.parseInt("" + this.getVidaP() * 0.2));
				this.setMp(this.getMaxMp());
				this.setXp(0);
				System.out.println("Parabéns seu personagem evoluiu para o level 12!");
				mostrarAtributos();
			}
			break;
		case 12:
			if (this.getXp() >= 32) {
				this.setMaxVida(this.getMaxVida() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setMaxMp(this.getMaxMp() + Integer.parseInt("" + this.getMaxMp() * 0.1));
				this.setVidaP(this.getVidaP() + Integer.parseInt("" + this.getVidaP() * 0.2));
				this.setMp(this.getMaxMp());
				this.setXp(0);
				System.out.println("Parabéns seu personagem evoluiu para o level 13!");
				mostrarAtributos();
			}
			break;
		default:
			System.out.println();
			break;
		}
	}
	public void mostrarOpcoes() {
		
	}
	
	public int atacar(int ataque) {
		return 0;
	}
		
}
