package JogoRPGDevs;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JPanel;
public class BucleGame extends JPanel{
	
	Scanner scan = new Scanner(System.in);
	
	Medusa medusa = new Medusa();
	Golen golen= new Golen();
	Gorgona gorga = new Gorgona();
	Mortis mortis = new Mortis();
	public int danoRecebido = 10;
	
	
	
	
	
	
	
	
	public void crearPj() {
		int scolha;
		System.out.println("Escolha o personagem: 1- Caçador 2- Mago 3- Guerreiro");
		scolha = scan.nextInt();
		
		switch (scolha) {
		case 1: 
			Cacador cacador = new Cacador();
			System.out.println("Você escolheu o caçador");
			cacador.ataquesEspeciais();
			cacador.ataquesNormais();
			
			break;
		
		case 2: 
			Mago mago = new Mago();
			System.out.println("Você escolheu o Mago");
			
			mago.ataquesEspeciais();
			mago.ataquesNormais();
			
			lutaGame();
			
			break;
			
		case 3:
			Guerreiro war = new Guerreiro();
			System.out.println("Você escolheu o Guerreiro");
			war.ataquesEspeciais();
			war.ataquesNormais();
			break;
	}
}
	
	public void lutaGame(){
		
		boolean flag = true;
		int scolha1 = 0;
		
		mortis.setVidaBoss(3000);
		
		int vidaM = mortis.getVidaBoss();
		
		while(flag) {
			
			System.out.println("Escolha um Ataque");
			
			scolha1 = scan.nextInt();
			
			if(vidaM <= 0) {
				System.out.println("Mortis morreu fim do jogo!");
				flag = false;
			}
		
		
		if(scolha1 == 1 && vidaM > 0){
			Random r = new Random();

			vidaM -= r.nextInt(200)+3;
			
			System.out.println("Você aplicou um ataque com bastão");
			System.out.println("Vida Mortis: 3000 / "+vidaM);
			
			
		}
		
		
				}
		
		
		
	}
	
	
	public void empezarJogo() {
		crearPj();
	}
	
	
	}
