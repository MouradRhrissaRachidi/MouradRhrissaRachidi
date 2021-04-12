package CovidGame;

import java.awt.*;
import javax.swing.*;

public class juego extends JPanel{

	background fondo=new background(this);
	covid1 cov1=new covid1(this);
	
public juego() {

}
	
public void paintComponent(Graphics g) {
	super.paintComponents(g);
	Graphics2D g2=(Graphics2D)g;
	dibujar(g2);
}

public void dibujar(Graphics2D g) {
	fondo.paint(g);
	cov1.paint(g);

	}

}






