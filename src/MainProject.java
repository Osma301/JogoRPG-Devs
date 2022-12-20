
import java.util.ArrayList;
import java.util.Scanner;

public class MainProject {
	
	public static void main(String[] args) {

		boolean flag = true;
		int escolha;
		int ataque;
		Jogo jogo = new Jogo();
		Scanner scan = new Scanner(System.in);

		// Personagems

		Cacador cacador = new Cacador();
		Guerreiro guerreiro = new Guerreiro();
		Mago mago = new Mago();

		Personagem p1 = new Personagem();

		System.out.println("Escolha um personagem: 1- Mago 2- Guerreiro 3 - Cacador");
		escolha = scan.nextInt();
		switch(escolha) {
			case 1:
				System.out.println("Você escolheu o Mago");
				mago.mostrarAtributos();
				mago.ataquesNormais();
				mago.ataquesEspeciais();
				p1 = mago;
				break;
			case 2:
				System.out.println("Você escolheu o Guerreiro");
				guerreiro.mostrarAtributos();
				guerreiro.ataquesNormais();
				guerreiro.ataquesEspeciais();
				p1 = guerreiro;
				break;
			case 3:
				System.out.println("Você escolheu o Cacador");
				cacador.mostrarAtributos();
				cacador.ataquesNormais();
				cacador.ataquesEspeciais();
				p1 = cacador;
				break;
			default:
				System.out.println("Você vai ficar com o Mago");
				break;
		}
		jogo.setPersonagem(p1);
		jogo.setnTurno(1);
		jogo.setChefoes(carregaArrayBoss());
		int count = 0;
		do {
			jogo.setInimigos(carregaArrayInimigos());
			jogo.turno();
			count++;
			if (count % 3 == 0 && p1.getVidaP() > 0) {
				jogo.browser();
			}
		} while (p1.getVidaP() > 0 && count < 9);

		if (p1.getVidaP() > 0) {
			System.out.println("Voce zerou o jogo! Parabéns!!");
		}
		System.out.println("Fim de jogo");
	}
	
	public static ArrayList<Inimigo> carregaArrayInimigos() {

		ArrayList<Inimigo> inimigos = new ArrayList();

		Golen golen = new Golen();
		Gorgona gorgona = new Gorgona();
		Troll troll = new Troll();
		MaquinaSanguinaria maquinaSanguinaria = new MaquinaSanguinaria();
		AlmaMaldita almaMaldita = new AlmaMaldita();

		inimigos.add(golen);
		inimigos.add(gorgona);
		inimigos.add(troll);
		inimigos.add(maquinaSanguinaria);
		inimigos.add(almaMaldita);

		return inimigos;

	}

	public static ArrayList<Boss> carregaArrayBoss() {

		ArrayList<Boss> boss = new ArrayList();

		Medusa medusa = new Medusa();
		DestructorSanguinario destructor = new DestructorSanguinario();
		Mortis mortis = new Mortis();

		boss.add(medusa);
		boss.add(destructor);
		boss.add(mortis);

		return boss;

	}
}
