package hackGame;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import hackGame.*;

public class spider extends enemy {
	private int health, damage, sightRange, attackRange, distance;
	BufferedImage img;
	
	
	

	@Override
	public void takeDamage(int hit) {
		health = health - hit;
		
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPosition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		if (distance <= attackRange) {
			player.takeDamage(damage);
		}
		
	}

	@Override
	public void getGraphic() {
		try {
			img = ImageIO.read(new File("spider.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
