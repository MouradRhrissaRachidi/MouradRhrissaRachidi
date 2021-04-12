package CovidGame;


import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
public class covid1 {
	juego jueguito;
	private Image imagen;
	private int x,y;
	public covid1(juego jueguito) {
		this.jueguito=jueguito;
		x=300;
		y=260;
		File miimagen =new File("src/covid.png");
		try {
		imagen=ImageIO.read(miimagen);
		}
		catch(IOException e) {
			System.out.println("No se encontró la imagen covid.png ");
		}
	}
	public void paint(Graphics2D g) {
		g.drawImage(imagen,x,y,null);
		}
	
	}
	
	
	


