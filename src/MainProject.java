package JogoRPGDevs.src;

import java.util.ArrayList;
import java.util.Iterator;
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
		
		ArrayList<Inimigo> inimigosList = new ArrayList<>(); 
		
		inimigosList.add(golen);
		inimigosList.add(gorgona);
		inimigosList.add(fandom);
		
	
		
		
		for (int i = 0; i < inimigosList.size(); i++) {
			
			System.out.println(inimigosList.get(i).getVidaP()-10);
			
			
			
		}
		// Personagems 
		
		Cacador cacador = new Cacador();
		Guerreiro guerreiro = new Guerreiro();
		Mago mago = new Mago();
		
		Personagem p1 = new Personagem();
		
		
		
		
		
		
		
		
	
	}

}
