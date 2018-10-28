package hackGame;

import java.awt.image.BufferedImage;

public interface entity {
	BufferedImage getGraphic();
	void remove();
	void update();	
}
