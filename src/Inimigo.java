

public class Inimigo {
	
	private int vidaP;
	private int level;
	private int valorExp;
	private int valorDano;
	private String nomeAtaque;
	private String nome;
	
	public Inimigo() {
		
	}
	
	public Inimigo(int vidaP, int level, int valorExp, int valorDano, String nomeAtaque) {
		super();
		this.vidaP = vidaP;
		this.level = level;
		this.valorExp = valorExp;
		this.valorDano = valorDano;
		this.nomeAtaque = nomeAtaque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVidaP() {
		return vidaP;
	}

	public void setVidaP(int vidaP) {
		this.vidaP = vidaP;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getValorExp() {
		return valorExp;
	}

	public void setValorExp(int valorExp) {
		this.valorExp = valorExp;
	}

	public int getValorDano() {
		return valorDano;
	}

	public void setValorDano(int valorDano) {
		this.valorDano = valorDano;
	}

	public String getNomeAtaque() {
		return nomeAtaque;
	}

	public void setNomeAtaque(String nomeAtaque) {
		this.nomeAtaque = nomeAtaque;
	}
	
	public void sofrerDano(int dano) {
		this.setVidaP(getVidaP()-dano);
	}
	
	public int atacar() {
		System.out.println(this.getNomeAtaque()+" Dano: "+getValorDano());
		return getValorDano();
	}

	public void mostrarDados() {
		System.out.println("Nome: "+this.getNome()+"\nHP: "+this.getVidaP()+" Level: "+this.getLevel());
	}
}
