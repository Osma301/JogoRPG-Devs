import java.util.ArrayList;

public class Jogo {
private int nTurno;
private ArrayList<Boss> chefoes;
private ArrayList<Inimigo> inimigos;
private Personagem personagem;

public Jogo(int nTurno, Personagem personagem) {
	super();
	this.nTurno = nTurno;
	this.personagem = personagem;
}

public int getnTurno() {
	return nTurno;
}

public void setnTurno(int nTurno) {
	this.nTurno = nTurno;
}

public ArrayList<Boss> getChefoes() {
	return chefoes;
}

public void setChefoes(ArrayList<Boss> chefoes) {
	this.chefoes = chefoes;
}

public ArrayList<Inimigo> getInimigos() {
	return inimigos;
}

public void setInimigos(ArrayList<Inimigo> inimigos) {
	this.inimigos = inimigos;
}

public void turno() {
	
}

}
