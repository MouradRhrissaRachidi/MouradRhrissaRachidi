package CovidGame;

import java.awt.Graphics2D;


import javax.swing.*;

public class principal extends JFrame{
public static void main(String []args) {  
	JFrame ventana=new JFrame("CovidGame");
	juego jueguito=new juego();
	ventana.add(jueguito);
	ventana.setSize(600,700);
	//centrar el frame
	ventana.setLocationRelativeTo(null);
	//Para que le usuario no agrande el tamaño del frame
	ventana.setResizable(false);
	ventana.setVisible(true);
	ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	while(true) {
		jueguito.repaint();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}