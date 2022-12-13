<<<<<<<< HEAD:Mago.java
package JogoRPGDevs;
========
package Personagens;

>>>>>>>> fae82d397db6dda022be6af55bcb4c0660a791f7:src/Personagens/Mago.java


public class Mago extends Personagem{
public Mago() {
		
	}
	
		public void ataquesEspeciais() {
			String especiais[] = { "1 - Fogo", "2 - Gelo", "3 - Raio", "4 - Cura" };
			for (int i = 0; i < especiais.length; i++) {
				System.out.println("Ataques especiais: " + especiais[i]);
			}
		}

		public void ataquesNormais() {
			String normais[] = { "1 - Ataque com bastão , 2- Soco" };
			for (int i = 0; i < normais.length; i++) {
				System.out.println("Ataques normais: " + normais[i]);
			}
		}
		public int atacar(int ataque) {
				switch(ataque) {
				case 1: //Ataque com bastao
					System.out.println("Ataque com bastão, seu adversário sofreu 10 pontos de dano");
					return 10;
					
				case 2: //Soco
					System.out.println("Ataque com soco, seu adversário sofreu 8 pontos de dano");
					return 8;
					
				case 3: //Fogo
					System.out.println("Ataque especial de fogo, você gastou 30mp com este ataque \n seu adversário sofreu 30 pontos de dano");
					this.reduzirMP(30);
					return 30;
				
				case 4: //Gelo
					System.out.println("Ataque especial de gelo, você gastou 30mp com este ataque \n seu adversário sofreu 30 pontos de dano");
					this.reduzirMP(30);
					return 30;
				case 5: //Raio
					System.out.println("Ataque especial de raio, você gastou 30mp com este ataque \n seu adversário sofreu 30 pontos de dano");
					this.reduzirMP(30);
					return 30;
					
				case 6: //Cura
					System.out.println("Ataque especial de cura, você gastou 30mp com este ataque \n você recuperou 30hp");
					this.reduzirMP(30);
					this.setVidaP(this.getVidaP()+30);
					return 0;
		
					default:
						return 0;
						
				}
				
			}
}
