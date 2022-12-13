package JogoRPGDevs;

import java.awt.Button;
import java.awt.Color;

import javax.swing.JFrame;


public class MainProject {
	public static void main(String[] args) {
		
		JFrame window = new JFrame();
		Button b = new Button();
		GamePanel gamePanel = new GamePanel();
		window.add(b);
		window.add(gamePanel);
		
		window.pack();
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		
		
	}
}
