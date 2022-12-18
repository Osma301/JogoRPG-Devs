

import java.util.Scanner;

public class MainProject {
	public static void main(String[] args) {
	
		boolean flag = true;
		int scolhia;
		int ataque;
		Scanner scan = new Scanner(System.in);
		//Chefões
		DestructorSanguinario destructor = new DestructorSanguinario();
		Mortis mortis = new Mortis();
		Medusa medusa = new Medusa();
		Boss boss = new Boss();
		
		// Inimigos
		
		Golen golen = new Golen();
		Gorgona gorgona = new Gorgona();
		Troll fandom = new Troll();
		// Classe Jogo
		
		// Personagems 
		
		Cacador cacador = new Cacador();
		Guerreiro guerreiro = new Guerreiro();
		Mago mago = new Mago();
		
		Personagem p1 = new Personagem();
		
		while(flag) {
			
			System.out.println("Escolhia um personagem: 1- Mago 2- Guerreiro 3 - Cazador 4- Ver estadisticas");
			scolhia = scan.nextInt();
			if(scolhia == 1) {
				System.out.println("Você escolheu o Mago");
				mago.mostrarAtributos();;
				mago.ataquesNormais();
				mago.ataquesEspeciais();
				p1 = mago;
				System.out.println("Escolha o ataque: ");
				ataque = scan.nextInt();
				if(ataque == 1) {
						mago.atacar(1);
						mortis.receberDano(50);
						mortis.mostrarAtributos();
						if(mortis.getVidaBoss() <= 0) {
							System.out.println("Primeiro inimigo: Mortis morreu");
							flag = false;
						}
						
					}
				}
			
		}
	}

}
