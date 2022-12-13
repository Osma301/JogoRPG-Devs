<<<<<<<< HEAD:Cacador.java
package JogoRPGDevs;
========
package Personagens;

import Jogo.RPG;
>>>>>>>> fae82d397db6dda022be6af55bcb4c0660a791f7:src/Personagens/Cacador.java

public class Cacador extends Personagem implements RPG{
	@Override
	
	public void habilidades() {
		String habilidades[] = { "Flecha de fogo" , "Estocada Mortal" , "Rede de caza" ,"Invocação de Lobos[Especial]"};
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
	public void ataquesEspeciais() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ataquesNormais() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atacar() {
		
	}

	@Override
	public void receberDano() {
		// TODO Auto-generated method stub
		
	}
}
