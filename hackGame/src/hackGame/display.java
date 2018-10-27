package hackGame;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import hackGame.*;

public class display {
	
	public void displayMap(map[][], length, width) {
		
		int panelWidth = 1000;
		int panelHeight = 1000;
		JPanel backgroundPanel = new JPanel();
		backgroundPanel.setLayout(null);
		backgroundPanel.setSize(panelWidth, panelHeight);
		for (int i = 0; i < length; i++) {
			for (int j = 0; i < width; j++) {
				BufferedImage img = ImageIO.read(imageSRC);
				
				
				
			}
		}
	}
}
