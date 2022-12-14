package JogoRPGDevs.src;

import java.util.Scanner;

public class Cacador extends Personagem implements RPG{
	Scanner scan = new Scanner(System.in);

	@Override
	public void habilidades() {
		String habilidades[] = { "1- Flecha de fogo" , "2- Estocada Mortal" , "3- Rede de caza" ,"4- Invocação de Lobos[Especial]"};
		for (int i = 0; i < habilidades.length; i++) {
			System.out.println("Habilidades do Cazador: "+habilidades[i]);
		}
	}
	
	public void ataque(){
		System.out.println("Flecha de fogo\",\"Estocada Mortal\",\"Rede de caza\",\"Invocação de Lobos[Especial]");
	}
	
	public void MostrarVida() {
		setVidaP(2500);
	System.out.println(getVidaP());
	}

	@Override
	public void luta() {
		System.out.println("Escolha o ataque: ");
		setScolhia(scan.nextInt());
		habilidades();
		
		switch (getScolhia()){
		case 1: {
			
		}
		default:
		}
	}
}
