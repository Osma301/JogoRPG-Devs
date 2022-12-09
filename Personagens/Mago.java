

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
					return 10;
					
				case 2: //Soco
					return 8;
					
				case 3: //Fogo
					this.reduzirMP(30);
					return 30;
				
				case 4: //Gelo
					this.reduzirMP(30);
					return 30;
					
				case 5: //Raio
					this.reduzirMP(30);
					return 30;
					
				case 6: //Cura
					this.reduzirMP(30);
					this.setVidaP(this.getVidaP()+30);
					return 0;
		
					default:
						return 0;
						
				}
				
			}
}
