package JogoRPGDevs.src;



public class Mago extends Personagem implements personagemsInt{
		public Mago() {
			
			this.setVidaP(100);
			this.setDanoP(40);
			this.setLevelP(1);
			this.setXp(0);
			this.setMaxMp(30);
			this.setScolhia(1);
			
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
		
		public void atacar(int ataque) {
				switch(ataque) {
				case 1: //Ataque com bastao
					System.out.println("Ataque com bastão, seu adversário sofreu 10 pontos de dano");
					
					break;
				case 2: //Soco
					System.out.println("Ataque com soco, seu adversário sofreu 8 pontos de dano");
					break;
				case 3: //Fogo
					System.out.println("Ataque especial de fogo, você gastou 30mp com este ataque \n seu adversário sofreu 30 pontos de dano");
					this.reduzirMP(30);
					break;
				case 4: //Gelo
					System.out.println("Ataque especial de gelo, você gastou 30mp com este ataque \n seu adversário sofreu 30 pontos de dano");
					this.reduzirMP(30);
					break;
				case 5: //Raio
					System.out.println("Ataque especial de raio, você gastou 30mp com este ataque \n seu adversário sofreu 30 pontos de dano");
					this.reduzirMP(30);
					break;
				case 6: //Cura
					System.out.println("Ataque especial de cura, você gastou 30mp com este ataque \n você recuperou 30hp");
					
		
					default:
						break;
						
				}
				
			}

		@Override
		public void curar() {
			this.reduzirMP(30);
			setVidaP(getVidaP()+30);
		}

		@Override
		public void pasarDeNivel() {
			// TODO Auto-generated method stub
			if(getXp() > 10) {
				setLevelP(getLevelP()+1);
			}
		}
		@Override
		public void estadisticas() {
			getVidaP();
			getDanoP();
			getLevelP();
			getXp();
			getMaxMp();
			getScolhia();
		}
		

}
