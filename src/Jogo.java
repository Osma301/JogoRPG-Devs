import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
	private int nOponentes;
	private ArrayList<Boss> chefoes;
	private ArrayList<Inimigo> inimigos;
	private Personagem personagem;

	public Jogo(int nTurno, Personagem personagem) {
		super();
		this.nOponentes = nTurno;
		this.personagem = personagem;
	}

	public Jogo() {

	}

	public int getnTurno() {
		return nOponentes;
	}

	public void setnTurno(int nTurno) {
		this.nOponentes = nTurno;
	}

	public ArrayList<Boss> getChefoes() {
		return chefoes;
	}

	public void setChefoes(ArrayList<Boss> chefoes) {
		this.chefoes = chefoes;
	}

	public ArrayList<Inimigo> getInimigos() {
		return inimigos;
	}

	public void setInimigos(ArrayList<Inimigo> inimigos) {
		this.inimigos = inimigos;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}

	public int sorteiaInimigo() {
		Random gerador = new Random();
		return gerador.nextInt(4);
	}

	public void turno() {
		Scanner scanner = new Scanner(System.in);
		int aux = this.sorteiaInimigo();
		System.out.println("Turno " + this.nOponentes + ": \n");
		System.out.println("Seu oponente " + this.nOponentes + " é:");
		getInimigos().get(aux).mostrarDados();
		while (personagem.getVidaP() > 0 && getInimigos().get(aux).getVidaP() > 0) {
			if (this.getnTurno() <= 3) {
				personagem.mostrarOpcoes();
				int opcao = scanner.nextInt();
				getInimigos().get(aux).sofrerDano(personagem.atacar(opcao));
				getInimigos().get(aux).mostrarDados();
				if (getInimigos().get(aux).getVidaP() > 0) {
					System.out.println("Turno do seu oponente!");
					personagem.recebeDano(getInimigos().get(aux).atacar());
				}

				if (personagem.getVidaP() <= 0) {
					System.out.println("Você morreu, fim de jogo!");
				}
				System.out.println("-----------------------------------------------------------------");
				// personagem.mostrarAtributos();

			}
		}
		System.out.println("Você derrotou o oponente " + this.nOponentes);
		personagem.setXp(personagem.getXp() + getInimigos().get(aux).getValorExp());
		System.out.println("Você ganhou " + getInimigos().get(aux).getValorExp() + " pontos de experiência");
		personagem.verificaLevel();
		this.nOponentes++;
	}
}
