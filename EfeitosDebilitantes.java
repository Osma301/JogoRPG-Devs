package JogoRPGDevs;

public class EfeitosDebilitantes {
	private int qtdTurnos;
	private int qtdDano;
	private String nomeEfeito;
	
	public EfeitosDebilitantes(int qtdTurnos, int qtdDano, String nomeEfeito) {
		super();
		this.qtdTurnos = qtdTurnos;
		this.qtdDano = qtdDano;
		this.nomeEfeito = nomeEfeito;
	}

	public int getQtdTurnos() {
		return qtdTurnos;
	}

	public void setQtdTurnos(int qtdTurnos) {
		this.qtdTurnos = qtdTurnos;
	}

	public int getQtdDano() {
		return qtdDano;
	}

	public void setQtdDano(int qtdDano) {
		this.qtdDano = qtdDano;
	}

	public String getNomeEfeito() {
		return nomeEfeito;
	}

	public void setNomeEfeito(String nomeEfeito) {
		this.nomeEfeito = nomeEfeito;
	}
	
	public static void envenenar(Personagem personagem) {
		personagem
	}


}
