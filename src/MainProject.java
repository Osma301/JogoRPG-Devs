package JogoRPGDevs.src;

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
		Fandom fandom = new Fandom();
		
		// Personagems 
		
		Cacador cacador = new Cacador();
		Guerreiro guerreiro = new Guerreiro();
		Mago mago = new Mago();
		
		Personagem p1 = new Personagem();
		
		while(flag) {
			
			System.out.println("Escolhia um personagem: 1- Mago 2- Guerreiro 3 - Cazador 4- Ver estadisticas");
			scolhia = scan.nextInt();
			if(scolhia == 1) {
				System.out.println("Você scolheu o Mago");
				mago.estadisticas();
				mago.ataquesNormais();
				mago.ataquesEspeciais();
				System.out.println("Escolhia o ataque: ");
				ataque = scan.nextInt();
				if(ataque == 1) {
						mago.atacar(1);
						
						
						System.out.println(mortis.receberDano(50));
						
						if(mortis.getVidaBoss() <= 0) {
							System.out.println(" Primer inimigo: Mortis morreu");
							flag = false;
						}
						
					}
				}
			
		}
	}

}
