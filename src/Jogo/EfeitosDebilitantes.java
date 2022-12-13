package Jogo;
import Personagens.Personagem;

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
<<<<<<< HEAD:EfeitosDebilitantes.java
=======
	
	public static void envenenar(Personagem personagem) {
		//personagem
	}

>>>>>>> fae82d397db6dda022be6af55bcb4c0660a791f7:src/Jogo/EfeitosDebilitantes.java

}
