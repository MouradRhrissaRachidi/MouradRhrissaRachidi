package CovidGame;

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class background extends JPanel {
	juego jueguito;
	private Image imagen;
public background(juego jueguito) {
	this.jueguito=jueguito;
	File miimagen =new File("src/background.png");
	try {
	imagen=ImageIO.read(miimagen);
	}
	catch(IOException e) {
		System.out.println("No se encontró la imagen background.png ");
	}
}
	public void paint(Graphics2D g) {
		super.paintComponents(g);
		g.drawImage(imagen,-40,-40,null);
	
	}
}


