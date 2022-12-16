

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	final int originalTileSize = 16;
	final int scale =3;
	
	public final int tileSize = originalTileSize * scale;
	public final int maxScreenCol = 16;
	public final int maxScreenRow = 12;
	public final int screenWidth = tileSize * maxScreenCol;
	public final int screenHeight = tileSize * maxScreenRow;
	
	
	public final int maxWorldCol = 50;
	
	public final int maxWorldRow = 50;
	
	public final int worldWidth = tileSize * maxWorldCol;
	
	public final int worldHeight = tileSize * maxWorldRow;
	
	
	
	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth,screenHeight));
		this.setBackground(Color.BLUE);
		this.setDoubleBuffered(true);
		this.setFocusable(true);
	}
	
	
	
}
