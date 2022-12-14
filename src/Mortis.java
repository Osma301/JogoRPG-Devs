package JogoRPGDevs.src;

public class Mortis extends Boss{
	
	public int receberAtaque(int danoRecebido) {
		setVidaBoss(1000);
	
		return getVidaBoss() - danoRecebido;
	}
	
	public int vidaMortis() {
		setVidaBoss(1000);
		getReceberAtaque();
		return getVidaBoss() - receberAtaque(10);
	}
	
}
