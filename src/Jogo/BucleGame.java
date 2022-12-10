package Jogo;


import java.util.Scanner;

import Personagens.Cacador;

public class BucleGame {
	Cacador cacador = new Cacador();
	
	Scanner scan = new Scanner(System.in);
	
	public void criarJogador() {
		int escolha;
		System.out.println("Qual personagem quer ser 1- Caçador HP = 250 Dano: 150");
		escolha = scan.nextInt();
		
		if(escolha == 1) {
			cacador.habilidades();
			
		}
	}
	
}
