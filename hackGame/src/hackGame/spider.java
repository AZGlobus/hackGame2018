package hackGame;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import hackGame.*;

public class spider extends enemy {
	private int health, damage, sightRange, attackRange;
	
	BufferedImage img; 
	
	public spider(int level) {
	
	health = level* 100;
	damage = 10;
	sightRange = 10;
	attackRange = 10;
	try {
		img = ImageIO.read(new File("spider.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}
}
