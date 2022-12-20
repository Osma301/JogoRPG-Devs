package JogoRPGDevs.src;


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
<<<<<<< HEAD
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Oponente Nº " + this.nOponentes + ": ");
=======
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Oponente Nº " + this.nOponentes + ": \n");
>>>>>>> f07655f342946a52a6e5c99ef3763d1f4a99d586
		System.out.println("Seu oponente " + this.nOponentes + " é:");
		getInimigos().get(aux).mostrarDados();
		System.out.println("--------------------------------------------------------------------------------");
		while (personagem.getVidaP() > 0 && getInimigos().get(aux).getVidaP() > 0) {
<<<<<<< HEAD
			
				personagem.mostrarOpcoes();
				int opcao = scanner.nextInt();
				System.out.println("-----------------------------------------------------------------");
				getInimigos().get(aux).sofrerDano(personagem.atacar(opcao));
				
				getInimigos().get(aux).mostrarDados();
				if (getInimigos().get(aux).getVidaP() > 0) {
					System.out.println("Turno do seu oponente!");
					System.out.println("--------------------------------------------------------------------------------");
					personagem.recebeDano(getInimigos().get(aux).atacar());
					personagem.mostrarAtributos();
				}
				if (personagem.getVidaP() <= 0) {
					System.out.println("--------------------------------------------------------------------------------");
					System.out.println("Você morreu, fim de jogo!");
					System.out.println("--------------------------------------------------------------------------------");
				}
		}
				System.out.println("-----------------------------------------------------------------");
				// personagem.mostrarAtributos();

		if(personagem.getVidaP() > 0) {
			System.out.println("--------------------------------------------------------------------------------");
=======

			personagem.mostrarOpcoes();
			int opcao = scanner.nextInt();
			getInimigos().get(aux).sofrerDano(personagem.atacar(opcao));
			getInimigos().get(aux).mostrarDados();
			if (getInimigos().get(aux).getVidaP() > 0) {
				System.out.println("\nTurno do seu oponente!");
				personagem.recebeDano(getInimigos().get(aux).atacar());
				if(getInimigos().get(aux).getValorDanoDebilitante() > 0) {
					personagem.recebeDano(getInimigos().get(aux).getValorDanoDebilitante());
					System.out.println("\nVocê sofreu dano debilitante de " + getInimigos().get(aux).getValorDanoDebilitante() + " por " + getInimigos().get(aux).getTipoDanoDeblitante());
				}
				System.out.println("\n(Seu HP:" + personagem.getVidaP() + ", Seu MP: " + personagem.getMp() + ")");
							}
			if (personagem.getVidaP() <= 0) {
				System.out.println("Você morreu, fim de jogo!");
			}
		}
		System.out.println("-----------------------------------------------------------------");
		// personagem.mostrarAtributos();

		if (personagem.getVidaP() > 0) {
>>>>>>> f07655f342946a52a6e5c99ef3763d1f4a99d586
			System.out.println("Você derrotou o oponente " + this.nOponentes);
			personagem.setXp(personagem.getXp() + getInimigos().get(aux).getValorExp());
			System.out.println("Você ganhou " + getInimigos().get(aux).getValorExp() + " pontos de experiência");
			System.out.println("--------------------------------------------------------------------------------");
			personagem.verificaLevel();
			personagem.curaMax();
			personagem.mostrarAtributos();
			this.nOponentes++;
		}
		if (personagem.getQtdPocao() > 0) {
			System.out.println("Deseja utilizar uma poção e recuperar pontos de HP(+50)\n1 - Sim 2 - Não");
			int opcao = scanner.nextInt();
			if (opcao == 1) {
				personagem.setQtdPocao(personagem.getQtdPocao() - 1);
				personagem.tomarPocao();
				System.out.println("O personagem bebeu uma poção, HP= "+personagem.getVidaP());
			}
		}
	}

	public void browser() {
		Scanner scan = new Scanner(System.in);
		int nBrowser = 0;
		switch (this.getnTurno()) {
		case 4:
			System.out.println("Chegou a hora de você infrentar o 1º Browser");
			nBrowser = 0;
			break;
		case 8:
			System.out.println("Chegou a hora de você infrentar o 2º Browser");
			nBrowser = 1;
			break;
		case 12:
			System.out.println("Chegou a hora de você infrentar o 3º Browser");
			nBrowser = 2;
			break;
		}

		getChefoes().get(nBrowser).mostrarDados();
		while (personagem.getVidaP() > 0 && getChefoes().get(nBrowser).getVidaBoss() > 0) {
			personagem.mostrarOpcoes();
			int opcao = scan.nextInt();
			getChefoes().get(nBrowser).sofrerDano(personagem.atacar(opcao));
			getChefoes().get(nBrowser).mostrarDados();
<<<<<<< HEAD
			while (personagem.getVidaP() > 0 && getChefoes().get(nBrowser).getVidaBoss() > 0) {
				personagem.mostrarOpcoes();
				int opcao = scan.nextInt();
				
				getChefoes().get(nBrowser).sofrerDano(personagem.atacar(opcao));
				getChefoes().get(nBrowser).mostrarDados();
				
				
				
				if (getChefoes().get(nBrowser).getVidaBoss() > 0) {
					
					System.out.println("Turno do seu oponente!");
					personagem.recebeDano(getChefoes().get(nBrowser).atacar());
				
				}
				if (personagem.getVidaP() <= 0) {
					System.out.println("-----------------------------------------------------------------");
					System.out.println("Você morreu, fim de jogo!");
					System.out.println("-----------------------------------------------------------------");

				}
			}

			if(personagem.getVidaP()>0) {
				System.out.println("Você derrotou o "+(nBrowser+1)+"º browser "+getChefoes().get(nBrowser).getNome());
				personagem.setXp(personagem.getXp()+getChefoes().get(nBrowser).getXpBoss());
				
				System.out.println("Você ganhou " + getChefoes().get(nBrowser).getXpBoss() + " pontos de experiência");
				personagem.verificaLevel();
				
				personagem.mostrarAtributos();
				this.nOponentes++;
			}else {
				
				System.out.println("O seu personagem morreu!\nFim de jogo!");
=======
			if (getChefoes().get(nBrowser).getVidaBoss() > 0) {
				System.out.println("Turno do seu oponente!");
				personagem.recebeDano(getChefoes().get(nBrowser).atacar());
				if(getChefoes().get(nBrowser).getValorDanoDebilitante() > 0) {
					personagem.recebeDano(getChefoes().get(nBrowser).getValorDanoDebilitante());
					System.out.println("\nVocê sofreu dano debilitante de " + getChefoes().get(nBrowser).getValorDanoDebilitante() + " por " + getChefoes().get(nBrowser).getTipoDanoDeblitante());
				}
				System.out.println(" (Seu HP:" + personagem.getVidaP() + ", Seu MP: " + personagem.getMp() + ")");
			}
			if (personagem.getVidaP() <= 0) {
				System.out.println("Você morreu, fim de jogo!");
>>>>>>> f07655f342946a52a6e5c99ef3763d1f4a99d586
			}
			System.out.println("-----------------------------------------------------------------");
		}

		if (personagem.getVidaP() > 0) {
			System.out
					.println("Você derrotou o " + (nBrowser + 1) + "º browser " + getChefoes().get(nBrowser).getNome());
			personagem.setXp(personagem.getXp() + getChefoes().get(nBrowser).getXpBoss());
			System.out.println("Você ganhou " + getChefoes().get(nBrowser).getXpBoss() + " pontos de experiência");
			personagem.verificaLevel();
			personagem.mostrarAtributos();
			this.nOponentes++;
		} else {
			System.out.println("O seu personagem morreu!\nFim de jogo!");
		}
		System.out.println("Você ganhou 2 poções");
		personagem.setQtdPocao(personagem.getQtdPocao() + 2);

	}
}
