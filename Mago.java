package JogoRPGDevs;

public class Mago extends Personagem implements RPG{
	@Override

	public void habilidades() {
		String habilidades[] = {"Bola de fogo","Raiu","Meteoro","Proyectil de agua"};
		for (int i = 0; i < habilidades.length; i++) {
			System.out.println("Habilidades do Mago: "+habilidades[i]);
		}
	}
	
	public void ataque(){
		System.out.println("Bola de fogo , Raiu , Meteoro , Proyectil de agua");
	}
	
}
