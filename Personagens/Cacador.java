
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
}
